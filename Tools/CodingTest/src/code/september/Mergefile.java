package code.september;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Mergefile {
	
	private String path="/home/parul/Desktop/Tools/CodingTest/resources/";
	public void merge() {
		
		Scanner scanner=new Scanner(System.in);
		int numberofFiles=scanner.nextInt();
		
		for(int i=1;i<=numberofFiles;i++) {
			System.out.println("Enter file name:: ");
			String fileName=new Scanner(System.in).nextLine();
			
			try {
				BufferedReader bufferedReader=new BufferedReader(new FileReader((path+fileName)));
				BufferedWriter bufferedWriter =new BufferedWriter(new FileWriter(path+"newContentFile.txt",true));
				String line;
				bufferedWriter.write("****************Writing from "+fileName+"****************");
				bufferedWriter.newLine();
				while((line=bufferedReader.readLine())!=null) {
					bufferedWriter.write(line);
					bufferedWriter.newLine();
				}
				bufferedWriter.flush();
				bufferedWriter.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		new Mergefile().merge();
		
	}
	

}
