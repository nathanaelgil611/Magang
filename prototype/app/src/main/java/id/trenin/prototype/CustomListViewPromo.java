package id.trenin.prototype;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class CustomListViewPromo extends ArrayAdapter<String> {

    private String[] namaTempat;
    private int[] img;
    private Activity context;

    public CustomListViewPromo(Activity context, String[] namaTempat, int[] img) {
        super(context, R.layout.list_promo, namaTempat);

        this.context = context;
        this.namaTempat = namaTempat;
        this.img = img;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View r = convertView;
        ViewHolder viewHolder = null;
        final ViewHolder viewHolderFinal = viewHolder;

        if(r==null){
            LayoutInflater layoutInflater = context.getLayoutInflater();
            r = layoutInflater.inflate(R.layout.list_promo,null,true);//ambil xml nya buat dimasukin ke listview nya ini
            viewHolder = new ViewHolder(r);
            r.setTag(viewHolder);
        }
        else{
            viewHolder = (CustomListViewPromo.ViewHolder) r.getTag();
        }
        viewHolder.namaMinuman.setText(namaTempat[position]);//nge set nama minuman
        viewHolder.img.setImageResource(img[position]);

//        viewHolder.cardViewDetail.setVisibility(View.VISIBLE);

        viewHolder.buyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { // bikin dialog buat pesen minuman brp buah
                Toast.makeText(context, "Masuk Ke pembelian", Toast.LENGTH_SHORT).show();
            }
        });

        return r;



    }

    class ViewHolder{
        TextView namaMinuman;
        ImageView img;
        CardView menuMinuman;
        TextView tanggalKeberangkatan;
        Button buyBtn;

        ViewHolder(View v){
            namaMinuman = v.findViewById(R.id.namaTempat);
            img = v.findViewById(R.id.img);
            menuMinuman = v.findViewById(R.id.cardViewPromo);
            tanggalKeberangkatan = v.findViewWithTag(R.id.tanggalKeberangkatan);
            buyBtn = v.findViewById(R.id.book_btn);
        }

    }

}
