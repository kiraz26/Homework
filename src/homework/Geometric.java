package homework;

public class Geometric {
	double length;
	double width;
	double area;
	double perimeter;
	
	public double calculatePerimeter(double length, double width) {
		double perimeter=(length+width)*2;
		return perimeter;
	}
	public double calculateArea(double length, double width) {
		double area=length*width;
		return area;
	}
}
