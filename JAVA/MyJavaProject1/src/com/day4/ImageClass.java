package com.day4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImageClass {
	//copying image from one file to another using FileInputStream from ByteStream
	public static void main(String[] args) throws IOException {
		FileInputStream fin =new FileInputStream("C://Users//gowthamr//BIWW//Assignments//JAVA//lion.jpg");
		FileOutputStream fout =new FileOutputStream("C://Users//gowthamr//BIWW//Assignments//JAVA//MyNewlion.jpg");
		int ch;
		while((ch=fin.read())!=-1) {
			fout.write(ch);
			//System.out.println((char) ch);
		}
		fin.close();
		fout.close();
		System.out.println("Image copied");
	}

}
