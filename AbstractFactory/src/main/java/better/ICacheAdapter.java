package better;

import java.util.concurrent.TimeUnit;

/**
 * 适配器接口
 * 实际上每次进入一种新的模式，适配的工作都是少不了的。
 * 目的其实还是方便后期的改造工作
 */
public interface ICacheAdapter {

    String get(String key);

    void set(String key, String value);

    void set(String key, String value, long timeout, TimeUnit timeUnit);

    void del(String key);
}
