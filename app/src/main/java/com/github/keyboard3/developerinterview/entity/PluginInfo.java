package com.github.keyboard3.developerinterview.entity;

/**
 * 栏目类型的插件信息
 *
 * @author yyl
 */

public class PluginInfo {
    public String name;
    public String packageName;
    public String mainClass;
    public String desc;

    public PluginInfo(String name, String packageName, String mainClass, String desc) {
        this.name = name;
        this.packageName = packageName;
        this.mainClass = mainClass;
        this.desc = desc;
    }
}
