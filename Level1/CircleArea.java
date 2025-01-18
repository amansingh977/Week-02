// Importing Scanner class from util package 
import java.util.Scanner; 

// creating class to calculate area of circle
class AreaofCircle{
    
	// Specifying privae data members 
	private double radius; 
    
	// Creating constructor with required parameters
	public AreaofCircle(double radius){
	this.radius = radius; 
	}
	
	// Display circumference of a circle
	public void displayCircumference(double radius) {
		System.out.println("Circumference of a circle : " + 2 * 3.14 * radius);
	}
	
	// Display area of a circle
	public void displayArea(){
	    System.out.print("area of the circle is : "+ 3.14*radius*radius); 
	}
}
public class CircleArea{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in); 
		System.out.print("enter radius :" ); 
		double radius = input.nextDouble(); 

		AreaofCircle circle = new AreaofCircle(radius); 

		circle.displayarea(); 
		circle.displayCircumference();
		

		input.close(); 
	}
}