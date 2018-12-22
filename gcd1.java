import java.io.*;
import java.util.Scanner;
import java.lang.Math; 
class gcd1
  {
    public static void main(String[] args)
    {
      int a[]=new int[11];
            int b[]=new int[11];
      int j=1;
      int gcd=1;
      int lcm=1;
      int i;
      int k;
      int q=0;
      int n;
           int m;
      int e=1;
           int count=0;
      System.out.println("enter the value of n");
      Scanner obj=new Scanner(System.in);
      n=obj.nextInt();
            System.out.println("enter the value of m");
            m=obj.nextInt();
      System.out.println("enter the elements in 1st array");
      for(i=1;i<=n;i++)
      {
       a[i]=obj.nextInt();
       }
            System.out.println("enter the elements in 2nd array");
            for(i=1;i<=m;i++)
            {
             b[i]=obj.nextInt();
           }
	     while((j!=0)&&(j<=b[1]))
		   {
			   k=0;
			   for(i=1;i<=m;i++)
			   {
				   if(b[i]%j==0)
				   {
					   k++;
				   }
			   }
			   if(k==m)
			   {
				   gcd=j;
			   }
			   j++;
		   }
		   System.out.println("gcd="+gcd);
		   System.out.println("--------------------------------------------");
		   for(j=1;j<=gcd;j++)
		   {
			   k=0;
			   if(gcd%j==0)
			   {
				   for(i=1;i<=n;i++)
				   {
					   if(j%a[i]==0)
					   {
						   k++;
					   }
				   }
			   }
			   if(k==n)
			   {
				   count++;
			          e=j;
			System.out.println("j="+e);
			System.out.println("count="+count);
			   }
		   }
		   
    /*for(i=1;i<=n;i++){
             lcm=lcm*a[i];
         }
         System.out.println("lcm="+lcm);
         e=lcm/gcd;
         System.out.println("--------------------------------------------");
    System.out.println("gcd="+gcd);*/
	System.out.println("--------------------------------------------");
	System.out.println("--------------------------------------------");
    System.out.println(count);
    /*System.out.println("lcm="+e);*/

}
  }
