package com.example.android.singlescreen.ui.activities.carddetail;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.example.android.singlescreen.R;
import com.example.android.singlescreen.ui.fragments.AboutFragment;
import com.example.android.singlescreen.ui.fragments.ContactFragment;
import com.example.android.singlescreen.ui.fragments.ProductFragment;

public class CardDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_detail);
        setUpViewpager();
    }

    /**
     * Set ups our {@link ViewPager} and binds it with our {@link TabLayout}
     * <p>
     * This method loads all fragments of our viewpager at once by setting up {@link ViewPager#setOffscreenPageLimit(int)}
     * <p>
     * Being used in {@link #onCreate(Bundle)}
     * Using {@link ViewpagerAdapter}
     * @see <a href="https://developer.android.com/reference/android/support/design/widget/TabLayout">TabLayout</a>
     * @since 1.0
     */
    private void setUpViewpager() {
        ViewPager viewPager = findViewById(R.id.viewpager);
        ViewpagerAdapter viewpagerAdapter = new ViewpagerAdapter(getSupportFragmentManager());
        viewpagerAdapter.addFragment(new AboutFragment(), getString(R.string.label_about_us_title));
        viewpagerAdapter.addFragment(new ProductFragment(), getString(R.string.label_product_title));
        viewpagerAdapter.addFragment(new ContactFragment(), getString(R.string.label_contact_title));
        viewPager.setAdapter(viewpagerAdapter);
        viewPager.setOffscreenPageLimit(viewpagerAdapter.getCount());

        TabLayout tabLayout = findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
    }
}
