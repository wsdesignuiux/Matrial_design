package fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.wolfsoft3.matrial_design.R;

import java.util.ArrayList;

import adapter.Viewpager_Call_History_Adapter;
import model.Viewpager_Call_Histrory_Model;


/**
 * Created by wolfsoft3 on 2/8/18.
 */

public class Viewpager_call_histrory_Fragment extends Fragment {

    private Viewpager_Call_History_Adapter item_upcomming_adapter;
    private RecyclerView recyclerview;
    private ArrayList<Viewpager_Call_Histrory_Model> modelArrayList;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.recycler_viewpager_call_history,container,false);




        recyclerview = (RecyclerView) view.findViewById(R.id.recycler_call_history);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerview.setLayoutManager(layoutManager);


        modelArrayList = new ArrayList<>();

        modelArrayList.add(new Viewpager_Call_Histrory_Model("Lelia Colon",R.drawable.girlreading,R.drawable.misscall_icon));
        modelArrayList.add(new Viewpager_Call_Histrory_Model("Alex Nelson",R.drawable.girlreading,R.drawable.ic_green_icon));
        modelArrayList.add(new Viewpager_Call_Histrory_Model("+7 917 722-88-99",R.drawable.girlreading,R.drawable.outgoing));
        modelArrayList.add(new Viewpager_Call_Histrory_Model("Mary Johnson",R.drawable.girlreading,R.drawable.misscall_icon));




        item_upcomming_adapter = new Viewpager_Call_History_Adapter(getActivity(), modelArrayList);
        recyclerview.setAdapter(item_upcomming_adapter);



        return view;
    }
}
