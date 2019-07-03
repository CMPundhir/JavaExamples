import java.io.FileInputStream;
import java.util.Scanner;

class FileIODemo4{
	public static void main(String[] args){
		try{
			FileInputStream fin = new FileInputStream("E:\\JAVA\\Java Classes Programs\\HelloIO.txt");
			int a = 0;
			while((a = fin.read())!= -1){
				System.err.print((char)a);
			}
			System.out.println("Success");
		}catch(Exception e){
			System.err.println(e);
		}
	}
}