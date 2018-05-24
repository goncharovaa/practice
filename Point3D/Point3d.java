public class Point3d{
	

	private double X, Y, Z;
	

	public Point3d() {
		X = Y = Z = 0;
	}
	

	public Point3d(double X, double Y, double Z) {
		this.X = X;
		this.Y = Y;
		this.Z = Z;
	}
	

	public double getX() {
		return this.X;
	}
	public double getY() {
		return this.Y;
	}
	public double getZ() {
		return this.Z;
	}	
	public void setX(double X) {
		this.X = X;
	}
	public void setY(double Y) {
		this.Y = Y;
	}
	public void setZ(double Z) {
		this.Z = Z;
	}
	

	public boolean Equals(Point3d point) {
		if(this.X == point.getX() && this.Y == point.getY() && this.Z == point.getZ())
			return true;
		return false;
	}


	public double distanceTo(Point3d point) {
		return Math.sqrt(Math.pow(this.X-point.getX(), 2) + Math.pow(this.Y-point.getY(), 2) + Math.pow(this.Z-point.getZ(), 2));
	}
	
}