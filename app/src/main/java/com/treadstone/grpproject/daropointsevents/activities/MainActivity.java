package com.treadstone.grpproject.daropointsevents.activities;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.snackbar.Snackbar;
import androidx.fragment.app.Fragment;
import androidx.appcompat.app.AppCompatActivity;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.treadstone.grpproject.daropointsevents.R;

import java.util.Objects;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;

import static androidx.navigation.ui.NavigationUI.setupWithNavController;
import static com.treadstone.grpproject.daropointsevents.utils.Constants.RC_CREDENTIALS_READ;
import static com.treadstone.grpproject.daropointsevents.utils.Constants.RC_CREDENTIALS_SAVE;
import static com.treadstone.grpproject.daropointsevents.utils.util.navAnimGone;
import static com.treadstone.grpproject.daropointsevents.utils.util.navAnimVisible;

public class MainActivity extends AppCompatActivity {
    private static final NavHostFragment navHostFragment = new NavHostFragment();
    private NavController navController = new NavController(this);
    private int currentFragmentId = 0;
    BottomNavigationView mNavigationBottom;
    BottomNavigationView mNavigationBottomAuth;
    private View view;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Toolbar toolbar = findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
        mNavigationBottom = findViewById(R.id.navigation);
        mNavigationBottomAuth = findViewById(R.id.navigationAuth);
        mNavigationBottomAuth.setVisibility(View.GONE);
        NavHostFragment navHostFragment = (NavHostFragment) getSupportFragmentManager().findFragmentById(R.id.frameContainer);
        NavigationUI.setupWithNavController(mNavigationBottom, navHostFragment.getNavController());
//        mNavigationBottom.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
//            @Override
//            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
//                switch (item.getItemId()){
//                    case R.id.profileFragment:
//                        mNavigationBottomAuth.setVisibility(View.VISIBLE);
//                        break;
//                }
//                return false;
//            }
//        });
    }

    private void handleNavigationVisibility(int id) {
        switch (id) {
            case R.id.apply_events:
                navController.navigate(R.id.apply_events);
                navAnimGone(mNavigationBottomAuth,this);
                navAnimVisible(mNavigationBottom, this);

                break;
            case R.id.eventsFragment:
                navController.navigate(R.id.eventsFragment);
                navAnimGone(mNavigationBottomAuth,this);
                navAnimVisible(mNavigationBottom, this);

                break;
            case R.id.profileFragment:
                navController.navigate(R.id.profileFragment);
                navAnimGone(mNavigationBottomAuth,this);
                navAnimVisible(mNavigationBottom, this);
                break;
            case R.id.orderUnderUserFragment:
                navController.navigate(R.id.orderUnderUserFragment);
                navAnimGone(mNavigationBottomAuth,this);
                navAnimVisible(mNavigationBottom, this);
                break;
            case R.id.invited_event:
                navController.navigate(R.id.invited_event);
                navAnimVisible(mNavigationBottom, this);

                break;
            default:
                //navAnimGone(mNavigationBottom, this);
        }
        switch (id) {
            case R.id.log_in:
                navAnimVisible(mNavigationBottom, this);
                break;
            case R.id.sign_up:
                navAnimVisible(mNavigationBottom, this);
                break;
            default:
                navAnimGone(mNavigationBottom, this);
        }

    }

    private void setupBottomNavigationMenu(NavController navController) {
        setupWithNavController(mNavigationBottom, navController);
        setupWithNavController(mNavigationBottomAuth, navController);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        switch (currentFragmentId) {
            case R.id.loginFragment:
                navController.popBackStack(R.id.eventsFragment, false);
                Snackbar.make(
                        view, getResources().getString(R.string.sign_canceled), Snackbar.LENGTH_SHORT
                ).show();
                break;
            case R.id.signUpFragment:
                navController.popBackStack(R.id.eventsFragment, false);
                Snackbar.make(
                        view, getResources().getString(R.string.sign_canceled), Snackbar.LENGTH_SHORT
                ).show();
                break;
            default:
                super.onBackPressed();
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == RC_CREDENTIALS_READ || requestCode == RC_CREDENTIALS_SAVE) {
        }
    }
    }


