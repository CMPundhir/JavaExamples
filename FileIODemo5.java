import java.io.FileOutputStream;
import java.io.BufferedOutputStream;
import java.util.Scanner;

class FileIODemo5{
	public static void main(String[] args){
		try{
			Scanner sc = new Scanner(System.in);
			FileOutputStream fin = new FileOutputStream("E:\\JAVA\\Java Classes Programs\\HelloIO5.txt");
			BufferedOutputStream buff = new BufferedOutputStream(fin);
			System.out.println("Enter a message : ");
			String msg = sc.nextLine();
			byte[] arr = msg.getBytes();
			buff.write(arr);
			buff.flush();
			buff.close();
			System.out.println("Success");
		}catch(Exception e){
			System.err.println(e);
		}
	}
}