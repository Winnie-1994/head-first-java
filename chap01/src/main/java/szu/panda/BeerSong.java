package szu.panda;

/**
* @author: wunt
* @date: 2018-11-24 
* @description:数啤酒瓶，学习带有main()的类、int和String变量、while循环、if测试
*/
public class BeerSong {
    public static void main(String[] args) {
        int beerNum = 99;
        String word = "bottles";
        while (beerNum > 0)
        {
            if (beerNum == 1)
            {
                word = "bottle";
            }
            System.out.println(beerNum + " " + word + " of beer on the wall");
            System.out.println(beerNum + " " + word + " of beer");
            System.out.println("Take one down.");
            System.out.println("Pass it around.");
            beerNum = beerNum - 1;
            if (beerNum > 0)
            {
                System.out.println(beerNum +  " " + word + " of beer on the wall");
            }
            else
            {
                System.out.println("No more bottles of beer on the wall");
            }
        }
    }
}