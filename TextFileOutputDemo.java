import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
public class TextFileOutputDemo
{
	public static void main(String[] args) 
	{
		PrintWriter outputStream = null;
		try
		{
			outputStream = new PrintWriter(new
			FileOutputStream("stuff.txt"));
		} 
		catch(FileNotFoundException e) 
		{
			System.out.println("Error opening the file stuff.txt.");
			System.exit(0);
		}
			System.out.println("Writing to file.");
			outputStream.println("Saya sedang menulis.");
			outputStream.println("Menulis kedalam file.");
			outputStream.close();
			System.out.println("End of program.");
	}
}