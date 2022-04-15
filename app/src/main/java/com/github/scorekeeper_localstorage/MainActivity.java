package com.github.scorekeeper_localstorage;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.mymenu, menu);
        return true;
    }

    /**
     * @param item:
     *            includes about section: developer information
     *            includes settings section: select score system
     * @return true
     */
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.about:
                Toast.makeText(this,"Dong, Phu Sang",Toast.LENGTH_SHORT).show();
                Toast.makeText(this,"A00223629",Toast.LENGTH_SHORT).show();
                Toast.makeText(this,"IOT1009",Toast.LENGTH_SHORT).show();
                Toast.makeText(this,"Good Bye",Toast.LENGTH_SHORT).show();
                return true;
            // case R.id.settings
        }
        return super.onOptionsItemSelected(item);
    }
}