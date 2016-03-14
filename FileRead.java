import java.io.*;

public class FileRead{

   public static void main(String args[])throws IOException{

      File file = new File("Hello.txt");
      file.createNewFile();
      FileWriter writer = new FileWriter(file); 
      writer.write("My\n name\n is\n Syanima\n"); 
      writer.flush();
      writer.close();

      FileReader fr = new FileReader(file); 
      char [] buffer = new char[50];
      fr.read(buffer,0,50);
      System.out.println(buffer);
      fr.close();
   }
}