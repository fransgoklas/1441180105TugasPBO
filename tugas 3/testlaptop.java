class testlaptop {
	public static void main(String[] args) {
		laptop satu = new laptop();
		laptop dua = new laptop("acer", "putih");	
		laptop tiga = new laptop("hp", "hitam", "terhubung");
		laptop empat = new laptop("dell", "putih", "terhubung",100);

		System.out.println("merk = "+ satu.getMerk() +" color = "+ satu.getWarna() +" wifi = "+ satu.getWifi() +" batrei = "+ satu.getBatrei());
		System.out.println("merk = "+ dua.getMerk() +" color = "+ dua.getWarna() +" wifi = "+ dua.getWifi() +" batrei = "+ dua.getBatrei());
		System.out.println("merk = "+ tiga.getMerk() +" color = "+ tiga.getWarna() +" wifi = "+ tiga.getWifi() +" batrei = "+ tiga.getBatrei());
		System.out.println("merk = "+ empat.getMerk() +" color = "+ empat.getWarna() +" wifi = "+ empat.getWifi() +" batrei = "+ empat.getBatrei());
			
		satu.setMerk("lenovo");
		System.out.println("merk = "+ satu.getMerk() +" color = "+ satu.getWarna() +" wifi = "+ satu.getWifi() +" batrei = "+ satu.getBatrei());
		}
	}
	