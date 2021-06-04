import java.util.Scanner;

class Addition{
	public static void main(String[] args) {

	int a,b,c=0;
	Scanner s=new Scanner(System.in);
	System.out.println("Entre the First Value: ");
	a=s.nextInt();
	System.out.println("Entre the Second Value: ");
	b=s.nextInt();
	
	c=a+b;

	System.out.println("Sum of two number=" +c);
}
}