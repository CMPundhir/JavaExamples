import java.io.FileOutputStream;


class FileIODemo{
	public static void main(String[] args){
		try{
		FileOutputStream fout = new FileOutputStream("E:\\JAVA\\Java Classes Programs\\HelloIO1.txt");
		fout.write(65);
		fout.close();
		System.out.println("Success");
		}catch(Exception e){
			System.err.println(e.getMessage());
		}
	}
}