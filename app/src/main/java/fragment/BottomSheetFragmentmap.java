package fragment;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomSheetBehavior;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;

import com.example.wolfsoft3.matrial_design.R;


public class BottomSheetFragmentmap extends Fragment implements View.OnClickListener {

    CardView cardview1, cardview2, cardview3;



    ImageView imageview1, imageview2, imageview3;
    FrameLayout linear1,linear2,linear3;
    View view1, view2, view3;


    public BottomSheetFragmentmap() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v = inflater.inflate(R.layout.bottombarsheetmap, container, false);
        cardview1 = v.findViewById(R.id.cardview1);
        cardview2 = v.findViewById(R.id.cardview2);
        cardview3 = v.findViewById(R.id.cardview3);

        view1 = v.findViewById(R.id.view1);
        view2 = v.findViewById(R.id.view2);
        view3 = v.findViewById(R.id.view3);

        imageview1 = v.findViewById(R.id.imageview1);
        imageview2 = v.findViewById(R.id.imageview2);
        imageview3 = v.findViewById(R.id.imageview3);


        linear1 = v.findViewById(R.id.linear1);
        linear2 = v.findViewById(R.id.linear2);
        linear3 = v.findViewById(R.id.linear3);


        cardview1.setOnClickListener(this);
        cardview2.setOnClickListener(this);
        cardview3.setOnClickListener(this);

        view1.setOnClickListener(this);
        view2.setOnClickListener(this);
        view3.setOnClickListener(this);


        imageview1.setOnClickListener(this);
        imageview2.setOnClickListener(this);
        imageview3.setOnClickListener(this);


        linear1.setOnClickListener(this);
        linear2.setOnClickListener(this);
        linear3.setOnClickListener(this);


        return v;

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        FrameLayout bottomSheet = (FrameLayout) getActivity().findViewById(R.id.bottomSheet1);
        BottomSheetBehavior sheetBehavior = BottomSheetBehavior.from(bottomSheet);
        sheetBehavior.setBottomSheetCallback(new BottomSheetBehavior.BottomSheetCallback() {
            @Override
            public void onStateChanged(@NonNull View bottomSheet, int newState) {
                if (BottomSheetBehavior.STATE_COLLAPSED == newState) {
                    Log.d("BOTTOMSHEET", "collapsed");
                } else {
                    Log.d("BOTTOMSHEET", String.valueOf(newState));
                }
            }

            @Override
            public void onSlide(@NonNull View bottomSheet, float slideOffset) {

            }
        });

        sheetBehavior.setState(BottomSheetBehavior.STATE_EXPANDED);


    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        view.findViewById(R.id.cardview1);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.linear1:

                cardview1.setVisibility(View.VISIBLE);
                cardview2.setVisibility(View.INVISIBLE);
                cardview3.setVisibility(View.INVISIBLE);

                imageview1.setColorFilter(Color.parseColor("#cb0000"));
                imageview2.setColorFilter(Color.parseColor("#95989a"));
                imageview3.setColorFilter(Color.parseColor("#95989a"));

                view1.setBackgroundColor(Color.parseColor("#cb0000"));
                view2.setBackgroundColor(Color.parseColor("#00000000"));
                view3.setBackgroundColor(Color.parseColor("#00000000"));



                break;


            case R.id.linear2:

                cardview1.setVisibility(View.INVISIBLE);
                cardview2.setVisibility(View.VISIBLE);
                cardview3.setVisibility(View.INVISIBLE);

                imageview1.setColorFilter(Color.parseColor("#95989a"));
                imageview2.setColorFilter(Color.parseColor("#cb0000"));
                imageview3.setColorFilter(Color.parseColor("#95989a"));

                view1.setBackgroundColor(Color.parseColor("#00000000"));
                view2.setBackgroundColor(Color.parseColor("#cb0000"));
                view3.setBackgroundColor(Color.parseColor("#00000000"));




                break;



            case R.id.linear3:


                cardview1.setVisibility(View.INVISIBLE);
                cardview2.setVisibility(View.INVISIBLE);
                cardview3.setVisibility(View.VISIBLE);


                imageview1.setColorFilter(Color.parseColor("#95989a"));
                imageview2.setColorFilter(Color.parseColor("#95989a"));
                imageview3.setColorFilter(Color.parseColor("#cb0000"));


                view1.setBackgroundColor(Color.parseColor("#00000000"));
                view2.setBackgroundColor(Color.parseColor("#00000000"));
                view3.setBackgroundColor(Color.parseColor("#cb0000"));


                break;
        }
    }
}