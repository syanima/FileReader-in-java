import java.io.*;

class FileReaderPractice{
	public static void main(String args[]) throws IOException, FileNotFoundException{
		String fileName = args[0];
		File file = new File(fileName);
		int size = (int)file.length();
		char[] buffer = new char[size];
		FileReader fr = new FileReader(file);
		fr.read(buffer,0,size);
		System.out.println(buffer);
		fr.close();
	}
}