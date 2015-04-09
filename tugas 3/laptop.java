class laptop{
	private String merk;
	private String warna;
	private String wifi;
	private int batrei;

	public laptop()
	{
		merk = "asus";
		warna ="hitam";
		wifi = "terhubung";
		batrei = 100;
	}
	 public laptop(String merkInput, String warnaInput)
	{
		merk =merkInput;
		warna =warnaInput;
	}
	public laptop(String merkInput, String warnaInput, String wifiInput)
	{
		merk =merkInput;
		warna =warnaInput;
		wifi =wifiInput;
	}
	public laptop(String merkInput, String warnaInput, String wifiInput, int batreiInput)
	{
		merk =merkInput;
		warna =warnaInput;
		wifi =wifiInput;
		batrei =batreiInput;
	}
	



	public void menyala()
	{

		System.out.println("welcome to laptop");
	}
	public void mati()
	{
		System.out.println("thankyou have a nice day");
	}
	public void indikatorbatrei()
	{
		System.out.println("batrei tinggal : " + batrei + "%");
	}
	public void NindikatorWifi()
	{
		System.out.println("wifinya : " + wifi);
	}

	public String getMerk()
	{
		return merk;
	}
	public String getWarna()
	{
		return warna;
	}
	public String getWifi()
	{
		return wifi;
	}
	public int getBatrei()
	{
		return batrei;
	}

	public String setMerk(String m)
	{
		return merk=m;
	}
	public String setWarna(String c)
	{
		return warna=c;
	}
	public String setWifi(String w)
	{
		return wifi=w;
	}
	public int setBatrei(int b)
	{
		return batrei=b;
	}


}