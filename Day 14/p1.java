import java.util.*;
class Demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st Number : ");
		int a = sc.nextInt();
		System.out.println("Enter 2nd Number : ");
		int b = sc.nextInt();
		for(int i = a; i <= b; i++) {
			System.out.print(i% 2 == 1 ? i + " " : "");
		}
	}
}
