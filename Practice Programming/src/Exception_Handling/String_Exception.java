package Exception_Handling;

public class String_Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try 
		{
            String a = "This is like chipping "; 
            char c = a.charAt(24); 
            System.out.println(c);
        }
        catch(StringIndexOutOfBoundsException e) 
		{
            System.out.println(e);
        }
	}

}
