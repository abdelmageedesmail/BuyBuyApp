package com.example.ahmed.buybuyapp.Activities;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Spinner;

import com.example.ahmed.buybuyapp.Adapters.TobDealsAdapter;
import com.example.ahmed.buybuyapp.Fragments.FragmentDrawer;
import com.example.ahmed.buybuyapp.R;

public class HomePageRecycle extends AppCompatActivity {

    DrawerLayout mDrawerLayout;
    FragmentDrawer drawerFragment;
    Toolbar toolbar;
    RecyclerView topDealsLists,bestSellerLists;
    Spinner spCountry;
    ImageView ivCart,ivProfile;
    FrameLayout ivMobileAndTabs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page_recycle);
        toolbar = (Toolbar) findViewById(R.id.toolbar_search);
        mDrawerLayout = (DrawerLayout) findViewById(R.id.mDrawer);
        drawerFragment = (FragmentDrawer)
                getSupportFragmentManager().findFragmentById(R.id.fragment_navigation_drawer);
        drawerFragment.setUp(R.id.fragment_navigation_drawer, mDrawerLayout, toolbar);
        topDealsLists=(RecyclerView) findViewById(R.id.topDealsLists);
        bestSellerLists=(RecyclerView) findViewById(R.id.bestSellerLists);
        spCountry=(Spinner) findViewById(R.id.spCountry);
        ivProfile=(ImageView) findViewById(R.id.ivProfile);
        ivMobileAndTabs=(FrameLayout) findViewById(R.id.ivMobileAndTabs);

        ivCart=findViewById(R.id.ivCart);

        ivMobileAndTabs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomePageRecycle.this,FromHomeCategoriesActivity.class));
            }
        });
        ivCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomePageRecycle.this,MyOrdersActivity.class));
            }
        });

        ivProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomePageRecycle.this,ProfileActivity.class));
            }
        });

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this, android.R.layout.simple_spinner_item, getResources().getStringArray(R.array.country_arrays));
        spCountry.setAdapter(adapter);
        topDealsLists.setAdapter(new TobDealsAdapter(this));
        topDealsLists.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));

        bestSellerLists.setAdapter(new TobDealsAdapter(this));
        bestSellerLists.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
    }
    /**
     * Initialize searchBar.
     */
//    private void initSearchBar() {
//        searchToolBar = (Toolbar) findViewById(R.id.toolbar_search);
//        if (searchToolBar != null) {
//            searchToolBar.setNavigationIcon(R.drawable.ic_arrow_back_white_24dp);
//            searchAppBarLayout.setVisibility(View.GONE);
//            searchToolBar.setNavigationOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View view) {
//                    hideSearchBar(positionFromRight);
//                }
//            });
//        }
//    }





    /**
     * to show the searchAppBarLayout and hide the mainAppBar with animation.
     *
     * @param positionFromRight
     */
//    private void showSearchBar(float positionFromRight) {
//        AnimatorSet set = new AnimatorSet();
//        set.playTogether(
//                ObjectAnimator.ofFloat(appBar, "translationY", -tabLayout.getHeight()),
//                ObjectAnimator.ofFloat(viewPager, "translationY", -tabLayout.getHeight()),
//                ObjectAnimator.ofFloat(appBar, "alpha", 0)
//        );
//        set.setDuration(100).addListener(new com.nineoldandroids.animation.Animator.AnimatorListener() {
//            @Override
//            public void onAnimationStart(com.nineoldandroids.animation.Animator animation) {
//
//            }
//
//            @Override
//            public void onAnimationEnd(com.nineoldandroids.animation.Animator animation) {
//                appBar.setVisibility(View.GONE);
//                searchEditText.requestFocus();
//                Utils.showKeyBoard(searchEditText);
//            }
//
//            @Override
//            public void onAnimationCancel(com.nineoldandroids.animation.Animator animation) {
//
//            }
//
//            @Override
//            public void onAnimationRepeat(com.nineoldandroids.animation.Animator animation) {
//
//            }
//        });
//        set.start();
//
//
//        // start x-index for circular animation
//        int cx = toolbar.getWidth() - (int) (getResources().getDimension(R.dimen.dp48)* (0.5f + positionFromRight));
//        // start y-index for circular animation
//        int cy = (toolbar.getTop() + toolbar.getBottom()) / 2;
//
//        // calculate max radius
//        int dx = Math.max(cx, toolbar.getWidth() - cx);
//        int dy = Math.max(cy, toolbar.getHeight() - cy);
//        float finalRadius = (float) Math.hypot(dx, dy);
//
//        // Circular animation declaration begin
//        final Animator animator;
//        animator = io.codetail.animation.ViewAnimationUtils
//                .createCircularReveal(searchAppBarLayout, cx, cy, 0, finalRadius);
//        animator.setInterpolator(new AccelerateDecelerateInterpolator());
//        animator.setDuration(200);
//        searchAppBarLayout.setVisibility(View.VISIBLE);
//        animator.start();
//        // Circular animation declaration end
//    }
//

    /**
     * to hide the searchAppBarLayout and show the mainAppBar with animation.
     *
     * @param positionFromRight
     */
