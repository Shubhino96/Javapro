import java.io.*;
class wo
{
	public static void main(String args[])throws IOException
		{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		    int a[]=new int[4];
		    System.out.println("enter elements");
		    for(int i=0;i<a.length;i++)
		    {
				a[i]=Integer.parseInt(br.readLine());
			}
			System.out.println("Enter choice");
			int p=Integer.parseInt(br.readLine());
			System.out.println("enter number");
			int x=Integer.parseInt(br.readLine());
			System.out.print(x+" ");
			for(int i=0;i<a.length;i++)
			{
				System.out.print(a[i]+" ");
			}
			System.out.println();
			System.out.println("Enter choice");
			System.out.print(
			int v=Integer.parseInt(br.readLine());
			for(int i=0;i<a.length-1;i++)
			{
				System.out.print(a[i]+" ");
			}
		}
	}