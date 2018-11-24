package sfwzs;
import java.util.Scanner;
public class zhiyinshu 
{
	public static void main(String[] args) 
	{
		   System.out.println("请输入一个正整数:");
		   Scanner a = new Scanner(System.in);
		   int n = a.nextInt();
		   for(int k = 1;k <= n/2;k++)
		   {
		      if(n % k == 0)
		        {
		    	  System.out.print(k+"*");
		          n = n/k;   
		          k = k - 1;  
		        }
		   System.out.print(n);        
		   }     
		               
        }
}
