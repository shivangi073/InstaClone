package com.example.instaclone;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class SearchAdapter extends RecyclerView.Adapter<SearchAdapter.SearchViewHolder>{

    private String[] items;

    public SearchAdapter(String[] items) {
        this.items = items;
    }


    @NonNull
    @Override
    public SearchViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater=LayoutInflater.from(viewGroup.getContext());
     View view= (View) inflater.inflate(R.layout.item_search,viewGroup,false);
      return new SearchViewHolder(view);



    }

    @Override
    public void onBindViewHolder(@NonNull SearchViewHolder searchViewHolder, int position) {
        searchViewHolder.searchtype.setText(items[position]);

    }

    @Override
    public int getItemCount() {
        return items.length;
    }

    public class SearchViewHolder extends RecyclerView.ViewHolder {

       Button searchtype;
        public SearchViewHolder(@NonNull View itemView) {
            super(itemView);
            searchtype=(Button) itemView.findViewById(R.id.button);
        }
    }
}
