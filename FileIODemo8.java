import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;
import java.util.Scanner;

class FileIODemo8{
	public static void main(String[] args){
		try{
			FileInputStream fin1 = new FileInputStream("E:\\JAVA\\Java Classes Programs\\HelloIO5.txt");
			FileInputStream fin2 = new FileInputStream("E:\\JAVA\\Java Classes Programs\\HelloIO.txt");
			FileOutputStream fout = new FileOutputStream("E:\\JAVA\\Java Classes Programs\\SequenceOutput.txt");
			SequenceInputStream bin = new SequenceInputStream(fin1,fin2);
			int a = 0;
			while((a = bin.read())!= -1){
				fout.write(a);
			}
			fin1.close();
			fin2.close();
			fout.close();
			bin.close();
		}catch(Exception e){
			System.err.println(e.getMessage());
		}
	}
}