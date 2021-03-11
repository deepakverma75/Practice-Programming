package Exception_Handling;

import java.io.*;

public class Throw_Throws {
	
		  void m()throws FileNotFoundException{ 
			  File file=new File("d://MyFile");
		    throw new FileNotFoundException("File Not Found");  
		  }  
	  
		  void p(){  
		   try
		   {  
		    m();  
		   }
		   catch(Exception e)
		   {
			   System.out.println("File Not Found exception handled");}  
		  }  
		  
		  public static void main(String args[]){  
		   
		   Throw_Throws obj=new Throw_Throws();  
		   obj.p();  
		   System.out.println("normal flow...");  
		  }  
		}


