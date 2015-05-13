public class TestKendaraan

{
	public static void main(String[] args)
	{
		Mobil porsche = new Mobil(200, 5000, 2, 4);
		porsche.TampilkanSpec();
		porsche.Nyalakan(100);
		porsche.Nyalakan(180);
	}

}
