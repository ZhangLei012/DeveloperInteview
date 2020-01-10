package com.github.keyboard3.developerinterview.pattern;

import com.github.keyboard3.developerinterview.R;

/**
 * Html状态
 *
 * @author yyl
 */

public class ReinforcementLearningState extends BaseProblemState {
    public static final int ID = 3;
    public static final String NAME = "ReinforcementLearning";
    public static final int ICON = R.mipmap.ic_reinforcement_learning;
    public static final int MENU_ID = R.id.menu_reinforcement_learning;

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
