package com.example.android.singlescreen.ui.fragments;


import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.android.singlescreen.R;

import static com.example.android.singlescreen.utils.StringUtils.getFormattedString;

/**
 * A simple {@link Fragment} subclass.
 */
public class ProductFragment extends Fragment {

    //Global fields to prevent repetitive findViewByIds call in future
    //region UI from XML
    private TextView tvWeCards;
    private TextView tvJobsAdBoard;
    private TextView tvWeenKm;
    //endregion

    public ProductFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_product, container, false);
        setupViews(rootView);
        return rootView;
    }

    /**
     * Finds ui views by {@link View#findViewById(int)}
     * Being used in {@link #onCreateView(LayoutInflater, ViewGroup, Bundle)}
     *
     * @since 1.0
     */
    private void setupViews(View rootView) {
        tvWeCards = rootView.findViewById(R.id.tv_we_cards);
        tvJobsAdBoard = rootView.findViewById(R.id.tv_jobs_ad_board);
        tvWeenKm = rootView.findViewById(R.id.tv_weenkm);
        setWeCards();
        setJobsAdBoard();
        setWeenKm();
    }

    /**
     * Set ups WeCards title and description
     * <p>
     * Using {@link com.example.android.singlescreen.utils.StringUtils#getFormattedString(String, String, int, int)}
     * <p>
     * Being used in {@link #setupViews(View)}
     *
     * @since 1.0
     */
    private void setWeCards() {
        tvWeCards.setText(getFormattedString(getString(R.string.label_we_card_title) + "\n",
                "\n" + getString(R.string.label_we_card_des),
                Typeface.BOLD, Typeface.NORMAL));
    }

    /**
     * Set ups JobsAdBoard title and description
     * <p>
     * Using {@link com.example.android.singlescreen.utils.StringUtils#getFormattedString(String, String, int, int)}
     * <p>
     * Being used in {@link #setupViews(View)}
     *
     * @since 1.0
     */
    private void setJobsAdBoard() {
        tvJobsAdBoard.setText(getFormattedString(getString(R.string.label_jobs_ad_title) + "\n",
                "\n" + getString(R.string.label_jobs_ad_des),
                Typeface.BOLD, Typeface.NORMAL));
    }

    /**
     * Set ups Weenkm title and description
     * <p>
     * Using {@link com.example.android.singlescreen.utils.StringUtils#getFormattedString(String, String, int, int)}
     * <p>
     * Being used in {@link #setupViews(View)}
     *
     * @since 1.0
     */
    private void setWeenKm() {
        tvWeenKm.setText(getFormattedString(getString(R.string.label_weenkm_title) + "\n",
                "\n" + getString(R.string.label_weenkm_des),
                Typeface.BOLD, Typeface.NORMAL));
    }
}
