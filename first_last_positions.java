import java.io.*;

class FindPosition{
	
	static void getPositions(int[] arr, int n,int num)
	{
		int s_index=-1;
		int l_index=-1;
		int count=0;
		for(int i=0;i<n;i++)
		{
			if(arr[i]==num)
			{
				if(count==0)
				{
					s_index=i;
					count++;
				}
				l_index=i;
			}
		}
		if(count==0)
		{
			System.out.println("Element Not Found");
		}
		else
		{
			System.out.println("First Occurance is at position "+(s_index+1)+" and last occurance is at position "+(l_index+1));
		}
	}
	public static void main(String[] args)
	{
		int[] arr={3,4,7,9,5,5,6,7,3,3,4,5,6,9,5};
		int n=arr.length;
		getPositions(arr,n,5);
	}
}