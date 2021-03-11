package Exception_Handling;

public class Array_Exception {
	public static void main(String args[])
	{
		int[] myNumbers = {1, 2, 3};
		try
		{
	    System.out.println(myNumbers[10]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
	}

}
