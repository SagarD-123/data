/**
 * Emp
 */
class Animal{
    public void makesound(){
        System.out.println("makeound");

    }
}

class dog extends Animal{
    public void makeound(){
        super.makesound();
        System.out.println("Bhaw bhaw");
    }
}

class cat extends Animal{
    public void makeound(){
        super.makesound();
        System.out.println("Meow meow");
    }
}

 public class Emp {

     public static void main(String[] args) {
        dog d = new dog();
        cat c = new cat();

        d.makeound();
        c.makeound();

     }

}