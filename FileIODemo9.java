import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;
import java.util.*;

class FileIODemo9{
	public static void main(String[] args){
		try{
			FileInputStream fin1 = new FileInputStream("E:\\JAVA\\Java Classes Programs\\HelloIO5.txt");
			FileInputStream fin2 = new FileInputStream("E:\\JAVA\\Java Classes Programs\\HelloIO.txt");
			FileInputStream fin3 = new FileInputStream("E:\\JAVA\\Java Classes Programs\\HelloIO5.txt");
			FileInputStream fin4 = new FileInputStream("E:\\JAVA\\Java Classes Programs\\HelloIO.txt");
			FileOutputStream fout = new FileOutputStream("E:\\JAVA\\Java Classes Programs\\SequenceOutput2.txt");
			
			Vector<FileInputStream> vector = new Vector<FileInputStream>();
			vector.add(fin1);
			vector.add(fin2);
			vector.add(fin3);
			vector.add(fin4);
			
			Enumeration<FileInputStream> enm = vector.elements();
			SequenceInputStream bin = new SequenceInputStream(enm);
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