package com.github.keyboard3.developerinterview.pattern;

import com.github.keyboard3.developerinterview.R;

/**
 * Android状态
 *
 * @author yyl
 */

public class DeepLearningState extends BaseProblemState {
    public static final int ID = 2;
    public static final String NAME = "DeepLearning";
    public static final int ICON = R.mipmap.ic_deep_learning;
    public static final int MENU_ID = R.id.menu_deep_learning;

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
