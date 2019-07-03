import java.io.FileOutputStream;
import java.util.Scanner;

class FileIODemo2{
	public static void main(String[] args){
		try{
			Scanner sc = new Scanner(System.in);
			FileOutputStream fout = new FileOutputStream("E:\\JAVA\\Java Classes Programs\\HelloIO.txt");
			System.out.println("Enter a message : ");
			String msg = sc.nextLine();
			byte[] arr = msg.getBytes();
			fout.write(arr);
			fout.close();
			System.out.println("Success");
		}catch(Exception e){
			System.err.println(e.getMessage());
		}
	}
}