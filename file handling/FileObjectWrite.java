
import java.io.Serializable;
import java.io.BufferedReader;
// student
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectOutputStream;


 class Student implements Serializable
{

	int id;
	String name;
	int mark;
	
	public Student(int id, String name, int mark) {
		
		this.id = id;
		this.name = name;
		this.mark = mark;
	}
	
	
	void disp()
	{
		System.out.println(id+name+mark);
	}
	
}

public class FileObjectWrite
{

	public static void main(String[] args) throws IOException 
	{
		Student s1 = new Student(1001,"shan",90);
		Student s2 = new Student(1002,"raj",40);
		Student s3 = new Student(1003,"kumar",50);
		
		
		FileOutputStream fo = new FileOutputStream("dac1.txt");
		ObjectOutputStream oo = new ObjectOutputStream(fo);
		
           		
		oo.writeObject(s1);
		oo.writeObject(s2);
		oo.writeObject(s3);
		
		System.out.println("object write is over" + oo);
		fo.close();
		oo.close();
		FileReader ff = new FileReader("dac.txt");

		BufferedReader br = new BufferedReader(ff);
				String s5 =br.readLine();
				String s6 =br.readLine();
				
				//write to the console
				
				System.out.println(s1);
				System.out.println(s2);



		FileReader fr = new FileReader("dac.txt");
//		
		
		      int ch;
		      
		      while((ch=fr.read())!= -1)
		      {
		      System.out.print((char)ch);
		      }


//		
		
		
		
		
		
	}
	
}


// import java.io.BufferedReader;
// import java.io.FileNotFoundException;
// import java.io.FileReader;
// import java.io.IOException;

// public class FileStringRead
// {

	
// 	public static void main(String[] args) throws IOException 
// 	{
	
// 		//read line by line
		
// 				//read from file
				
// 				FileReader fr = new FileReader("dac.txt");
// 				BufferedReader br = new BufferedReader(fr);
// 				String s1 =br.readLine();
// 				String s2 =br.readLine();
// 				String s3 = br.readLine(); 
				
// 				//write to the console
				
// 				System.out.println(s1);
// 				System.out.println(s2);
// 				// System.out.println(s3);
				
		
// 	}
	
// }

// // import java.io.BufferedReader;
// // import java.io.FileNotFoundException;
// // import java.io.FileOutputStream;
// // import java.io.FileReader;
// // import java.io.FileWriter;
// // import java.io.IOException;

// // public class FileStringBased
// // {

// // 	public static void main(String[] args) throws IOException 
// // 	{
// // 		FileWriter fw = new FileWriter("dac.txt");
		
// // 		String str1 = "Welcome to java IO programming";
// // 		String str2 = "java exam will be conducted on Monday";
// // 		fw.write(str1+'\n');
// // 		fw.write(str2+ '\n');
		
// // 		System.out.println("file write is over");
// // 		fw.close();
		
// // 		// read char by char	
		
// // 		FileReader fr = new FileReader("dac.txt");
		
		
// // 		      int ch;
		      
// // 		      while((ch=fr.read())!= -1)
// // 		      {
// // 		      System.out.print((char)ch);
// // 		      }
		
		
		
			
// // 	}
// // }
