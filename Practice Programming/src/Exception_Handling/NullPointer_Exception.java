package Exception_Handling;

public class NullPointer_Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try 
		{
            String a = null; 
            System.out.println(a.charAt(0));
        } 
		catch(NullPointerException e) 
		{
            System.out.println(e);
        }
	}

}
