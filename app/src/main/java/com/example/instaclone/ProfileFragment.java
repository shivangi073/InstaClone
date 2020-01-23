package com.example.instaclone;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class ProfileFragment extends Fragment {

    private ArrayList<String> names=new ArrayList<>();
    private ArrayList<String> imagesurl=new ArrayList<>();


    public ProfileFragment() {
        // Required empty public constructor
    }

    private void getImages(){
        imagesurl.add("https://c1.staticflickr.com/5/4636/25316407448_de5fbf183d_o.jpg");
        names.add("Havasu Falls");

        imagesurl.add("https://i.redd.it/tpsnoz5bzo501.jpg");
        names.add("Trondheim");

        imagesurl.add("https://i.redd.it/qn7f9oqu7o501.jpg");
        names.add("Portugal");

        imagesurl.add("https://i.redd.it/j6myfqglup501.jpg");
        names.add("Rocky Mountain");

        imagesurl.add("https://i.redd.it/0h2gm1ix6p501.jpg");
        names.add("Mahahual");

        imagesurl.add("https://i.redd.it/k98uzl68eh501.jpg");
        names.add("Frozen Lake");

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_profile, container, false);

        getImages();
        LinearLayoutManager layoutManager=new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false);

        RecyclerView recyclerView=(RecyclerView)v.findViewById(R.id.recycler_list);
        recyclerView.setLayoutManager(layoutManager);

        HorizontalAdapter adapter=new HorizontalAdapter(getContext(),names,imagesurl);
        recyclerView.setAdapter(adapter);


        return v;

    }

}
