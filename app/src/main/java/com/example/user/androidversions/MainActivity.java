package com.example.user.androidversions;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Creating reference of the class Toolbar.
    Toolbar toolbar;

    //Creating refereences of ImageView.
    ImageView addBtn,deleteBtn;

    //Creating reference of FloatingActionButton.
    FloatingActionButton versionListOpenerBtn;

    @SuppressLint("RestrictedApi")
    @Override
    //onCreate method.
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        //Setting content view.
        setContentView(R.layout.activity_main);

        //Setting toolbar reference to its ID.
        toolbar = (Toolbar)findViewById(R.id.toolbar);

        //Setting toolbar as a support action bar.
        setSupportActionBar(toolbar);

        //Setting the title of toolbar.
        toolbar.setTitle("Android Versions");

        //Setting the color of title.
        toolbar.setTitleTextColor(getResources().getColor(R.color.white));

        //Getting opyion menu as overflow icon.
        getSupportActionBar().openOptionsMenu();

        //Setting references with their IDs.
        addBtn=(ImageView)findViewById(R.id.add_icon);
        deleteBtn=(ImageView)findViewById(R.id.delete_icon);
        versionListOpenerBtn=(FloatingActionButton)findViewById(R.id.fab);


        //When ADD button on toolbar is clicked.
        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                //Displaying toast.
                Toast.makeText(getApplicationContext(),"ADD is Clicked",Toast.LENGTH_SHORT).show();
            }
        });

        //When DELETE button on toolbar is clicked.
        deleteBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                //Displaying toast.
                Toast.makeText(getApplicationContext(),"DELETE is Clicked",Toast.LENGTH_SHORT).show();
            }
        });

        //When Floating action button is clicked.
        versionListOpenerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Displaying toast.
                Toast.makeText(getApplicationContext(),"Opening Versions.",Toast.LENGTH_SHORT).show();

                //Creating Intent to change the activity.
                Intent changePage = new Intent(MainActivity.this,Versions.class);

                //Starting Activity.
                startActivity(changePage);

            }
        });

    }

    @Override
    //Method which is creating option Menu.
    public boolean onCreateOptionsMenu(Menu menu)
    {
        super.onCreateOptionsMenu(menu);

        //Adding elements to option menu.
        menu.add("Search");
        menu.add("Settings");

        return true;   //returning true.
    }

    @Override
    //Method when item in the option menu is clicked.
    public boolean onOptionsItemSelected(MenuItem item)
    {
        //Displaying Toast.
        Toast.makeText(getApplicationContext(),item.getTitle()+" is Clicked",Toast.LENGTH_SHORT).show();

        return true;    //returning true.
    }
}
