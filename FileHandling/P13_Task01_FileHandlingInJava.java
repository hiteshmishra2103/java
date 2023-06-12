package unit03;
import java.io.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class P13_Task01_FileHandlingInJava {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		FileHandling abc=new FileHandling();
		abc.performTasks();
		

	}

}
class FileHandling{
	void performTasks() throws IOException {
		String path="D:\\Java_workspace\\Vikas\\src\\unit03\\input.txt";
		File file=new File(path);
		FileReader obj=new FileReader(file);
		BufferedReader br= new BufferedReader(obj);
		String path1="D:\\Java_workspace\\Vikas\\src\\unit03\\output.txt";
		FileWriter obj1=new FileWriter(path1);
		
		
		//total number of char
		int totalChar=0;
		
		//total number of words
		int totalWords=0;
		
		//total number of lines
		int totalLines=0;
		
		int prev=0;
		int next=0;
		int x=0;
		int y=0;
		//count number of words
		
//		prev=br.read();    //read returns first letter
//		while(prev!=-1) {
//			next=br.read();
//			if((prev==' '||prev=='\n')&&(next!=' ')) {
//				totalWords++;
//			}
//			prev=next;
//		}
		
		String line=br.readLine();
		
		while(line!=null) {
			String[]sarr=line.split(" ");
			for(int i=0;i<sarr.length;i++) {
				totalChar+=sarr[i].length();
				
			}
			totalLines++;
			
			totalWords+=sarr.length;
			
			
			line=br.readLine();
			
		}
		
		
		
		
		System.out.println("Total char ="+totalChar);
		
		System.out.println("Total Words="+totalWords);
		
		System.out.println("Total lines="+totalLines);
		obj1.write("Total char ="+totalChar+"\n");
		obj1.write("Total Words="+totalWords+"\n");
		obj1.write("Total lines="+totalLines+"\n");
		obj1.close();
		
		br.close();
		
	}
}
