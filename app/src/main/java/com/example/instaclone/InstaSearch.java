package com.example.instaclone;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class InstaSearch extends Fragment {


    public InstaSearch() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_instasearch, container, false);
        LinearLayoutManager layoutManager=new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false);

        RecyclerView recyclerView=(RecyclerView)v.findViewById(R.id.searchrecycler);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(new SearchAdapter(new String[]{"IGTV", "Shop","Style","Decor","Comics",
                "Nature","TV & Movies","Architecture","Science & Tech","Art","Auto"}));

        return v;
    }

}
