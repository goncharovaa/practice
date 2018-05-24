import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);

		Point2D point1 = new Point2D(inp.nextDouble(), inp.nextDouble());
		Point2D point2 = new Point2D(inp.nextDouble(), inp.nextDouble());

		inp.close();

		System.out.print(point1.Equals(point2) ? "point1 = point2" : "point1 != point2");
	}
}