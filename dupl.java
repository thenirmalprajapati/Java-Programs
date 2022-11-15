public class dupl 
{
	 public static int dup(int arr[])
	  {
	  	int i=0;
	  	int j=0;
		System.out.println("Your duplicate values are:");
		for(i=0;i< arr.length;i++)
		{
				for(j=i+1;j<arr.length;j++)
				{
					if(arr[i] == arr[j])
					{
						System.out.println(arr[j]);					
					}
				}
		}
		return 0;
	  }

	public static void main(String[] args)
	{
		int arr[] = {1,2,3,4,5,1,4};
		int n = dup(arr);
		for(int i=0;i<n;i++)
		{
		      	System.out.print(arr[i] + " ");
		}

	}

}
