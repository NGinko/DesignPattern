package better.factory.impl;

import base.matter.EGM;
import better.ICacheAdapter;

import java.util.concurrent.TimeUnit;

/**
 * 针对EGM的操作操作要再实现适配器接口封装一次
 *
 * @author NGinko
 * @date 2022-02-07 21:54
 */
public class EGMCacheAdapter implements ICacheAdapter {

    private EGM egm = new EGM();

    @Override
    public String get(String key) {
        return egm.gain(key);
    }

    @Override
    public void set(String key, String value) {
        egm.set(key, value);
    }

    @Override
    public void set(String key, String value, long timeout, TimeUnit timeUnit) {
        egm.setEx(key, value, timeout, timeUnit);
    }

    @Override
    public void del(String key) {
        egm.delete(key);
    }
}
