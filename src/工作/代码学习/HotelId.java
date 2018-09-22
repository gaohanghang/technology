package 工作.代码学习;

import java知识.Java基础.集合.bit.HashMap.HashMap;

import java.util.HashSet;

/**
 * @author: Gao HangHang
 * @date 2018/09/19
 */
public class HotelId {

    public String jingliHotelId;

    public HashMap<String, RoomId> rooms;

    public static class RoomId {
        public HashSet<String> productIds;
    }

}
