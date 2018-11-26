package szu.panda.guessgame;

/**
* @author: wunt
* @date: 2018-11-24 
* @description:
*/
public class Player {
    int number = 0;
    public void guess()
    {
        number = (int) (Math.random() * 10);
        System.out.println("I'm guessing " + number);
    }
}
