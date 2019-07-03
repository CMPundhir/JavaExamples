import java.io.FileInputStream;
import java.util.Scanner;

class FileIODemo3{
	public static void main(String[] args){
		try{
			FileInputStream fin = new FileInputStream("E:\\JAVA\\Java Classes Programs\\HelloIO1.txt");
			int a = fin.read();
			System.out.println((char)a);
			System.out.println("Success");
		}catch(Exception e){
			System.err.println(e.getMessage());
		}
	}
}