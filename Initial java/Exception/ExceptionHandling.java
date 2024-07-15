public class ExceptionHandling {

   public void getcatch(){
    int myInt = Integer.parseInt("pants");
   }

    int sum(int a, int b){
        return a+b;
    }
public static void main(String[] args) {
   

    ExceptionHandling exceptionHandling = new ExceptionHandling();
    System.out.println(exceptionHandling.sum(25, 33));

    System.out.println("if sum prints correctly then this will try catch got succesfully.");
    try {
        exceptionHandling.getcatch();
     } catch (Exception e) {
         // TODO: handle exception
         System.out.println("this error got successfully thrown");
     }
}
}
