package learn;
class calculator{
	//method-1
	int a  = 10;
	int b = 20;
	void add() {
		int c = a+b;
		System.out.println(c);	
	}
	//method-2
	int sub() {
		int d = a-b;
		return d;
	}	 
}

class division{
	int f;

	//method-3
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
		cal.div(20,30);	//pass by value
	}

}
