/**
 * InnerMoney
 */

 import java.util.Scanner;
 interface creditCard {
     void rupess(double amount);
     void dollar(double amount);
     void pound(double amount);


    
}

class bankAcc implements creditCard {
     public void rupess(double amount){
        System.out.println("Transaction will done in rupees of amount: " + amount);
    }

     public void dollar(double amount){
        System.out.println("Transaction will done in rupees of amount: " + amount);
    }

     public void pound(double amount){
        System.out.println("Transaction will done in rupees of amount: " + amount);
    }
}

public class Money {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount you want to convert");
        double amount = sc.nextDouble();
        System.out.println("Enter the currency you want to convert to");
        String currency = sc.next();
        if(currency.equalsIgnoreCase("rupes")){
            bankAcc b = new bankAcc();
            b.rupess(amount);
        }
        else if(currency.equalsIgnoreCase("dollar")){
            bankAcc b = new bankAcc();
            b.dollar(amount);
        }
        else if(currency.equalsIgnoreCase("pound")){
            bankAcc b = new bankAcc();
            b.pound(amount);
        }
        else{
            System.out.println("Invalid currency");
        }
        
    }
}
