package 基础知识.Java基础.IO;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.channels.Selector;

/**
 * @version V1.0
 * @ProjectName:jingli-tmc
 * @Description:
 * @Copyright: Copyright (c) 2018
 * @Company:鲸力智享（北京）科技有限公司
 * @author: Gao Hang Hang
 * @email: hanghang.gao@jingli365.com
 * @date 2018/09/09 下午1:22
 */
public class NonblockingServer {


    public static void main(String[] args) throws Exception {

        InetAddress[] host = InetAddress.getAllByName("localhost");

        Selector selector = Selector.open();


    }

}
