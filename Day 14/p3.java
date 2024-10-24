import java.util.*;
class Demo{
	public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Number");
	int a = sc.nextInt();
	 for(int i = 1; i<=10; i++){
		if(i%2==0){
			System.out.println("Cube of "  +i  +":"  +(i*i*i)  +" and Square of "  +i  +":"  +(i*i));
	         }else {
			System.out.println(" ");
		}
	    }
	}
    }