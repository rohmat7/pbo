class DemoFinally
{
	public static void cobaEksepsi (int pembilang, int penyebut)
	{
		try
		{
			int hasil = pembilang/penyebut;
			System.out.println("Hasil bagi : "+hasil);
			int[] Arr = {1,2,3,4,5}; // array dengan 5 elemen
			Arr[10] = 23; // mengakses indeks ke 10
		}
		catch (ArithmeticException eksepsi1)
		{
			System.out.println("Terdapat pembagian dengan 0");
		}
		catch (ArrayIndexOutOfBoundsException eksepsi2)
		{
			System.out.println("indeks diluar rentang");
		}
		finally 
		{
			System.out.println("Ini adalah statemen dalam blok Finally");
		}
	}
	
	public static void main(String[] args)
	{
		cobaEksepsi (4,0); // menimbulkan ArithmeticException
		System.out.println();
		cobaEksepsi(12,4); // menimbulkan ArrayIndexOutOfBoundsException
	}
}