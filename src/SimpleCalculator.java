import javax.swing.JOptionPane;

public class SimpleCalculator {
	public static void main(String[] args) {
SimpleCalculator sc = new SimpleCalculator() ;
	sc.start();
	}
void start(){
	
		// 1. Get 2 numbers from the user and convert them to integer.
int i = Integer.parseInt(JOptionPane.showInputDialog("give me one number"));
int n = Integer.parseInt(JOptionPane.showInputDialog("give me another number"));
		// 2. Customize pop-up to support add/subtract/multiply/divide operations.
		int operation = JOptionPane.showOptionDialog(null, "The question", "Pop-up Title", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "+", "-", "*", "/" },
				null);

		// 5. Call the methods created in steps 3 and 4 to perform the appropriate operation.
if (operation == 0) {
	add(i,n);
}
if (operation == 1) {
	subtract(i,n);
}
if(operation == 2)
{
	multiply(i,n);
}
if(operation == 3)
{
	divide(i,n);
}

		// 6. Wrap steps 1, 2 and 5 in a for loop to repeat calculator operations
	
	
		
	for(int t = 0;t<10;t++) {
	}

}
	// 3. Create method for addition operation.
	
	 static void add(int i, int n) {
		int t = i += n;
		JOptionPane.showMessageDialog(null, t);
	}
	//    Method should create pop-up that shows equation and solution, eg. 45 + 25 = 70.
	//    HINT: use 'static void add(int num1, num2) { ... }
	 static void subtract(int i , int n) {
		 int t = i-=n;
		 JOptionPane.showMessageDialog(null, t);
	 }

	// 4. Create similar methods for subtraction, multiplication and division.
	 static void multiply(int i , int n) {
		 int t = i*=n;
		 JOptionPane.showMessageDialog(null, t);
	 }
	 static void divide(int i , int n) {
		 int t = i/=n;
		 JOptionPane.showMessageDialog(null, t);
	 
	 
	 
	 } 
}
