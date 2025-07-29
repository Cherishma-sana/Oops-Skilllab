package skill;

public class Wrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=30;
		Integer i=Integer.valueOf(a);
		Integer j=a;//autoboxing ,now compiler will write Integer.valueOf(a)internally
        System.out.println(a+" "+j+" "+i+" ");
	}

}
