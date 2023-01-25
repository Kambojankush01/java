package codeExercise;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataIntoTextFile {

	public static void main(String[] args) throws IOException {

		FileWriter fw = new FileWriter("C:\\Users\\Ankush\\Desktop\\Test123.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("Testing ");
		bw.write("1 ");
		bw.write("2 ");
		bw.write("3 ");
		System.out.println("GhapaGhap!!");
		bw.close();
		
	}

}
