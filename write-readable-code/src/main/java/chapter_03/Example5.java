package main.java.chapter_03;

/**
 * @author: Gao Hang Hang
 * @date 2018/09/15 上午11:00
 */
public class Example5 {

    /**
     * VM options -DrunLocally=true
     */
    public void start() {
        String runLocally = System.getProperty("runLocally", "false");
        System.out.println("runLocally: " + runLocally);

        String extraLogging = System.getProperty("extraLogging", "false");
    }

    public static void main(String[] args) {
        new Example5().start();
    }

}
