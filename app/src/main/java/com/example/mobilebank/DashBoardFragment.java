package com.example.mobilebank;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class DashBoardFragment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_board_fragment);

        BottomNavigationView bottomNavigationView = findViewById(R.id.btnav);
        bottomNavigationView.setOnNavigationItemSelectedListener(Listener);
        getSupportFragmentManager().beginTransaction().replace(R.id.container,new checkbalanceFrag()).commit();
    }
    private BottomNavigationView.OnNavigationItemSelectedListener Listener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment fragmentselected = null;
            switch (item.getItemId()){
                case R.id.ck:
                    fragmentselected = new checkbalanceFrag();
                    break;
                case R.id.wd:
                    fragmentselected = new withdrawFrag();
                    break;
            }
            getSupportFragmentManager().beginTransaction().replace(R.id.container,fragmentselected).commit();
            return true;
        }
    };

    public void check(View view) {
        Toast.makeText(this, "Function Unavailabe", Toast.LENGTH_SHORT).show();
    }

    public void withdraw(View view) {
        Toast.makeText(this, "Function Unavailabe", Toast.LENGTH_SHORT).show();
    }
}
