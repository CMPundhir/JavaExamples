import java.io.FileInputStream;
import java.io.SequenceInputStream;
import java.util.Scanner;

class FileIODemo7{
	public static void main(String[] args){
		try{
			FileInputStream fin1 = new FileInputStream("E:\\JAVA\\Java Classes Programs\\HelloIO5.txt");
			FileInputStream fin2 = new FileInputStream("E:\\JAVA\\Java Classes Programs\\HelloIO.txt");
			SequenceInputStream bin = new SequenceInputStream(fin1,fin2);
			int a = 0;
			while((a = bin.read())!= -1){
				System.out.print((char)a);
			}
		}catch(Exception e){
			System.err.println(e.getMessage());
		}
	}
}