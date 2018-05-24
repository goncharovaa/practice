import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		Point3d point1 = new Point3d(inp.nextDouble(), inp.nextDouble(), inp.nextDouble());
		Point3d point2 = new Point3d(inp.nextDouble(), inp.nextDouble(), inp.nextDouble());
		Point3d point3 = new Point3d(inp.nextDouble(), inp.nextDouble(), inp.nextDouble());	
		
		inp.close();
		
		if(point1.Equals(point2) || point1.Equals(point3) || point2.Equals(point3))
			System.out.print("Impossible");
		else
			System.out.print("S = " + computeArea(point1, point2, point3));
		
	}
	
	
	public static double computeArea(Point3d p1, Point3d p2, Point3d p3) {
		double a = p1.distanceTo(p2);
		double b = p2.distanceTo(p3);
		double c = p3.distanceTo(p1);
		
		double p = (a+b+c)/2;
		
		return Math.sqrt(p*(p-a)*(p-b)*(p-c));
	}

}