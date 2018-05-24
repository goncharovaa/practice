public class Point2D{

	private double X, Y;
	
	public Point2D() {
		X = Y = 0;
	}
	

	public Point2D(double X, double Y) {
		this.X = X;
		this.Y = Y;
	}
	

	public double getX() {
		return this.X;
	}
	public double getY() {
		return this.Y;
	}

	public void setX(double X) {
		this.X = X;
	}
	public void setY(double Y) {
		this.Y = Y;
	}
	
	public boolean Equals(Point2D point) {
		return this.X == point.getX() && this.Y == point.getY();
	}

	public double distanceTo(Point2D point) {
		return Math.sqrt(Math.pow(this.X-point.getX(), 2) + Math.pow(this.Y-point.getY(), 2));
	}
}