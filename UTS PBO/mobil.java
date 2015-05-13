class Mobil extends Kendaraan 
{

	private int KecepatanMaks;
	private int JumlahRoda;

	Kendaraan mob = new Kendaraan();

	public Mobil(int InputKecepatanMaks, int InputBerat, int InputKapasitas, int InputJumlahRoda)

	{
		KecepatanMaks 	=InputKecepatanMaks;
		Berat			=InputBerat;
		Kapasitas		=InputKapasitas;
		JumlahRoda		=InputJumlahRoda;
	}

	public void TampilkanSpec()

	{
		System.out.println("Kecepatan Maks Kendaraan : "+ mob.Kendaraan());
		System.out.println("Kecepatan Maks Mobil : "+ KecepatanMaks);
		System.out.println("Berat Mobil : "+ Berat);
		System.out.println("Jumlah Roda Mobil : "+ JumlahRoda);
		System.out.println();
	}

	public void Nyalakan (int Kecepatan)
	{
		System.out.println ("Mobil Dijalankan Dengan Kecepatan: "+ Kecepatan);
	}

}