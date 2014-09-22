import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.FileOutputStream;
public class HasNextLineDemo2
{
	public static void main(String[] args) throws FileNotFoundException 
	{
		Scanner inputStream = null;
		PrintWriter outputStream = null;
		inputStream = new Scanner(new FileInputStream("E:/KULIAH/SMESTER 4/Prak.PBO/pertemuan 10/stuff.txt"));
		outputStream = new PrintWriter(new FileOutputStream("numbered.txt"));
		String line = null;
		int count = 0;
		while(inputStream.hasNextLine()) 
		{
			line = inputStream.nextLine();
			count++;
			System.out.println(line);
			outputStream.println(count + " " + line);
		}
		inputStream.close();
		outputStream.close( );
	}
}