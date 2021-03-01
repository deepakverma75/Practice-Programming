
public class Star_Pattern_In_Java {

	public static void main(String[] args) {
		
		int i, j, k, l;

		for(i=0;i <=11;i++)
		{
		 
		for(j=10;j >=i;j--)
		{
		 System.out.printf(" ");
		}

		for(k=0;k <=2;k++)
		{
			System.out.printf("*");
		}

		for(l=1;l <=i;l++)
		{
		 
		if(i > 4 && i < 7)
		 {
			System.out.printf("**");
		 }
		 else
		 {
			 System.out.printf("  ");
		 }
		 
		}

		for(k=2;k>=0;k--)
		{
			System.out.printf("*");
		}

		//this loop is optional

		for(j=10;j >=i;j--)
		{
			System.out.printf(" ");
		}


		System.out.printf("\n");
		}
		}

	}


