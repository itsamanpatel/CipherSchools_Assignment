import java.io.*;
class PeekElement{
	
	static void getElement(int a[],int n)
	{
		if(n==1)
		{
			System.out.print(a[0]+" ");
		}
		
		for(int i=0;i<n-1;i++)
		{
			if(i==0)
			{
				if(a[0]>=a[1])
				{
					System.out.print(a[0]+" ");
				}
			}
			else if(i==(n-2))
			{
				if(a[i]>=a[i+1] && a[i]>=a[i-1])
				{
					System.out.print(a[i]+" ");
				}
				
			}
			else
			{
			if(a[i]>=a[i-1] && a[i]>=a[i+1])
			{
				System.out.print(a[i]+" ");
			}
			}
			
		}
		if(a[n-2]<=a[n-1])
		{
			System.out.print(a[n-1]+" ");
		}
		
	}
	public static void main(String[] args)
	{
		int[] arr={50,40,60,30,10,90,67,20,36,15,70,90};
		int n=arr.length;
		System.out.println("Peek Elements -");
		getElement(arr,n);
	}
}