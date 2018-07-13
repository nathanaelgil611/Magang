package id.trenin.prototype;

import android.app.DatePickerDialog;
import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageClickListener;
import com.synnapps.carouselview.ImageListener;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class BerandaFragment extends Fragment {

    CarouselView carouselView;
    int[] sampleImages = {R.drawable.image_1, R.drawable.image_2, R.drawable.image_3, R.drawable.image_4, R.drawable.image_5,R.drawable.image_6,R.drawable.image_7};

    EditText tanggalMulai;
    EditText tanggalAkhir;

    Calendar myCalendar1;
    DatePickerDialog.OnDateSetListener date1;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
//        return super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.fragment_beranda, container,false);

        carouselView = view.findViewById(R.id.carouselView);
        carouselView.setPageCount(sampleImages.length);
        carouselView.setImageListener(imageListener);

        carouselView.setImageClickListener(new ImageClickListener() {
            @Override
            public void onClick(int position) {
                Toast.makeText(getActivity(),"Clicked Item : "+ position ,Toast.LENGTH_SHORT).show();
            }
        });

        /*
        * carousel
        */

        tanggalMulai = (EditText) view.findViewById(R.id.tanggalMulai);
        tanggalAkhir = (EditText) view.findViewById(R.id.tanggalAkhir);
        myCalendar1 = Calendar.getInstance();

         date1 = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int month, int day) {
                myCalendar1.set(Calendar.YEAR,year);
                myCalendar1.set(Calendar.MONTH,month);
                myCalendar1.set(Calendar.DAY_OF_MONTH,day);
                updateLabel();
            }
        };

        tanggalMulai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new DatePickerDialog(getActivity(),date1,myCalendar1.get(Calendar.YEAR),myCalendar1.get(Calendar.MONTH),myCalendar1.get(Calendar.DAY_OF_MONTH)).show();
            }
        });


        /*
        * Date Picker
        * */

        return view;
    }

    private void updateLabel() {
        String myFormat = "MM/dd/yy"; //In which you need put here
        SimpleDateFormat sdf = new SimpleDateFormat(myFormat, Locale.US);

        tanggalMulai.setText(sdf.format(myCalendar1.getTime()));
    }

    ImageListener imageListener = new ImageListener() {
        @Override
        public void setImageForPosition(int position, ImageView imageView) {
            imageView.setImageResource(sampleImages[position]);
        }
    };
}
