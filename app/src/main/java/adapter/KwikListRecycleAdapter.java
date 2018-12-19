package adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.wolfsoft3.matrial_design.Albums1Activity;
import com.example.wolfsoft3.matrial_design.Call;
import com.example.wolfsoft3.matrial_design.Calls_History;
import com.example.wolfsoft3.matrial_design.Chat;
import com.example.wolfsoft3.matrial_design.Collapsing_Contacts;
import com.example.wolfsoft3.matrial_design.Contact;
import com.example.wolfsoft3.matrial_design.DownloadsCopyActivity;
import com.example.wolfsoft3.matrial_design.EmptyState1Activity;
import com.example.wolfsoft3.matrial_design.Gmail;
import com.example.wolfsoft3.matrial_design.Mail;
import com.example.wolfsoft3.matrial_design.Maps;
import com.example.wolfsoft3.matrial_design.MessageemptystatesActivity;
import com.example.wolfsoft3.matrial_design.Messanger;
import com.example.wolfsoft3.matrial_design.Navigation_Drawer;
import com.example.wolfsoft3.matrial_design.NewEvent;
import com.example.wolfsoft3.matrial_design.Photos1Activity;
import com.example.wolfsoft3.matrial_design.ProfileCpy;
import com.example.wolfsoft3.matrial_design.R;
import com.example.wolfsoft3.matrial_design.Route;
import com.example.wolfsoft3.matrial_design.SearchResult;
import com.example.wolfsoft3.matrial_design.SearchResult1Activity;
import com.example.wolfsoft3.matrial_design.Setting1;
import com.example.wolfsoft3.matrial_design.Settings2;
import com.example.wolfsoft3.matrial_design.Walkthrough1Activity;

import java.util.List;

import model.KwikListModelClass;


public class KwikListRecycleAdapter extends RecyclerView.Adapter<KwikListRecycleAdapter.MyViewHolder> {

    Context context;


    private List<KwikListModelClass> OfferList;


    public class MyViewHolder extends RecyclerView.ViewHolder {


        TextView title;


        public MyViewHolder(View view) {
            super(view);

            title = (TextView) view.findViewById(R.id.title);


        }

    }


    public KwikListRecycleAdapter(Context context, List<KwikListModelClass> offerList) {
        this.OfferList = offerList;
        this.context = context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_kwik_list, parent, false);


        return new MyViewHolder(itemView);


    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {
        KwikListModelClass lists = OfferList.get(position);
        holder.title.setText(lists.getTitle());


        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (position == 0) {
                    Intent i = new Intent(context, Calls_History.class);
                    context.startActivity(i);
                } else if (position == 1) {
                    Intent i = new Intent(context, Call.class);
                    context.startActivity(i);
                } else if (position == 2) {
                    Intent i = new Intent(context, Mail.class);
                    context.startActivity(i);
                } else if (position == 3) {
                    Intent i = new Intent(context, Gmail.class);
                    context.startActivity(i);
                }else if (position == 4) {
                    Intent i = new Intent(context, Navigation_Drawer.class);
                    context.startActivity(i);
                } else if (position == 5) {
                    Intent i = new Intent(context, Route.class);
                    context.startActivity(i);
                } else if (position == 6) {
                    Intent i = new Intent(context, Collapsing_Contacts.class);
                    context.startActivity(i);
                } else if (position == 7) {
                    Intent i = new Intent(context, Contact.class);
                    context.startActivity(i);
                } else if (position == 8) {
                    Intent i = new Intent(context, Maps.class);
                    context.startActivity(i);
                } else if (position == 9) {
                    Intent i = new Intent(context, NewEvent.class);
                    context.startActivity(i);
                } else if (position == 10) {
                    Intent i = new Intent(context, Setting1.class);
                    context.startActivity(i);
                } else if (position == 11) {
                    Intent i = new Intent(context, Chat.class);
                    context.startActivity(i);
                } else if (position == 12) {
                    Intent i = new Intent(context, Messanger.class);
                    context.startActivity(i);
                } else if (position == 13) {
                    Intent i = new Intent(context, ProfileCpy.class);
                    context.startActivity(i);
                } else if (position == 14) {
                    Intent i = new Intent(context, SearchResult.class);
                    context.startActivity(i);
                } else if (position == 15) {
                    Intent i = new Intent(context, Settings2.class);
                    context.startActivity(i);
                } else if (position == 16) {
                    Intent i = new Intent(context, Albums1Activity.class);
                    context.startActivity(i);
                }else if (position == 17) {
                    Intent i = new Intent(context, DownloadsCopyActivity.class);
                    context.startActivity(i);
                }else if (position == 18) {
                    Intent i = new Intent(context, EmptyState1Activity.class);
                    context.startActivity(i);
                }else if (position == 19) {
                    Intent i = new Intent(context, MessageemptystatesActivity.class);
                    context.startActivity(i);
                }else if (position == 20) {
                    Intent i = new Intent(context, Photos1Activity.class);
                    context.startActivity(i);
                }else if (position == 21) {
                    Intent i = new Intent(context, SearchResult1Activity.class);
                    context.startActivity(i);
                }else if (position == 22) {
                    Intent i = new Intent(context, Walkthrough1Activity.class);
                    context.startActivity(i);
                }

            }

        });


    }


    @Override
    public int getItemCount() {
        return OfferList.size();

    }

}


