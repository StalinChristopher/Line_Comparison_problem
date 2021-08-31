package MainPackage;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		double x1,y1;
		double x2,y2;
		double x3,y3;
		double x4,y4;
		Scanner in = new Scanner(System.in);
		System.out.println("Welcome to the line Computation program");
		
		//UC1
		System.out.println("Enter the co-ordinates of point 1 of line1");
		x1 = in.nextDouble();
		y1 = in.nextDouble();
		Point p1=new Point(x1,y1); //First point of the line
		
		System.out.println("Enter the co-ordinates of point 2 of line1");
		x2 = in.nextDouble();
		y2 = in.nextDouble();
		Point p2=new Point(x2,y2); //Second point of the line
		
		System.out.println("Enter the co-ordinates of point 1 of line2");
		x3 = in.nextDouble();
		y3 = in.nextDouble();
		Point p3=new Point(x3,y3);
		
		System.out.println("Enter the co-ordinates of point 2 of line2");
		x4 = in.nextDouble();
		y4 = in.nextDouble();
		Point p4=new Point(x4,y4);
		
		double l1= p2.Linelength(p1);
		System.out.printf("\nLength of the line1 between point p1(%.2f,%.2f) and p2(%.2f,%.2f) : %.2f",p1.x,p1.y,p2.x,p2.y,l1);
		
		double l2=p3.Linelength(p4);
		System.out.printf("\nLength of the line2 between point p1(%.2f,%.2f) and p2(%.2f,%.2f) : %.2f\n",p3.x,p3.y,p4.x,p4.y,l2);
		
		//Wrapping double variable inside object
		Double l1obj=l1;
		Double l2obj=l2;
		
		//Equals method 
		equalLength(l1obj,l2obj);
		
		//Compare line length
		compareLines(l1obj,l2obj);
		
	}
	
	public static void equalLength(Double l1obj, Double l2obj) {
		if(l1obj.equals(l2obj))
			System.out.println("Line l1 is equal to line l2");
		else
			System.out.println("Line l1 is not equal to line l2");
	}
	
	public static void compareLines(Double l1obj,Double l2obj) {
		//Using java compareTo method to compare the length of the two lines
			int compareVal=l1obj.compareTo(l2obj);
			if(compareVal<0) {
				System.out.println("Length of line l1 is less than line l2");
			}
			else if(compareVal>0) {
				System.out.println("Length of line l1 is greater than line l2");
			}
			else {
				System.out.println("Length of line l1 is equal to line l2");
			}
	}

}
