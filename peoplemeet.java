import java.io.*;

class TwoPeopleMeet {
	static void swap(int x,int y)
	{
		int temp=x;
		x=y;
		y=x;
	}
	static boolean willMeet(int p1, int p2, int s1, int s2)
	{
		if(p1<p2 && s1<=s2)
		{
			return false;
		}
		if(p2<p1 && s2<=s1)
		{
			return false;
		}
		if(p1<p2)
		{
			swap(p1,p2);
			swap(s1,s2);
		}
		while(p1>=p2)
		{
			if(p1==p2)
			{
				System.out.println("They will meet at "+p1);
				return true;
			}
			p1=p1+s1;
			p2=p2+s2;
		}
		return false;
	}
	public static void main(String[] args)
	{
		int p1=6;
		int p2=4;
		int s1=6;
		int s2=8;
		if(willMeet(p1,p2,s1,s2))
		{
			System.out.println("Yes They will meet.");
		}
		else
		{
			System.out.println("No, they will never meet.");
		}
	}
}