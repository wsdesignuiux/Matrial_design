package fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
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

import adapter.Contact_adapter;

import model.Contact_model;

public class ContactFragment extends Fragment {



    private Contact_adapter homepageAdapter3;
    private RecyclerView recyclerview;
    private ArrayList<Contact_model> propertpreferencesModelArrayList3;


    Integer[] image = {R.drawable.p, R.drawable.p, R.drawable.p, R.drawable.p,R.drawable.p,R.drawable.p,R.drawable.p};
    String[] text_letter = {"A", "b", "D", "b", "b","F","b"};
    String[] username = {"Peter Avis", "Oscar Armer", "Angel Dillon", "Arthur Dykes","Rosie Downey", "Roy Furse", "Oscar Farrier"};

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.recyclerview_contact, container, false);




        recyclerview = view.findViewById(R.id.recyclerview);
        RecyclerView.LayoutManager layoutManager3 = new LinearLayoutManager(getActivity());
        recyclerview.setLayoutManager(layoutManager3);
        recyclerview.setItemAnimator(new DefaultItemAnimator());

        propertpreferencesModelArrayList3 = new ArrayList<>();


        for (int i = 0; i < image.length; i++) {
            Contact_model view3 = new Contact_model(image[i],text_letter[i],username[i]);
            propertpreferencesModelArrayList3.add(view3);
        }
        homepageAdapter3 = new Contact_adapter(getActivity(), propertpreferencesModelArrayList3);
        recyclerview.setAdapter(homepageAdapter3);



        return view;

}


}
