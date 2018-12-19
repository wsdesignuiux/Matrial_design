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


import model.Contact_model;


public class Contact_adapter extends RecyclerView.Adapter<Contact_adapter.MyViewHolder> {


    private Context context;
    private ArrayList<Contact_model> propertpreferencesModelArrayList3;

    public Contact_adapter(Context context, ArrayList<Contact_model> propertpreferencesModelArrayList3) {
        this.context = context;
        this.propertpreferencesModelArrayList3 = propertpreferencesModelArrayList3;
    }

    @NonNull
    @Override
    public Contact_adapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_contact, parent, false);


        return new Contact_adapter.MyViewHolder(itemView);


    }

    @Override
    public void onBindViewHolder(@NonNull final Contact_adapter.MyViewHolder holder, final int position) {
        Contact_model modelfoodrecycler = propertpreferencesModelArrayList3.get(position);



        holder.image.setImageResource(modelfoodrecycler.getImage());


        holder.username.setText(modelfoodrecycler.getUsername());

       holder.text_letter.setText(modelfoodrecycler.getText_letter());
        if (position==0){
            holder.text_letter.setVisibility(View.VISIBLE);
        }else if (position==1) {
            holder.text_letter.setVisibility(View.INVISIBLE);
        } else if (position==2){
            holder.text_letter.setVisibility(View.VISIBLE);
        }else if (position==3){
            holder.text_letter.setVisibility(View.INVISIBLE);
        }else if (position==4){
            holder.text_letter.setVisibility(View.INVISIBLE);
        }else if (position==5)
        {
            holder.text_letter.setVisibility(View.VISIBLE);
        }else {
            holder.text_letter.setVisibility(View.INVISIBLE);
        }

    }

    @Override
    public int getItemCount() {
        return propertpreferencesModelArrayList3.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {



        TextView text_letter,username;
        ImageView image;


        public MyViewHolder(View itemView) {
            super(itemView);

            text_letter = itemView.findViewById(R.id.text_letter);
            username = itemView.findViewById(R.id.username);

            image = itemView.findViewById(R.id.image);

            }
    }
}
