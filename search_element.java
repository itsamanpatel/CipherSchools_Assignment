import java.io.*;

class SearchElement{
	
	static void search(int[][] arr,int find)
	{
		int n=arr.length;
		int i=0;
		int j=n-1;
		while(i<n && j>=0)
		{
			if(arr[i][j]==find)
			{
				System.out.println("Element Found at row "+(i+1)+" Column "+(j+1));
			}
			if(arr[i][j]>find)
			{
				j--;
			}
			else
			{
				i++;
			}
		}
		return;
		
	}
	public static void main(String[] args)
	{
		int[][] arr={{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
		search(arr,33);
	}
}