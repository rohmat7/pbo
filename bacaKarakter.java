import java.io.*;
class bacaKarakter
{
	public static void main(String args[])
	{
		char c;
		try 
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Masukan karakter, dan akhiri dengan q");
			do
			{
				c = (char) br.read();
				System.out.println("Terbaca karakter : "+ c);
			} 
			while(c != 'q');
		} 
		catch(IOException e) 
		{
			System.out.println("KESALAHAN IO");
		}
			System.exit(0);
	}
}