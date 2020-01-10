package com.github.keyboard3.developerinterview.util;

import java.util.List;

/**
 * 列表辅助相关工具
 *
 * @author yyl
 */

public class ListUtil {
    public static boolean isEmpty(List list) {
        return list == null || list.size() == 0;
    }
}
