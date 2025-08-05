package learn;


class calculator{
	int a  = 10;
	int b = 20;
	void add() {
		int c = a+b;
		System.out.println(c);
		
	}
	
	int sub() {
		int d = a-b;
		return d;
	}
	
	
	 
}

class division{
	int f;
	void div(int a ,int b) {
		f = a+b;
		System.out.println(f);
	}
}

public class methods {
	
	public static void main(String[] args) {
		
		
		calculator calc = new calculator();
		calc.add();
		int res = calc.sub();
		System.out.println(res);
		
		division cal = new division();
		cal.div(20,30);
		
		for (int i=1; i<=5; i++) {
			for (int j=1; j<=5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}

}