//    private void hideSearchBar(float positionFromRight) {
//
//        // start x-index for circular animation
//        int cx = toolbar.getWidth() - (int) (getResources().getDimension(R.dimen.dp48) * (0.5f + positionFromRight));
//        // start  y-index for circular animation
//        int cy = (toolbar.getTop() + toolbar.getBottom()) / 2;
//
//        // calculate max radius
//        int dx = Math.max(cx, toolbar.getWidth() - cx);
//        int dy = Math.max(cy, toolbar.getHeight() - cy);
//        float finalRadius = (float) Math.hypot(dx, dy);
//
//        // Circular animation declaration begin
//        Animator animator;
//        animator = io.codetail.animation.ViewAnimationUtils
//                .createCircularReveal(searchAppBarLayout, cx, cy, finalRadius, 0);
//        animator.setInterpolator(new AccelerateDecelerateInterpolator());
//        animator.setDuration(200);
//        animator.addListener(new Animator.AnimatorListener() {
//            @Override
//            public void onAnimationStart(Animator animator) {
//            }
//
//            @Override
//            public void onAnimationEnd(Animator animator) {
//                searchAppBarLayout.setVisibility(View.GONE);
//                Utils.hideKeyBoard(searchEditText);
//
//            }
//
//            @Override
//            public void onAnimationCancel(Animator animator) {
//
//            }
//
//            @Override
//            public void onAnimationRepeat(Animator animator) {
//
//            }
//        });
//
//        animator.start();
//        // Circular animation declaration end
//
//        appBar.setVisibility(View.VISIBLE);
//        AnimatorSet set = new AnimatorSet();
//        set.playTogether(
//                ObjectAnimator.ofFloat(appBar, "translationY", 0),
//                ObjectAnimator.ofFloat(appBar, "alpha", 1),
//                ObjectAnimator.ofFloat(viewPager, "translationY", 0)
//        );
//        set.setDuration(100).start();
//
//    }
//
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_main, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//
//        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_search) {
//        //    showSearchBar(positionFromRight);
//            return true;
//        }
//
//        return super.onOptionsItemSelected(item);
//    }

//    @Override
//    public void onBackPressed() {
//        // if the searchToolBar is visible, hide it
//        // otherwise, do parent onBackPressed method
//        if (searchAppBarLayout.getVisibility() == View.VISIBLE)
//            hideSearchBar(positionFromRight);
//        else
//            super.onBackPressed();
//
//    }
//    public void getData() {
//        int img[] = {R.drawable.path, R.drawable.rfbpadprospacegraywifi2015, R.drawable.path};
//        for (int i = 0; i < img.length; i++) {
//            RecycleModel recycleModel = new RecycleModel();
//            recycleModel.setImage(img[i]);
//            list.add(recycleModel);
//        }
//        RecycleAdapter adapter = new RecycleAdapter(HomePageRecycle.this ,list);
//        recyle.setAdapter(adapter);
//        recyle.setLayoutManager(new LinearLayoutManager(HomePageRecycle.this));
//    }

}