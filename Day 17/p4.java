class Demo {
	public static void main(String[] args) {
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print((3 - i + j) + " ");
			}
			System.out.println();
		}
	}
}
