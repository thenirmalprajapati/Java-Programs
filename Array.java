public class Array{
	public static void main(String args[])
	{
		int []arr = new int[] {1,2,3,3,5,1,2,5};
		System.out.println("Your duplicate values are:");
		for(int i=0;i<arr.length;i++)
		{
				for(int j=i+1;j<arr.length;j++)
				{
					if(arr[i] == arr[j])
					{
						System.out.println(arr[j]);					
					}
				}
		}
	}
}
