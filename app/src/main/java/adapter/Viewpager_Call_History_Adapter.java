package adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import com.example.wolfsoft3.matrial_design.R;

import java.util.ArrayList;

import model.Viewpager_Call_Histrory_Model;


/**
 * Created by wolfsoft3 on 30/8/18.
 */

    public class Viewpager_Call_History_Adapter extends RecyclerView.Adapter<Viewpager_Call_History_Adapter.ViewHolder> {


        Context context;
        private ArrayList<Viewpager_Call_Histrory_Model> modelArrayList;

    public Viewpager_Call_History_Adapter(Context context, ArrayList<Viewpager_Call_Histrory_Model> modelArrayList) {
        this.context = context;
        this.modelArrayList = modelArrayList;
    }





        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.viewpager_call_histrory,parent,false);
            return new ViewHolder(view);
        }

        @Override
        public void onBindViewHolder(final ViewHolder holder, final int position) {

            holder.name.setText(modelArrayList.get(position).getName());

           holder.image.setImageResource(modelArrayList.get(position).getImage());
           holder.misscall.setImageResource(modelArrayList.get(position).getMisscall());

        }

        @Override
        public int getItemCount() {
            return modelArrayList.size();
        }

        public class ViewHolder extends RecyclerView.ViewHolder {

            TextView name;
            ImageView image,misscall;

            public ViewHolder(View itemView) {
                super(itemView);

                name = itemView.findViewById(R.id.name);
                image = itemView.findViewById(R.id.image);
                misscall = itemView.findViewById(R.id.misscall);
            }
        }
    }
