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

import model.MessengerModel;


/**
 * Created by wolfsoft4 on 1/12/18.
 */

public class MessengerAdapter extends RecyclerView.Adapter<MessengerAdapter.ViewHolder>{

    Context context;
    private ArrayList<MessengerModel> messengerModelArrayList;


    public MessengerAdapter(Context context, ArrayList<MessengerModel> messengerModelArrayList) {
        this.context = context;
        this.messengerModelArrayList = messengerModelArrayList;
    }

    @Override
    public MessengerAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_messenger,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MessengerAdapter.ViewHolder holder, int position) {

        holder.profileimage.setImageResource(messengerModelArrayList.get(position).getProfileimage());
        holder.txtbirthdaygift.setText(messengerModelArrayList.get(position).getTxtbirthdaygift());
        holder.txtsandraadams.setText(messengerModelArrayList.get(position).getTxtsandraadams());
        holder.txtweek.setText(messengerModelArrayList.get(position).getTxtweek());
        holder.txtyear.setText(messengerModelArrayList.get(position).getTxtyear());


    }

    @Override
    public int getItemCount() {
        return messengerModelArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView profileimage;
        TextView txtbirthdaygift,txtsandraadams,txtweek,txtyear;

        public ViewHolder(View itemView) {
            super(itemView);

            profileimage=itemView.findViewById(R.id.profileimage);
            txtbirthdaygift=itemView.findViewById(R.id.txtbirthdaygift);
            txtsandraadams=itemView.findViewById(R.id.txtsandraadams);
            txtweek=itemView.findViewById(R.id.txtweek);
            txtyear=itemView.findViewById(R.id.txtyear);


        }
    }
}
