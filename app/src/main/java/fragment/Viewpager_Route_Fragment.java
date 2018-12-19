package fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
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

public class Viewpager_Route_Fragment extends Fragment {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.viewpager_route,container,false);
        return view;
    }
}
