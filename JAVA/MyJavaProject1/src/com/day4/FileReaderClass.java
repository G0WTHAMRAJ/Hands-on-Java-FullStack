package com.day4;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderClass {

	public static void main(String[] args) throws IOException {
		FileReader fin =new FileReader("C://Users//gowthamr//BIWW//Assignments//JAVA//MyFile.txt");
		FileWriter fout =new FileWriter("C://Users//gowthamr//BIWW//Assignments//JAVA//MyNewFile001.txt");
		int ch;
		while((ch=fin.read())!=-1) {
			fout.write(ch);
			//System.out.println((char) ch);
		}
		fin.close();
		fout.close();
		System.out.println("File copied");
	}

}
