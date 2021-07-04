package com.example.vaccinationapp.pager_package;

import com.example.vaccinationapp.R;

public enum ModelObject {
    FIRST(R.string.first, R.layout.general_view),
    SECOND(R.string.second, R.layout.covid_view),
    THIRD(R.string.third, R.layout.kids_view);

    private int mTitleResId;
    private int mLayoutResId;

    ModelObject(int titleResId, int layoutResId) {
        mTitleResId = titleResId;
        mLayoutResId = layoutResId;
    }

    public int getTitleResId() {
        return mTitleResId;
    }

    public int getLayoutResId() {
        return mLayoutResId;
    }
}
