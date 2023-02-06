package com.example.navigationview;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.MenuItem;
public class MainActivityNaview extends AppCompatActivity{
    @Override
protected void onCreate(Bundle savedInstanceState){
    super.onCreate(savedInstanceState);
    setContentView(R.layout.mainnavigationview);

    Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar2);
    setSupportActionBar(toolbar);

    getSupportActionBar().setHomeAsUpIndicator(R.drawable.iconhome);
    getSupportActionBar().setDisplayHomeAsUpEnabled(true);

}
        @Override
        public boolean onOptionsItemSelected(MenuItem item) {
            switch (item.getItemId()) {
                case android.R.id.home:
                    DrawerLayout drawerLayout= (DrawerLayout)findViewById(R.id.drawer_layout);
                    drawerLayout.openDrawer(GravityCompat.START);
                    return true;
                default:
                    return super.onOptionsItemSelected(item);
            }
        }

}
