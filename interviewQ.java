package practice;
//Decor-15/11/22

public class interviewQ 
{
  public static void main(String[] args) 
  {
	  boolean g;
	 g= method(2,4);
	  System.out.println(g);
  }
	

public static boolean method(int a, int b)
{
	int res=0;
	res=a+b;
	boolean c;

	if(res%2==0)
	{
	   System.out.println(res+" -No. is even");
	   c = true;
	}
   else
	{
	   System.out.println(res+" -No. is odd");
	   c = false;
	}
	return c;
}
}
