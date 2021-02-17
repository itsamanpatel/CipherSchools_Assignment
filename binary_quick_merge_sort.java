import java.io.*;

class Sorting{
	
	static void BinarySort(int[] arr,int n,int num)
	{
		int mid=0;
		int s_index=0;
		int l_index=n-1;
		while(arr[mid]!=num)
		{
			if(l_index>s_index)
			{
				mid=(l_index+s_index)/2;
				if(arr[mid]<num)
				{
					s_index=mid+1;
					mid=s_index;
				}
				else if(arr[mid]>num)
				{
					l_index=mid-1;
					mid=l_index;
				}
			}
			else
			{
				break;
			}
		}
		if(arr[mid]==num)
		{
			System.out.println("Element found at "+(mid+1)+" Position.");
		}
		else
		{
			System.out.println("Element not found.");
		}
	}
	public static void main(String[] args)
	{
		int[] arr={3,4,7,8,11,17,18,20,22};
		int n=arr.length;
		BinarySort(arr,n,3);
	}
	
}