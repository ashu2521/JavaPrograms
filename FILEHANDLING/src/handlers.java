import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//File, FileReader and BufferedReade
public class handlers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader buffreader = null;
		File file = new File("aa.txt");
		try {
			FileReader filereader = new FileReader(file);
			buffreader = new BufferedReader(filereader);
			String line = "";
			while((line = buffreader.readLine()) != null){
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			System.err.println("ERROR : FILE '" + file.toString() + "' NOT FOUND");
		} catch (Exception e) {
			System.out.println("ERROR : " + e);
		}
		finally{
			try{
			buffreader.close();
			}catch (NullPointerException e) {
				System.err.println("ERROR : NULL POINTER");
			}catch(IOException e){
				System.err.println("IOEXCEPTION OCCURED");
			}
		}

	}

}
