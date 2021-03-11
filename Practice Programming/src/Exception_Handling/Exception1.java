package Exception_Handling;

public class Exception1 {

	public static void main(String args[])
	{
		int a=10;
		try
		{
			int b=10/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
	}
}
