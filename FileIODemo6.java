import java.io.FileInputStream;
import java.io.BufferedInputStream;
import java.util.Scanner;

class FileIODemo6{
	public static void main(String[] args){
		try{
			FileInputStream fin = new FileInputStream("E:\\JAVA\\Java Classes Programs\\HelloIO5.txt");
			BufferedInputStream bin = new BufferedInputStream(fin);
			int a = 0;
			while((a = bin.read())!= -1){
				System.out.print((char)a);
			}
			System.out.println("Success");
		}catch(Exception e){
			System.err.println(e.getMessage());
		}
	}
}