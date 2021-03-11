package Exception_Handling;

import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
public class Nested_Try {

	public static void main(String args[]) {
		
		try
		{
			int a=10;
			int b=10/1;
			try 
			{
				File f=new File("e://ABC1");
				System.out.println(f.exists());
                Scanner scan = new Scanner(f);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
	}
}
