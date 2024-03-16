package com.learning.core.day10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class D10P04 {
	public static void main(String[] args) throws IOException {

			FileInputStream r=new FileInputStream("C:\\Users\\OM\\git\\java-core\\MLA_Phase_0\\source.txt");

			FileOutputStream w=new FileOutputStream("C:\\Users\\OM\\git\\java-core\\MLA_Phase_0\\destination.txt");
			
			int i;
			
			while((i=r.read())!=-1)

			{
				w.write((char)i);

			}

			System.out.println("file copied");			
			}
		}