package com.treadstone.grpproject.daropointsevents.activities;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.treadstone.grpproject.daropointsevents.R;
import com.treadstone.grpproject.daropointsevents.utils.Utils;

import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;


import static androidx.navigation.ui.NavigationUI.setupWithNavController;
import static com.treadstone.grpproject.daropointsevents.utils.Constants.RC_CREDENTIALS_READ;
import static com.treadstone.grpproject.daropointsevents.utils.Constants.RC_CREDENTIALS_SAVE;
import static com.treadstone.grpproject.daropointsevents.utils.Utils.navAnimGone;
import static com.treadstone.grpproject.daropointsevents.utils.Utils.navAnimVisible;

public class MainActivity extends AppCompatActivity {
    private static final NavHostFragment navHostFragment = new NavHostFragment();
    private NavController navController = new NavController(this);
    private int currentFragmentId = 0;
    BottomNavigationView mNavigationBottom;
    BottomNavigationView mNavigationBottomAuth;
    private View view;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppTheme);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Toolbar toolbar = findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
        mNavigationBottom = findViewById(R.id.navigation);
        mNavigationBottomAuth = findViewById(R.id.navigationAuth);

        NavHostFragment navHostFragment = (NavHostFragment) getSupportFragmentManager().findFragmentById(R.id.frameContainer);
        setupBottomNavigationMenu(navHostFragment.getNavController());
        view = findViewById(R.id.mainFragmentCoordinatorLayout);

        navController = navHostFragment.getNavController();
        navController.addOnDestinationChangedListener((controller, destination, arguments) -> {
            currentFragmentId = destination.getId();

            if (currentFragmentId == R.id.profile_fragment) {
                String args = getString(R.string.log_in_first);
                Bundle b = new Bundle();
                b.putString("LogIn First", args);
                navController.navigate(R.id.log_in, b, Utils.getAnimFade());
                handleNavigationVisibility(currentFragmentId);
            } else {

                handleNavigationVisibility(currentFragmentId);
            }

        });
    }

    private void handleNavigationVisibility(int id) {
        if (id == R.id.welcomeFragment || id == R.id.apply_events || id == R.id.eventsFragment || id == R.id.profile_fragment ||
                id == R.id.orderUnderUserFragment || id == R.id.invited_event) {
            navAnimVisible(mNavigationBottom, this);

        } else {
            navAnimGone(mNavigationBottom, this);
        }
        if (id == R.id.log_in || id == R.id.sign_up) {
            navAnimVisible(mNavigationBottomAuth, this);

        } else {
            navAnimGone(mNavigationBottomAuth, this);
        }


    }

    private void setupBottomNavigationMenu(NavController navController) {
        setupWithNavController(mNavigationBottom, navController);
        setupWithNavController(mNavigationBottomAuth, navController);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        if (currentFragmentId == R.id.log_in || currentFragmentId == R.id.sign_up) {

            navController.popBackStack(R.id.eventsFragment, false);
            Snackbar.make(
                    view, R.string.sign_in_canceled, Snackbar.LENGTH_SHORT
            ).show();
            navController.navigate(R.id.eventsFragment);

        } else {

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


