package skill2;
import java.util.*;
public class TwoStriBuilJoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		StringBuilder A =new StringBuilder();
		StringBuilder B = new StringBuilder();
		System.out.println("Enter the first string :");
		A.append(sc.nextLine());
		System.out.println("Enter the second string :");
		B.append(sc.nextLine());
		A.append(B);
		System.out.println("After joing");
		System.out.println(A);
	}

}
