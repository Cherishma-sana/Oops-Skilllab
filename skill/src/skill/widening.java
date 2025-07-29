package skill;

public class widening {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=123456789;
		System.out.println("Original int value:"+a);
		long longvalue=a;
		System.out.println("After widening for longvalue "+longvalue);
		float floatvalue=longvalue;
		System.out.print("After widening for floatvalue"+floatvalue);

	}

}
