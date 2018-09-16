package main.java.chapter_07;

import javafx.util.Pair;
import jdk.nashorn.internal.ir.RuntimeNode.Request;

import java.util.HashMap;

/**
 * 写出言简意赅的注释
 *
 * @author: Gao HangHang
 * @date 2018/09/15
 */
public class Example8 {

    // 这里的 Integer 是分类类型
    // Pair 内部的第一个浮点数是得分
    // 第二个浮点数是权重

    // CategoryType -> (score, weight)
    HashMap<Integer, Pair<Float, Float>> scoreMap;

    // 从当前线程 Request 中获取查询参数
    public void queryParam(Request request) {

    }

    // 根据我们是否已经爬过这个URL，给它一个不同的优先级
    public void crawledURL1() {

    }

    // 优先考虑之前从未爬过的网址
    public void crawledURL2() {

    }

}
