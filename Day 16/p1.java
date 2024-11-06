import java.util.Scanner;

class Demo {
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		System.out.println("Enter number : ");
		int a = sc.nextInt();
		for(int i = 1; i <= a / 2; i++) {
			if(a % i == 0)
				sum += i;
		}
		if(a> 0 && sum == a) {
			System.out.println("Perfect");
		} else {
			System.out.println("Not Perfect");	
		}
	}
}