package Abstraction;


    
abstract class demo {
    public abstract void makesound( );//body of abtract method is not provided in abtract class

    public void sleep(){
        System.out.println( "sleep");// you can provide public method in abtract class
    }
}


class pig extends demo{
    public void makesound(){
        System.out.println("now this is making sound");
    }
}

/**
 * animal
 */
public class animal {

    public static void main(String[] args) {
        pig p = new pig();
        p.makesound();
        p.sleep();
    }
}