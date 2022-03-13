public class Main{

	public static void main(String[] args){

		Rectangle recObj1 = new Rectangle(20, 10);

		System.out.println(recObj1);

		System.out.println("The perimeter is: " + recObj1.getPerimeter());
		System.out.println("The area is: " + recObj1.getArea());

		recObj1.setWidth(1);
		System.out.println(recObj1);

		System.out.println("The perimeter is: " + recObj1.getPerimeter());
		System.out.println("The area is: " + recObj1.getArea());
	}
}