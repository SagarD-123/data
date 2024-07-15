import java.io.*;

public class wordSearch {
    public static void main(String[] args) {
        String filename = "text.txt";
       String searchWord = "file";


       searchWordInFile(filename, searchWord);


    }

    public static void searchWordInFile(String filename, String searchWord) {
      String text;
    try (BufferedReader reader = new BufferedReader(new FileReader(filename))){
        String line;
            int lineNumber = 1;
            while ((line = reader.readLine()) != null) {
                if (line.contains(searchWord)) {
                    System.out.println("Line " + lineNumber + ": " + line);
                }
                lineNumber++;
            }
      } catch (Exception e) {
        // TODO: handle exception
        System.err.println("Error reading the file: " + e.getMessage());
      }
}
}