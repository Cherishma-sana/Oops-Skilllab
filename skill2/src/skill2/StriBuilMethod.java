package skill2;
import java.util.*;
public class StriBuilMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		StringBuffer A=new StringBuffer();
		StringBuffer B=new StringBuffer();
		System.out.println("Enter the  A string : ");
		A.append(sc.nextLine());
		System.out.println("Enter the B string : ");
		B.append(sc.nextLine());
		A.append(B);
		System.out.println("Joing the strings"+ A);
		System.out.println("Insert "+ A.insert(2, B));
		System.out.println("Repalce " + A.replace(1,4,"A"));
		System.out.println("Delete in A " + A.delete(1,3));
		System.out.println("Replace A "+ A.reverse());
		System.out.println("Capcity of A" + A.capacity());

	}

}
