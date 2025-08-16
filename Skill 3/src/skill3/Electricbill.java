package skill3;
import java.util.*;
public class Electricbill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the units consumed : ");
		int units=sc.nextInt();
		double billamount=0;
		if (units<=100) {
			billamount=units * 3;
		}
		else if(units>=101 && units<=300 ) {
			billamount=units * 5+100;
		}
		else if(units>=301 && units<=450) {
			billamount=units * 6+200;
		}
		else if(units>=450) {
			billamount=units * 8+250;
		}
		System.out.println("Total bill amount is : "+ billamount);
		sc.close();
		

	}

}
