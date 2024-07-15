import java.io.FileReader;
import java.io.FileWriter;

/**
 * FileStatsCounter
 */

 /**
  * InnerFileStatsCounter
  */
 public interface InnerFileStatsCounter {
     void print(){
        // System.out.println("this is sagar");
     }
 
    
 }
public class FileStatsCounter implements FileStatsCounter{
    void print(){
        System.out.println("this is sagar");
 
    }
    public static void main(String[] args) {
         
        FileStatsCounter stats = new FileStatsCounter();

        stats.print();


        // FileWriter fw = new FileWriter("text.txt");
        // String string =  "this is file";
        // fw.write(string);

        // System.out.println("done");
        // fw.close();
        
    }
}

// import java.io.*;

// //  void test(double x, double y){
// //     switch (x:2) {
// //         case value:
            
// //             break;
    
// //         default:
// //             break;
// //     }
// //  }

// import java.math.*;

//  class Money {
//  int balance(int amount){
//     return amount;
//  }



// }
// public class FileStatsCounter {
//     public static void main(String[] args) {
//         String filename = "text.txt";
//         int[] counts = countCharsWordsLines(filename);
//         if (counts!= null) {
//             System.out.println("Number of characters: " + counts[0]);
//             System.out.println("Number of words: " + counts[1]);
//             System.out.println("Number of lines: " + counts[2]);
//         }
//     }

//     public static int[] countCharsWordsLines(String text) {
//         int numChars = 0;
//         int numWords = 0;
//         int numLines = 0;

//         try (BufferedReader reader = new BufferedReader(new FileReader(text))) {
//             String line;
//             while ((line = reader.readLine()) != null) {
//                 // Count characters
//                 numChars += line.length();
                
//                 // Count words
//                 String[] words = line.split("\\s+");
//                 numWords += words.length;
                
//                 // Count lines
//                 numLines++;
//             }
//         } catch (IOException e) {
//             System.err.println("Error reading the file: " + e.getMessage());
//             return null;
//         }

//         return new int[] { numChars, numWords, numLines };
//     }
// }