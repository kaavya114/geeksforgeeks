import java.io.*;
import java.util.*;
public class Kadane
{
	public static void main()throws IOExceptio
	{
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		for( int i = 0; i < T; i++)
		{
			int N=sc.nextInt();//size of array
			int a[]=new int[N];
			int max_end_here=0;
			int max_sum=0;
			for( int j = 0; j < N; j++)
			{
               max_end_here=max_end_here + a[j];
               if(max_end_here < = 0)
               {
                  max_end_here=0;
               }
               else
               {
               	 if( max_end_here > max_sum)
               	 {
               	 	max_sum=max_end_here;
               	 }
               }
			}
			System.out.println("Max Contigious Sum ="+max_sum);
		}
	}
}