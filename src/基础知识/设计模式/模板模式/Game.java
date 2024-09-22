package 基础知识.设计模式.模板模式;

/**
 * @author Gao Hanghang
 * @version 1.0
 * @description
 * @date 2024-09-22 17:45
 **/
public abstract class Game {
    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();

    //模板
    public final void play(){

        //初始化游戏
        initialize();

        //开始游戏
        startPlay();

        //结束游戏
        endPlay();
    }
}
