import java.io.*;
class MajorityElement{
	
	static void checkelement(int arr[],int n){
		int maxfreq=0;
		int element=0;
		for(int i=0;i<n;i++)
		{
			int count=0;
			for(int j=0;j<n;j++)
			{
				
				if(arr[i]==arr[j])
				{
					count++;
				}
			}
			if(count>maxfreq)
			{
				maxfreq=count;
				element=arr[i];
			}
		}
		if(maxfreq>(n/2))
		{
			System.out.println(element);
		}
		else
		{
			System.out.println("No majority Element");
		}
	}
	
	public static void main(String[] args)
	{
		int[] arr={3,3,4,2,4,4,2,4,2,4,2,3,2,2,6,2,2,7,2,2,1,2,2};
		int n=arr.length;
		checkelement(arr,n);
	}
}