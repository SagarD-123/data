package Abstraction.Interface;

interface demo {
    public void makesound();

    void sleep();
}

class demo1 implements demo {
    public void makesound() {
        System.out.println("haa bahi");
    };

    public void sleep() {
        System.out.println("haa bahi");
    };
}

public class tree {
public static void main(String[] args) {
    demo1 d = new demo1();

    d.makesound();
    d.sleep();
}    

}
