public class TestBangun
{
	public static void main(String[] args)

	{
		Lingkaran bundar = new Lingkaran();

		bundar.rad = 14;

		bundar.cetakKeLayar();

		System.out.println("luas: " + bundar.hitungLuas());

		System.out.println("keliling: " + bundar.hitungKeliling());

		bundar.ubahProperty(21);

		System.out.println("Property Baru =");

		bundar.cetakKeLayar();

		System.out.println("luas baru: " + bundar.hitungLuas());

		System.out.println("keliling baru: " + bundar.hitungKeliling());

		Segitiga bentuk = new Segitiga();

		bentuk.alas = 10;

		bentuk.tinggi = 5;

		bentuk.sisi = 9;

		bentuk.cetakKeLayar();

		System.out.println("luas: " + bentuk.hitungLuas());

		System.out.println("keliling: " + bentuk.hitungKeliling());

		bentuk.ubahProperty(5,9,10);

		System.out.println("Property Baru =");

		bundar.cetakKeLayar();

		System.out.println("luas baru: " + bentuk.hitungLuas());

		System.out.println("keliling baru: " + bentuk.hitungKeliling());
	}
	
}
