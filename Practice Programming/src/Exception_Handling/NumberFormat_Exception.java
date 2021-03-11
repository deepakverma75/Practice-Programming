package Exception_Handling;

public class NumberFormat_Exception {

	public static void main(String[] args) {
		
		String inputString = "123.33";
		try 
		{  
            int a = Integer.parseInt(inputString);  
		}	
		catch(NumberFormatException e)
		{  
			System.err.println(e);
		}
	}
}
