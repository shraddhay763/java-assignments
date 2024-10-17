import java.util.*;
class Demo{
	public static void main(String[]args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter 1st Number");
	int a = sc.nextInt();
	System.out.println("Enter 2nd Number");
	int b = sc.nextInt();
	Codex chavi = new Codex();
	chavi.mult(a,b);
	chavi.div(a,b);
	
     }
  }

class Codex{
	 void mult(int a,int b){
	 int mult= a*b;
		System.out.println("Multiplication is "   +mult);
	}
	 void div(int a,int b){
	 if(b>a){
	 int div= b/a;
		System.out.println("Division is "   +div);
	}else {
		System.out.println();
	  }
       }
    }
 