class Demo{
	public static void main(String [] args){
	char ch = 'a';
	char ch1 = 'A';
	 for(int i=1;i<=5;i++){
	  for(int j=1;j<=i;j++)
		if(i%2==1){
			System.out.print(ch+" ");
		}else {
			System.out.print(ch1+" ");
		}
	   
			System.out.println();
	   }
	}
   }