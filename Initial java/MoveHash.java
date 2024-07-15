import java.util.Scanner;

/**
 * MoveHash
 */
public class MoveHash {

    public static void moveHash(String str, int len){
        String str1 = new String("");
        String str2 = new String("");
        
        for(int i = 0; i < len; i++){
            if(str.charAt(i)=='#'){
                str1 += str.charAt(i);
            }
            else{
                str2 += str.charAt(i);
            }

        }
        String result = str1.concat(str2);
        System.out.println(result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int len = str.length();
        moveHash(str, len);
    }
}