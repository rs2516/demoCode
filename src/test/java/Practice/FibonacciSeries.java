package Practice;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int fibo1= 0;
		int fibo2= 1;
		int fibo3;
		System.out.print(fibo1 + " "+ fibo2);
		
		for(int i= 1; i<=10; i++)
		{			
			fibo3= fibo1+fibo2;
			System.out.print(" " +fibo3);
			fibo1= fibo2;
			fibo2= fibo3;
			
		}

	}

}
