//Read an array of bytes from the keyboard
import java.io.*;
class ReadBytes 
{
	public static void main(String args[]) throwsIOException 
	{
		byte data[] = new byte[10];
		System.out.println("Enter Some Characters : ");
		System.in.read(data); // read an array bytes from key board
		System.out.print("You Entered : ");
		for(int i = 0; i < data.length; i++)
		System.out.print((char) data[i]);
	}
}