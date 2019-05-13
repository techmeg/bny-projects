package practiceJavabook;

public class SimpleCircle {
	
	public static void main(String[] args) {
		
		//create a circle with radius 1
		SimpleCircle circle1 = new SimpleCircle();
		System.out.println("the area of circle radius " + circle1.radius + " equals " + circle1.getArea());
		
		//create a circle with radius of 25
		SimpleCircle circle2 = new SimpleCircle(25.);
		System.out.println("the area of circle radius " + circle2.radius + " equals " + circle2.getArea());
		
		//create a circle with radius of 30
		SimpleCircle circle3 = new SimpleCircle(30);
		System.out.println("the perimeter of circle radius " + circle3.radius + " equals " + circle3.getPerimeter());
		
		//change the radius of circle 3
		circle3.setRadius(100);
		System.out.println("the perimeter of circle radius " + circle3.radius + " equals " + circle3.getPerimeter());
		
	}
	double radius;
	
	//construct a circle with radius of 1
	SimpleCircle(){
		radius = 1;
	}
	//construct a circle with a specified radius
	SimpleCircle(double newRadius){
		radius = newRadius;
	}
	
	
	double getArea(){
		return radius*radius*Math.PI;
		
	}
	double getPerimeter() {
		return 2*radius*Math.PI;
	}
	void setRadius(double newRadius) {
		radius=newRadius;
	}

}
