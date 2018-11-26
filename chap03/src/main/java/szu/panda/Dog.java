package szu.panda;

/**
* @author: wunt
* @date: 2018-11-24 
* @description:对象引用。注意：数组是个对象。变量有两种：primitive主数据类型和引用
*/
public class Dog {
    String name;
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.bark(); 
        dog1.name = "Bart";
        
        Dog[] myDogs = new Dog[3];
        myDogs[0] = new Dog();
        myDogs[1] = new Dog();
        myDogs[2] = dog1;
        
        myDogs[0].name = "Fred";
        myDogs[1].name = "Marge";
        
        System.out.print("last dog's name is ");
        System.out.println(myDogs[2].name);
        
        int x = 0;
        while (x < myDogs.length) {
            myDogs[x].bark();
            x = x+1;
        }
    }
    public void bark() {
        System.out.println(name + " says Ruff!");
    }
    
    public void eat() { }
    
    public void chaseCat() { }
}
