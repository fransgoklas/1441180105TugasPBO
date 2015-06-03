import java.util.Scanner;
class matematika
{
public static void main(String[] args) 
	{
		Scanner aritmatika = new Scanner(System.in);
		Scanner matematika = new Scanner(System.in);
		for (int i = 0;i < 99 ; i++) 
		{
			System.out.println("--Program Aritmatika--");
			System.out.println("1. Penjumlahan");
			System.out.println("2. Pengurangan");
			System.out.println("3. Perkalian");
			System.out.println("4. Pembagian");
			System.out.println("5. Keluar");
			System.out.print("Masukkan Pilihan = ");
			int pilihan = matematika.nextInt();
	    	switch (pilihan) 
	    	{
	    	case 1 :
	    		System.out.println("::Penjumlahan::");
	    		System.out.println("Masukkan Bilangan Pertama");
				int bil1 = aritmatika.nextInt();
				System.out.println("Masukkan Bilangan Kedua");
				int bil2 = aritmatika.nextInt();
				int hasil = bil1+bil2;
	        	System.out.println(bil1+"+"+bil2+"="+hasil);break;

	        case 2 :
	        	System.out.println("::Pengurangan::");
				System.out.println("Masukkan Bilangan Pertama");
				int bil1 = aritmatika.nextInt();
				System.out.println("Masukkan Bilangan Kedua");
				int bil2 = aritmatika.nextInt();
				int hasil_a = bil1-bil2;
				System.out.println(bil1+"-"+bil2+"="+hasil_1);break;

			case 3 :
				System.out.println("::Perkalian::");
				System.out.println("Masukkan Bilangan Pertama");
				int bil1 = aritmatika.nextInt();
				System.out.println("Masukkan Bilangan Kedua");
				int bil2 = aritmatika.nextInt();
				int hasil_b = bil1*bil2;
				System.out.println(bil1+"*"+bil2+"="+hasil_2);break;

			case 4 :
				System.out.println("::Pembagian::");
				System.out.println("Masukkan Bilangan Pertama");
				int bil1 = aritmatika.nextInt();
				System.out.println("Masukkan Bilangan Kedua");
				int bil2 = aritmatika.nextInt();
				int hasil_c = bil1/bil2;
				System.out.println(bil1+"/"+bil2+"="+hasil_3);break;

			case 5 : System.exit(0);
					System.out.println("Terima Kasih");
				
			default:
				System.out.println("Error");
			break;

			}		
		}	
	}
}