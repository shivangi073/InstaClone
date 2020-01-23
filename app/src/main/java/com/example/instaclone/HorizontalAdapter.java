package com.example.instaclone;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class HorizontalAdapter extends RecyclerView.Adapter<HorizontalAdapter.HorizontalViewHolder> {

 //   private String[] items;
    private ArrayList<String> names=new ArrayList<>();
    private ArrayList<String> imagesurl=new ArrayList<>();
    private Context mcontext;

    public HorizontalAdapter(Context context, ArrayList<String> names, ArrayList<String> imagesurl) {
        this.names = names;
        this.imagesurl = imagesurl;
        this.mcontext=context;
    }

    @NonNull
    @Override
    public HorizontalViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        LayoutInflater inflater=LayoutInflater.from(viewGroup.getContext());
        View view= (View) inflater.inflate(R.layout.item_list_for_recyler_view,viewGroup,false);
        return new HorizontalViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull HorizontalViewHolder horizontalViewHolder, final int position) {
       // horizontalViewHolder.circleImageView;

        Glide.with(mcontext)
                .asBitmap()
                .load(imagesurl.get(position))
                .into(horizontalViewHolder.circleImageView);

        horizontalViewHolder.name.setText(names.get(position));

        horizontalViewHolder.circleImageView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Toast.makeText(mcontext,names.get(position),Toast.LENGTH_LONG).show();
            }

        });

    }

    @Override
    public int getItemCount() {
        return imagesurl.size();
    }

    public class HorizontalViewHolder extends RecyclerView.ViewHolder {
        CircleImageView circleImageView;
        TextView name;
        public HorizontalViewHolder(@NonNull View itemView) {
            super(itemView);
            circleImageView=(CircleImageView)itemView.findViewById(R.id.story_image);
            name=(TextView)itemView.findViewById(R.id.textView);
        }
    }
}
