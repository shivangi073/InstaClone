package com.example.instaclone;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    private TextView mTextMessage;
    FragmentManager fm=this.getSupportFragmentManager();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView navView = findViewById(R.id.nav_view);
        mTextMessage = findViewById(R.id.message);
        navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);



    }
    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {

            switch (item.getItemId()) {
                case R.id.navigation_home:
                    Fragment home=new InstaHome();
                    fm.beginTransaction().replace(R.id.linearLayoutMainScreen,home).commit();


                     // mTextMessage.setText(R.string.title_home);
                    return true;
                case R.id.navigation_search:

                    Fragment search=new InstaSearch();
                    fm.beginTransaction().replace(R.id.linearLayoutMainScreen,search).commit();

                   // startActivity(new Intent(getApplicationContext(), InstaSearch.class));
                    // mTextMessage.setText(R.string.title_home);
                    return true;

                case R.id.navigation_add:

                    Fragment profile=new ProfileFragment();
                    fm.beginTransaction().replace(R.id.linearLayoutMainScreen,profile).commit();



                    // mTextMessage.setText(R.string.title_home);
                    return true;



                case R.id.navigation_dashboard:

                    Fragment profile1=new ProfileFragment();
                    fm.beginTransaction().replace(R.id.linearLayoutMainScreen,profile1).commit();

                    // startActivity(new Intent(getApplicationContext(), InstaHome.class));

                    return true;
                case R.id.navigation_profile:

                    Fragment profile2=new ProfileFragment();
                    fm.beginTransaction().replace(R.id.linearLayoutMainScreen,profile2).commit();

                    return true;
            }
            return false;
        }
    };


//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                             Bundle savedInstanceState) {
//        // Inflate the layout for this fragment
//        View view= inflater.inflate(R.layout.activity_main, container, false);
//
//        BottomNavigationView navView = view.findViewById(R.id.nav_view);
//        mTextMessage = view.findViewById(R.id.message);
//        navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
//        return view;
//    }




//    @NonNull
//    public FragmentTransaction beginTransaction() {
//        return null;
//    }
}
