package MainPackage;

public class Point {
	double x;
	double y;
	Point(double x,double y){
		this.x=x;
		this.y=y;
	}
	
	double Linelength(Point p) {
		double x1,y1,x2,y2;
		x1=this.x;
		y1=this.y;
		x2=p.x;
		y2=p.y;
		return Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2));
	}
	
	
}
