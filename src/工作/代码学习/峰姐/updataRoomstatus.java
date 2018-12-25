package 工作.代码学习.峰姐;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author: Gao HangHang
 * @date 2018/09/21
 */
public class updataRoomstatus {

    public static void main(String[] args) {

        Map map = new HashMap();
        map.put("111", "T");

        updateProductStatus(map);
    }

    public static void updateProductStatus(Map<String, String> m) {

        List<String> statusList = new ArrayList<>();
        statusList.add("T");
        statusList.add("F");
        statusList.add("D");

        // key: productId  value: status
        HashMap<String, String> map = new HashMap<>();
        for (String productId : m.keySet()) {
            String status = m.get(productId);
            if (statusList.contains(status)) {
                map.put(productId, status);
            }
        }

        Map<String, List<String>> statusToProductsMap = new HashMap<>();
        for (String status : statusList) {
            statusToProductsMap.put(status, new ArrayList<>());
        }

        for (String productId : map.keySet()) {
            statusToProductsMap.get(map.get(productId)).add(productId);
        }

        for (String status : statusToProductsMap.keySet()) {
            if (statusToProductsMap.get(status).size() != 0) {
                //roomProductDao.updateProductSatus(key, productIds.get(key));
            }
        }

    }


}
