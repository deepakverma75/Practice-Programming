import java.util.Scanner;

public class Maximum_Number_In_Array {
	public static int maximum(int arr[])
	{
		int max=arr[0];
		for(int i:arr)
		{
			if(i>max)
				max=i;
		}
		return max;
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array size : ");
		int arrSize=sc.nextInt();
		int arr[]=new int[arrSize];
		System.out.println("Enter Array elements : ");
		for(int i :arr)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Maximum number is : "+maximum(arr));

	}

}
