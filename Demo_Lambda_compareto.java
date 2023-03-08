package lambdaExpression_m;
import lambdaExpression_sc.*;

public class Demo_Lambda_compareto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ICompare ob = (int x, int y)->{
						if(x>y) {
							System.out.println("x is greater");
						}
						else {
							System.out.println("Y is grater");
						}
					};
		ob.compareTo(56, 10);
	}

}
