import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithCatch {
	public static void main(String[] args){
		File file = new File("a.txt");
		try(BufferedReader bufferedReader = new BufferedReader(new FileReader(file))){
			String line = "";
			while((line = bufferedReader.readLine()) != null){
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Error : FILE NOT PRESENT");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("IOException");
		}
	}
}
