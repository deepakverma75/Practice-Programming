import java.util.Scanner;

public class Search_Item {
	public static boolean contains(int arr[],int n )
	{
		for(int i:arr)
		{
			if(i==n)
				return true;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array size : ");
		int arrSize=sc.nextInt();
		int arr[]=new int[arrSize];
		System.out.println("Enter Array elements : ");
		for(int i :arr)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter element to be search : ");
		int n=sc.nextInt();
		if(contains(arr,n))
		{
			System.out.println(n+" -Element is present in array");
		}
		else
		{
			System.out.println(n+" -Element is present in array ");
		}

	}

}
