package main.java.chapter_09;

/**
 * 简化表达式的创意方法
 *
 * @author: Gao HangHang
 * @date 2018/09/16
 */
public class Example6 {

    class Stats {

        long   totalMemory;
        long   freeMemory;
        long   swapMemory;
        int    numProcesses;
        String statusString;

    }

    public void addStats(Stats addFrom, Stats addTo) {
        addTo.totalMemory  = addFrom.totalMemory + addTo.totalMemory;
        addTo.freeMemory   = addFrom.freeMemory + addTo.freeMemory;
        addTo.swapMemory   = addFrom.swapMemory + addTo.swapMemory;
        addTo.swapMemory   = addFrom.swapMemory + addTo.swapMemory;
        addTo.statusString = addFrom.statusString + addTo.statusString;
        addTo.numProcesses = addFrom.numProcesses + addTo.numProcesses;
        // ...
        // BeanUtils.copyProperties();
    }

}
