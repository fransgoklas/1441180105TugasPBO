public class testMahasiswa 
{
	public static void main(String[] args) {
		Mahasiswa mhs = new Mahasiswa("Frans GOklas", 19);

		mhs.tampilkanBiodata();
		System.out.println();
		mhs.setUmur(20);
		mhs.tampilkanBiodata();
	}
}