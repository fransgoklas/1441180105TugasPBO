class Test{
public static void main(String[] args) {
		circle cahya = new circle();
		circle frans = new circle(30);
		circle goklas = new circle(80, "Putih Tua");

		cahya.setColor("Pinkyyyyyy");

		System.out.println("Radius = "+ cahya.getRadius() +" Color = "+cahya.getColor()+" Luas = "+cahya.getArea());
		System.out.println("Radius = "+ frans.getRadius() +" Color = "+frans.getColor()+" Luas = "+frans.getArea());
		System.out.println("Radius = "+ goklas.getRadius() +" Color = "+goklas.getColor()+" Luas = "+goklas.getArea());
		}
}