package better;

import better.factory.JDKProxy;
import better.factory.impl.EGMCacheAdapter;
import better.factory.impl.IIRCacheAdapter;
import better.impl.CacheServiceImpl;
import org.junit.Test;

/**
 * @author NGinko
 * @date 2022-02-07 22:21
 */
public class ApiTest {

    @Test
    public void test_CacheService() throws Exception {
        CacheService proxy_EGM = JDKProxy.getProxy(CacheServiceImpl.class, new EGMCacheAdapter());
        proxy_EGM.set("redis1","001");
        String val01 = proxy_EGM.get("redis1");
        System.out.println(val01);

        CacheService proxy_IIR = JDKProxy.getProxy(CacheServiceImpl.class, new IIRCacheAdapter());
        proxy_IIR.set("redis2","002");
        String val02 = proxy_IIR.get("redis2");
        System.out.println(val02);
    }

}
