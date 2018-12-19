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

import model.SearchModel;


/**
 * Created by wolfsoft4 on 28/11/18.
 */

public class RecySearchAdapter extends RecyclerView.Adapter<RecySearchAdapter.ViewHolder> {

    Context context;
    private ArrayList<SearchModel> searchModelArrayList;


    public RecySearchAdapter(Context context, ArrayList<SearchModel> searchModelArrayList) {
        this.context = context;
        this.searchModelArrayList = searchModelArrayList;
    }

    @Override
    public RecySearchAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recyler_search,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecySearchAdapter.ViewHolder holder, int position) {

        holder.img.setImageResource(searchModelArrayList.get(position).getImg());
        holder.imgmore.setImageResource(searchModelArrayList.get(position).getImgmore());
        holder.txtbeoplay.setText(searchModelArrayList.get(position).getTxtbeoplay());
        holder.txtbeoplay.setText(searchModelArrayList.get(position).getTxtbeoplay());
        holder.txtbang.setText(searchModelArrayList.get(position).getTxtbang());
        holder.txtprice.setText(searchModelArrayList.get(position).getTxtprice());


    }

    @Override
    public int getItemCount() {
        return searchModelArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView img,imgmore;
        TextView txtbeoplay,txtbang,txtprice;


        public ViewHolder(View itemView) {
            super(itemView);


            img=itemView.findViewById(R.id.img);
            imgmore=itemView.findViewById(R.id.imgmore);
            txtbeoplay=itemView.findViewById(R.id.txtbeoplay);
            txtbang=itemView.findViewById(R.id.txtbang);
            txtprice=itemView.findViewById(R.id.txtprice);


        }





    }
}
