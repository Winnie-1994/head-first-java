package szu.panda.guessgame;

/**
* @author: wunt
* @date: 2018-11-24 
* @description:猜数字游戏，产生介于0-9之间的随机数。这个类带有main()，是程序的入口点。创建对象时，对象会被放在堆内存区域，可进行自动垃圾回收
*/
public class GameLauncher {
    public static void main (String[] args) {
        GuessGame game = new GuessGame();
        game.startGame(); //游戏的起点
    }
}
