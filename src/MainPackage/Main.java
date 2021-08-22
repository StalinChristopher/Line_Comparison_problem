package MainPackage;

public class Main {

	public static void main(String[] args) {
		System.out.println("Welcome to the line Computation program");
		
		//UC1
		Point p1=new Point(10,10); //First point of the line
		Point p2=new Point(20,20); //Second point of the line
		
		double l1= p2.Linelength(p1);
		System.out.printf("\nLength of the line between point p1(%.2f,%.2f) and p2(%.2f,%.2f) : %.2f",p1.x,p1.y,p2.x,p2.y,l1);
		
		Point p3=new Point(25,30);
		Point p4=new Point(35,40);
		double l2=p3.Linelength(p4);
		System.out.printf("\nLength of the line between point p1(%.2f,%.2f) and p2(%.2f,%.2f) : %.2f\n",p3.x,p3.y,p4.x,p4.y,l2);
		
		//Wrapping double variable inside object
		Double l1obj=l1;
		Double l2obj=l2;
		
		//Using .equals method from java
		if(l1obj.equals(l2obj))
			System.out.println("Line l1 is equal to line l2");
		else
			System.out.println("Line l1 is not equal to line l2");
	}

}
