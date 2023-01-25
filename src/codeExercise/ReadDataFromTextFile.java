package codeExercise;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadDataFromTextFile {

	public static void main(String[] args) throws IOException {

		
		//Approach 1- FileReader and BufferedReader
		
//		FileReader fr = new FileReader("C:\\Users\\Ankush\\Desktop\\MA.txt");
//		BufferedReader br = new BufferedReader(fr);
//		
//		String str;
//		
//		while((str=br.readLine())!=null) {
//			System.out.println(str);
//		}
//		br.close();
		
		//Approach 2- Using Scanner and File
		
		File file = new File("C:\\Users\\Ankush\\Desktop\\MA.txt");
		Scanner sc = new Scanner(file);
//		
//		//loop statement
//		while(sc.hasNextLine()) {
//			System.out.println(sc.nextLine());
//		}
		
		//Approach 3- Using 
		sc.useDelimiter("\\Z");
		System.out.println(sc.next());
	}

}
