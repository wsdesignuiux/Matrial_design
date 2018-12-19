package adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.amulyakhare.textdrawable.TextDrawable;
import com.amulyakhare.textdrawable.util.ColorGenerator;
import com.example.wolfsoft3.matrial_design.R;

import java.util.ArrayList;

import model.Item_Gmail_Model;
import model.Viewpager_Call_Histrory_Model;


/**
 * Created by wolfsoft3 on 30/8/18.
 */

public class Item_Gmail_Adapter extends RecyclerView.Adapter<Item_Gmail_Adapter.ViewHolder> {


    Context context;
    private ArrayList<Item_Gmail_Model> modelArrayList;

    public Item_Gmail_Adapter(Context context, ArrayList<Item_Gmail_Model> modelArrayList) {
        this.context = context;
        this.modelArrayList = modelArrayList;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_gmail, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {

        holder.titile.setText(modelArrayList.get(position).getTitile());

        holder.sub_titile.setText(modelArrayList.get(position).getSub_titile());
        holder.description.setText(modelArrayList.get(position).getDescription());




        String firstLetter = String.valueOf(modelArrayList.get(position).getTitile().charAt(0));

        ColorGenerator generator = ColorGenerator.MATERIAL; // or use DEFAULT


        int color = generator.getColor(modelArrayList.get(position));

        TextDrawable drawable = TextDrawable.builder()
                .buildRound(firstLetter, color);

        holder.image_view.setImageDrawable(drawable);



                if(position==1){
                    holder.linear_promotion.setVisibility(View.VISIBLE);
                    holder.viewline.setVisibility(View.VISIBLE);

                }






    }

    @Override
    public int getItemCount() {
        return modelArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView titile, sub_titile, description;
        ImageView image_view;
        LinearLayout linear_promotion;
        View viewline;

        public ViewHolder(View itemView) {
            super(itemView);

            titile = itemView.findViewById(R.id.titile);
            sub_titile = itemView.findViewById(R.id.sub_titile);
            description = itemView.findViewById(R.id.description);
            image_view = itemView.findViewById(R.id.image_view);
            linear_promotion = itemView.findViewById(R.id.linear_promotion);
            viewline = itemView.findViewById(R.id.viewline);
        }
    }
}
