import java.util.*;
class Demo{
	public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter 1st Number");
	int a = sc.nextInt();
	System.out.println("Enter 2nd Number");
	int b = sc.nextInt();
	System.out.println("Enter 3rd Number");
	int c = sc.nextInt();
	if(a>b && a>c){
		System.out.println("The Maximum number amongst  "  +a     +b   +" & "   +c     +" is "   +a );
	}else if(b>c && b>a) {
		System.out.println("The Maximum number amongst  "  +a     +b   +" & "   +c     +" is "   +b );
	}else if(c>a && c>b) {
		System.out.println("The Maximum number amongst  "  +a     +b   +" & "   +c     +" is "   +c );
	}else {
		System.out.println();
	
	}
    }
}
	
	
	
	