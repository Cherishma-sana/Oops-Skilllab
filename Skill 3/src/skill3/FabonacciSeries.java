package skill3;
import java.util.*;
public class FabonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int first=0,second=1;
		System.out.println("The fabonacci series are :" );
		for(int i=0;i<n;i++){
			System.out.print(first+" ");
			int next=first+second;
			first=second;
			second=next; 
		}
	}

}
