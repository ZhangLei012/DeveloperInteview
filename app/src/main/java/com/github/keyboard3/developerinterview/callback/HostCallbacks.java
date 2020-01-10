package com.github.keyboard3.developerinterview.callback;

import android.content.Context;
import android.content.Intent;

import com.qihoo360.replugin.RePluginCallbacks;

/**
 * 360插件化的回调 如果插件不存在就去下载
 *
 * @author yyl
 */

public class HostCallbacks extends RePluginCallbacks {
    private static String TAG = "HostCallbacks";

    public HostCallbacks(Context context) {
        super(context);
    }

    @Override
    public boolean onPluginNotExistsForActivity(final Context context, String plugin, Intent intent, int process) {
        return super.onPluginNotExistsForActivity(context, plugin, intent, process);
    }
}
