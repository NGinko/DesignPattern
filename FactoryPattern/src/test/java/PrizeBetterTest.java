import designBetter.StoreFactory;
import designBetter.store.ICommodity;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author NGinko
 * @date 2022-01-18 23:44
 */
public class PrizeBetterTest {


    @Test
    public void test_commodity() throws Exception {
        StoreFactory storeFactory = new StoreFactory();

        ICommodity commodityService1 = storeFactory.getCommodityService(1);
        commodityService1.sendCommodity("10001", "EGM1023938910232121323432", "791098764902132", null);

        // 2. 实物商品
        ICommodity commodityService_2 = storeFactory.getCommodityService(2);
        Map<String,String> extMap = new HashMap<String,String>();
        extMap.put("consigneeUserName", "谢飞机");
        extMap.put("consigneeUserPhone", "15200292123");
        extMap.put("consigneeUserAddress", "吉林省.长春市.双阳区.XX街道.檀溪苑小区.#18-2109");

        commodityService_2.sendCommodity("10001","9820198721311","1023000020112221113",extMap);




    }


}
