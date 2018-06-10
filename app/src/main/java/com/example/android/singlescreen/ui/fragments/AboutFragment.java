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
public class AboutFragment extends Fragment {

    //Global field to reduce expensive findViewById calls every time in future
    //region UI from XML
    private TextView tvAboutUs;
    private TextView tvWhatWeDo;
    private TextView tvHowWeDo;
    //endregion

    public AboutFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_about, container, false);
        setupViews(rootView);
        return rootView;
    }

    private void setupViews(View rootView) {
        tvAboutUs = rootView.findViewById(R.id.tv_about_us);
        tvWhatWeDo = rootView.findViewById(R.id.tv_what_we_do);
        tvHowWeDo = rootView.findViewById(R.id.tv_how_we_do);
        setAboutUs();
        setWhatWeDo();
        setHowWeDo();
    }

    /**
     * Set ups About us title and description
     * <p>
     * Using {@link com.example.android.singlescreen.utils.StringUtils#getFormattedString(String, String, int, int)}
     * <p>
     * Being used in {@link #setupViews(View)}
     *
     * @since 1.0
     */
    private void setAboutUs() {
        tvAboutUs.setText(getFormattedString(getString(R.string.label_about_us_title) + "\n",
                "\n" + getString(R.string.label_about_us_description),
                Typeface.BOLD, Typeface.NORMAL));
    }

    /**
     * Set ups What we do title and description
     * <p>
     * Using {@link com.example.android.singlescreen.utils.StringUtils#getFormattedString(String, String, int, int)}
     * <p>
     * Being used in {@link #setupViews(View)}
     *
     * @since 1.0
     */
    private void setWhatWeDo() {
        tvWhatWeDo.setText(getFormattedString(getString(R.string.label_what_we_do_title) + "\n",
                "\n" + getString(R.string.label_what_we_do_des),
                Typeface.BOLD, Typeface.NORMAL));
    }

    /**
     * Set ups How do we do title and description
     * <p>
     * Using {@link com.example.android.singlescreen.utils.StringUtils#getFormattedString(String, String, int, int)}
     * <p>
     * Being used in {@link #setupViews(View)}
     *
     * @since 1.0
     */
    private void setHowWeDo() {
        tvHowWeDo.setText(getFormattedString(getString(R.string.label_how_do_we_do_title) + "\n",
                "\n" + getString(R.string.label_how_do_des),
                Typeface.BOLD, Typeface.NORMAL));
    }
}
