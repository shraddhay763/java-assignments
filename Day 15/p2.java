import java.util.*;
class Demo{
	public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter 1st Number");
	int a = sc.nextInt();
	System.out.println("Enter 2nd Number");
	int b = sc.nextInt();
	if(a<b){
		System.out.println("The Min Number Amongst " +a   +"&"  +b  +"is"  +a);
	}else {
		System.out.println("The Min Number Amongst " +a   +"&"  +b  +"is"  +b);
	}
    }
}