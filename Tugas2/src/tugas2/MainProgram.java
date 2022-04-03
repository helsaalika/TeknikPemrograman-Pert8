package tugas2;

public class MainProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shape shape1 = new Shape("red", false);
		Circle circle1 = new Circle(10.0, "blue", true);
		Rectangle rectangle1 = new Rectangle(1.0, 2.0, "green", true);
		Square square1 = new Square(2.0);
		
		System.out.println(shape1.toString());
		System.out.println(circle1.toString());
		System.out.println("Luas nya adalah " + circle1.getArea());
		System.out.println(rectangle1.toString());
		System.out.println("Luas nya adalah " + rectangle1.getArea());
		System.out.println(square1.toString());
		System.out.println("Luas nya adalah " + square1.getArea());

	}

}
