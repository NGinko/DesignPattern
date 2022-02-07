package base.cache;

import java.util.concurrent.TimeUnit;

/**
 * 通常可能为了适配类型采用添加类型参数来决定分支
 */
public interface CacheService {

    String get(final String key, int redisType);

    void set(String key, String value, int redisType);

    void set(String key, String value, long timeout, TimeUnit timeUnit, int redisType);

    void del(String key, int redisType);

}
