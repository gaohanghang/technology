package Java8新特性8使用CompletableFuture构建异步应用;

import java.util.concurrent.CompletableFuture;

/**
 * @version V1.0
 * @ProjectName:jingli-tmc
 * @Description:
 * @Copyright: Copyright (c) 2018
 * @Company:鲸力智享（北京）科技有限公司
 * @author: Gao Hang Hang
 * @email: hanghang.gao@jingli365.com
 * @date 2018/08/30 17:28
 */
public class test1 {
    public static void main(String[] args) {
        CompletableFuture<String> completableFuture = new CompletableFuture<>();
        new Thread(new Runnable() {
            @Override
            public void run() {
                // 模拟执行耗时任务
                System.out.println("");
            }
        });
    }
}
