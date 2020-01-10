package com.github.keyboard3.developerinterview.callback;

/**
 * 本地回调类
 *
 * @author yyl
 */

public interface Callback<T> {
    void success(T item);
    void fail(Throwable error);
}
