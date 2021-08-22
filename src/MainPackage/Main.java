package MainPackage;

public class Main {

	public static void main(String[] args) {
		System.out.println("Welcome to the line Computation program");
		
		//UC1
		Point p1=new Point(10,10); //First point of the line
		Point p2=new Point(20,20); //Second point of the line
		
		double length = p2.Linelength(p1);
		System.out.printf("\nLength of the line between point p1(%.2f,%.2f) and p2(%.2f,%.2f) : %.2f",p1.x,p1.y,p2.x,p2.y,length);
		
	}

}
