package week1.day1;

public class MyCalculator {

	public static void main(String[] args) {
		Calculator obj=new Calculator();
		int var1 = obj.add(6,7,8);
	 System.out.println(var1);
	 	int var2 = obj.sub(1,2);
	 System.out.println(var2);	
	 	double var3 =obj.mul(1,2);
	 System.out.println(var3);
	    float var4=obj.divide(2,1);
	  System.out.println(var4);  
	}
}
