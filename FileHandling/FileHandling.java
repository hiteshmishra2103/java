package FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {

  public static void main(String[] args) {
    //code to create a new file

    File myfile = new File("input.txt");
    try {
      myfile.createNewFile();
    } catch (IOException e) {
      System.out.println("Unable to create this file!");
      e.printStackTrace();
    }

    //code to write to a file
    try {
      FileWriter fileWriter = new FileWriter("input.txt");
      fileWriter.write(
        "This is our first file from this java course.\n Okay now bye!"
      );
      fileWriter.close();
    } catch (IOException e) {
      e.printStackTrace();
    }

try{
  //reading from a file
  FileReader reader = new File("input.txt");
  Scanner sc = new Scanner(myfile);
  while(sc.hasNextLine()){
    String line=sc.nextLine();
    System.out.println(line);
  }
  sc.close();
}catch(FileNotFoundException ){
  System.out.println(e);
}
  }
}