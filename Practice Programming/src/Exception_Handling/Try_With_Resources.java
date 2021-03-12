package Exception_Handling;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Try_With_Resources {

	public static void main(String[] args)throws Exception
	{
		// TODO Auto-generated method stub
		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in)))
		{
			String str="";
			str=br.readLine();
			System.out.println(str);
		}
		
	}
}
