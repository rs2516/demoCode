package Practice;

public class Palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a= "MADAM";
		String t= "";
		
		for(int i=a.length()-1; i>=0; i--)
		{
			char b=a.charAt(i);
			t=t+b;
			
		}
		System.out.print(t);

	}

}
