package learn;

public class practice {
	public static void main(String[] args) {
		int x = 5;
		System.out.println(fact(x));
	}
	
	public static int fact(int x) {
		if (x==0) {
			
			return 1;
			
		}
		return x*fact(x-1);
	}

}
