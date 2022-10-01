
public class Main {

	public static void main(String[] args) {
		
		int number=2;
		boolean value=true;
		
		System.out.println(number+" -> is this number a prime number ? ");
		
		if (number<=1) {
		System.out.println("this number isn't prime number");
		return;}
		 if (number==2){
			System.out.println("this number is prime number");return;}
		
		for (int i=2; i<number;i++) {
			
		    if (number%i==0) {
			 value=false;
			 
			} }
		if(value==false) {
			System.out.println("this number isn't prime number");}
			
		
		else if (value==true) {
			System.out.println("this number is prime number");
				
		}
			
		
	}}


