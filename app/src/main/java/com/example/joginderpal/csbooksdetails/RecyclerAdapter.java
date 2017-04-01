package com.example.joginderpal.csbooksdetails;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by joginderpal on 01-04-2017.
 */
public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {


    List<String> li;
    Context ctx;


    public RecyclerAdapter(List<String> li,Context ctx) {

        this.li=li;
        this.ctx=ctx;
    }

    class ViewHolder extends RecyclerView.ViewHolder{
        private int currentitem;
        public ImageView image;

        public ViewHolder(View itemView) {
            super(itemView);
          image= (ImageView) itemView.findViewById(R.id.image_books);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int position=getAdapterPosition();
                 //   Intent i=new Intent(ctx,second.class);
                 //   i.putExtra("link",li1.get(position));
                 //   ctx.startActivity(i);

                }
            });
        }
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.card_layout,parent,false);
        RecyclerView.ViewHolder v=new ViewHolder(view);
        return (ViewHolder) v;
    }

    @Override
    public void onBindViewHolder(RecyclerAdapter.ViewHolder holder, int position) {

        Picasso.with(ctx).load("http://it-ebooks.info"+li.get(position)).fit().into(holder.image);

    }

    @Override
    public int getItemCount() {
        return li.size();
    }

}
