import java.io.*;

class ArraySort{
	
	static void sortArray(int[] a,int n)
	{
		int s_index=0;
		int l_index=n-1;
		int mid=0;
		
		while(mid<=l_index)
		{
			switch(a[mid])
			{
				case 0:
					//swap(a[0],a[l_index]);
					int temp=a[s_index];
					a[s_index]=a[mid];
					a[mid]=temp;
					s_index++;
					mid++;
					break;
				case 1:
					mid++;
					break;
				case 2:
					//swap(a[mid],a[l_index]);
					int temp1=a[mid];
					a[mid]=a[l_index];
					a[l_index]=temp1;
					l_index--;
					break;
			}
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	public static void main(String[] args)
	{
		int[] arr={1,2,0,0,0,2,1,2,2,2,1,1,1,1,1,0,0,2,0,0,2};
		int n=arr.length;
		sortArray(arr,n);
	}
}