package Replits;

public class Carpet {
	public static void main(String[] args) {
		/*
		 Carpet class has following public double instance variables: width, length, unitPrice, totalPrice
and a public boolean variable isPersian. true if carpet object is Persian and false if it is not.

Add following constructors:

1) No-Args constructor
  -sets default values for the Carpet object
   Size is 300 x 300 and totalPrice for that is 200. And also it is not a Persian carpet. unitPrice is set as 0.

2) 4-Args  Constructor:
- accepts width, length, unitPrice, isPersian  parameters and assigns values to public instance variables. try to use this. keyword
		 */
		   
	    Carpet c  = new Carpet();
	
	    
	    System.out.println(c.totalPrice);
	    

	  }
	
	
	double width;
	double length;
	double unitPrice;
	double totalPrice;
	boolean isPersian;
	
	public Carpet(){
		
		width=300;
		length=300;
		totalPrice=200;
		
		
		
		
		
		
		
	}
	public Carpet(double width,double length,double unitPrice,boolean isPersian) {
this.width=width;
this.length=length;
this.unitPrice=unitPrice;
this.isPersian=isPersian;

totalPrice=(width+length)*unitPrice;

if(isPersian==true) {
	unitPrice=200;
}else {
	unitPrice=0;
}


	}

	




}
