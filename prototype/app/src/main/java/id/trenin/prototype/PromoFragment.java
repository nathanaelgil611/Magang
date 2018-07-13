package id.trenin.prototype;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public class PromoFragment extends Fragment {
    ListView listPromo;
    String[] namaTempat ={"GUNUNG PELANGI CELHUM EXCLUSIVE","3 NEGARA (TH,MY,SG)"};

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
//        return super.onCreateView(inflater, container, savedInstanceState);

        int[] img = new int[]{R.drawable.image_1,R.drawable.image_2};

        View view = inflater.inflate(R.layout.fragment_promo, container,false);

        listPromo = (ListView) view.findViewById(R.id.listview_promo);

        CustomListViewPromo customListViewPromo = new CustomListViewPromo(getActivity(), namaTempat,img);
        listPromo.setAdapter(customListViewPromo);

        return view;
    }
}
