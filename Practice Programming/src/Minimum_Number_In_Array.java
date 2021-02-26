

public class Minimum_Number_In_Array {

	public static int minimum(int arr[])
	{
		int min=arr[0];
		for(int i:arr)
		{
			if(i<min)
				min=i;
		}
		return min;
	}
	
	public static void main(String[] args) {
	
		int arr[]= {10,30,50,40,20};
		System.out.println("Minimum is : "+minimum(arr));

	}
}
