package com.treadstone.grpproject.daropointsevents.utils;

import android.content.Context;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import android.view.View;
import android.view.animation.AnimationUtils;

import com.treadstone.grpproject.daropointsevents.R;

public class util {

    public void loadFragment(
            FragmentManager fragmentManager,
            Fragment fragment,
            int frameLayout,
            Boolean addToBackStack
    ) {
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction()
                .replace(frameLayout, fragment, fragment.getTag());
        if (addToBackStack) fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }

//    public void requireDrawable(@NonNull Context context, @DrawableRes int resId) =AppCompatResources
//            .getDrawable(context,resId)?:throw
//
//    IllegalStateException("Drawable should not be null")
//
//    fun getAnimFade():NavOptions
//
//    {
//        val builder = NavOptions.Builder()
//        builder.setEnterAnim(R.anim.fade_in)
//        builder.setExitAnim(R.anim.fade_out)
//        builder.setPopEnterAnim(R.anim.fade_in)
//        builder.setPopExitAnim(R.anim.fade_out)
//        return builder.build()
//    }
//
//    fun getAnimSlide():NavOptions
//
//    {
//        NavOptions.Builder builder = NavOptions.Builder()
//        builder.setEnterAnim(R.anim.slide_in_right)
//        builder.setExitAnim(R.anim.slide_out_left)
//        builder.setPopEnterAnim(R.anim.slide_in_left)
//        builder.setPopExitAnim(R.anim.slide_out_right)
//        return builder.build()
//    }

    public static void navAnimVisible(BottomNavigationView navigationView, Context context) {
        if (navigationView.getVisibility() == View.GONE) {
            navigationView.setVisibility(View.VISIBLE);
            navigationView.setAnimation(AnimationUtils.loadAnimation(context, R.anim.slide_up));

        }
    }


    public static void navAnimGone(BottomNavigationView mNavigationButton, Context context) {
        if (mNavigationButton.getVisibility() == View.VISIBLE) {
            mNavigationButton.setVisibility(View.GONE);
            mNavigationButton.setAnimation(AnimationUtils.loadAnimation(context, R.anim.slide_down));
        }
    }
}
