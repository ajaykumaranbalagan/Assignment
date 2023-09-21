package Week2Day2;

public class fibbinocci {

	public static void main(String[] args) {
		int a=0;
		int b=1;
		int c;
		//int count=15;
		System.out.print(" "+a);
		System.out.print(" "+b);
		for(int i=1;i<=15;i++) {
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
		}
		

	}

}
