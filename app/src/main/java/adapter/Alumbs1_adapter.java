package adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import com.example.wolfsoft3.matrial_design.R;

import java.util.ArrayList;

import model.Alumbs1_model;

public class Alumbs1_adapter extends RecyclerView.Adapter<Alumbs1_adapter.ViewHolder> {

    Context context;
    ArrayList<Alumbs1_model> alumbs1_models;

    public Alumbs1_adapter(Context context, ArrayList<Alumbs1_model> alumbs1_models) {
        this.context = context;
        this.alumbs1_models = alumbs1_models;
    }

    @NonNull
    @Override
    public Alumbs1_adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_alumbs1,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Alumbs1_adapter.ViewHolder holder, int position) {

        holder.image1.setImageResource(alumbs1_models.get(position).getImage1());
        holder.tv1.setText(alumbs1_models.get(position).getTv1());
    }

    @Override
    public int getItemCount() {
        return alumbs1_models.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView image1;
        TextView tv1;
        public ViewHolder(View itemView) {
            super(itemView);

            image1 = itemView.findViewById(R.id.image1);
            tv1 = itemView.findViewById(R.id.tv1);
        }
    }
}
