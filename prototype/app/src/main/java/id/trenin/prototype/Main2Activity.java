//package id.trenin.prototype;
//
//import android.app.FragmentManager;
//import android.os.Bundle;
//import android.support.annotation.NonNull;
//import android.support.design.widget.BottomNavigationView;
//import android.support.v7.app.AppCompatActivity;
//import android.view.MenuItem;
//import android.widget.ImageView;
//import android.widget.Toast;
//
//import com.synnapps.carouselview.CarouselView;
//import com.synnapps.carouselview.ImageClickListener;
//import com.synnapps.carouselview.ImageListener;
//
//public class Main2Activity extends AppCompatActivity {
//
////    private TextView mTextMessage;
//
//    CarouselView carouselView;
//    int[] sampleImages = {R.drawable.image_1, R.drawable.image_2, R.drawable.image_3, R.drawable.image_4, R.drawable.image_5,R.drawable.image_6,R.drawable.image_7};
//
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.fragment_beranda);
//
////        mTextMessage = (TextView) findViewById(R.id.message);
//        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
//        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
//
//        carouselView = findViewById(R.id.carouselView);
//        carouselView.setPageCount(sampleImages.length);
//        carouselView.setImageListener(imageListener);
//
//        carouselView.setImageClickListener(new ImageClickListener() {
//            @Override
//            public void onClick(int position) {
//                Toast.makeText(Main2Activity    .this,"Clicked Item : "+ position ,Toast.LENGTH_SHORT).show();
//            }
//        });
//    }
//
//    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
//            = new BottomNavigationView.OnNavigationItemSelectedListener() {
//
//        @Override
//        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
//            FragmentManager fragmentManager = getFragmentManager();
////            fragmentManager.beginTransaction().replace(R.id.frame_layout, new NotifFragment()).commit();
//            switch (item.getItemId()) {
//                case R.id.nav_home:
////                    mTextMessage.setText(R.string.title_home);
//                    Toast.makeText(Main2Activity.this, "Home", Toast.LENGTH_SHORT).show();
//                    return true;
//                case R.id.nav_promo:
//                    Toast.makeText(Main2Activity.this, "promo", Toast.LENGTH_SHORT).show();
//                    return true;
//                case R.id.nav_about:
//                    Toast.makeText(Main2Activity.this, "about", Toast.LENGTH_SHORT).show();
//                    return true;
//                case R.id.nav_tour:
//                    Toast.makeText(Main2Activity.this, "about", Toast.LENGTH_SHORT).show();
//                    return true;
//            }
//            return false;
//        }
//    };
//
//    ImageListener imageListener = new ImageListener() {
//        @Override
//        public void setImageForPosition(int position, ImageView imageView) {
//            imageView.setImageResource(sampleImages[position]);
//        }
//    };
//
//}
