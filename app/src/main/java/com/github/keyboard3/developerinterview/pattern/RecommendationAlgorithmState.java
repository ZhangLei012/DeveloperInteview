package com.github.keyboard3.developerinterview.pattern;

import com.github.keyboard3.developerinterview.R;

/**
 * 其他状态
 *
 * @author yyl
 */

public class RecommendationAlgorithmState extends BaseProblemState {
    public static final int ID = 4;
    public static final String NAME = "RecommendationAlgorithm";
    public static final int ICON = R.mipmap.ic_recommendation_algorithm;
    public static final int MENU_ID = R.id.menu_recommendation_algorithm;

    @Override
    protected String getProblemStateName() {
        return NAME;
    }

    @Override
    protected int getProblemStateId() {
        return ID;
    }

    @Override
    protected int getProblemIcon() {
        return ICON;
    }
}
