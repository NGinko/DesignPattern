package better;

import java.util.concurrent.TimeUnit;

/**
 * @author NGinko
 * @date 2022-02-07 22:26
 */
public interface CacheService {

    String get(final String key);

    void set(String key, String value);

    void set(String key, String value, long timeout, TimeUnit timeUnit);

    void del(String key);
}
