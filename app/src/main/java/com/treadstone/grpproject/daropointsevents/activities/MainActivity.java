package com.treadstone.grpproject.daropointsevents.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.text.Layout;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.treadstone.grpproject.daropointsevents.R;

import java.util.Objects;

import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;

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
//        Fragment hostFragment = getSupportFragmentManager().findFragmentById(R.id.frameContainer);
//        final NavController navController = Navigation.findNavController(this, R.id.frameContainer);
//        mNavigationBottom.setOnClickListener((View v) -> {
//            navController.navigate(R.id.action_settings);
//        });
      view = findViewById(R.id.mainFragmentCoordinatorLayout);
        Fragment hostFragment = getSupportFragmentManager().findFragmentById(R.id.frameContainer);
        assert hostFragment != null;
        if (Objects.equals(hostFragment.getHost(), navHostFragment))
        navController = navHostFragment.getNavController();
        setupBottomNavigationMenu(navController);

        navController.addOnDestinationChangedListener((controller, destination, arguments) -> {
            currentFragmentId = destination.getId();
            handleNavigationVisibility(currentFragmentId) ;
        });
    }

    private void handleNavigationVisibility(int id) {
        switch (id) {
            case R.id.apply_events:
                navAnimVisible(mNavigationBottom, this);
                break;
            case R.id.searchFragment:
                navAnimVisible(mNavigationBottom, this);

                break;
            case R.id.profileFragment:
                navAnimVisible(mNavigationBottom, this);

                break;
            case R.id.orderUnderUserFragment:
                navAnimVisible(mNavigationBottom, this);

                break;
            case R.id.favoriteFragment:
                navAnimVisible(mNavigationBottom, this);

                break;
            default:
                navAnimGone(mNavigationBottom, this);
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
                        view, getString(R.id.sign_canceled), Snackbar.LENGTH_SHORT
                ).show();
                break;
            case R.id.signUpFragment:
                navController.popBackStack(R.id.eventsFragment, false);
                Snackbar.make(
                        view, getString(R.id.sign_canceled), Snackbar.LENGTH_SHORT
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


