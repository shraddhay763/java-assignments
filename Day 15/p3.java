import java.util.*;
class Demo{
	public static void main(String[]args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Distance");
	int dis = sc.nextInt(); 
	System.out.println("Time");
	int ti = sc.nextInt();
	int velo = dis/ti;
		System.out.println("The velocity of a particle roaming in space is  "    +velo);
      }
 }	