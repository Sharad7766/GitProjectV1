package practice;
//AIM: Scanner-Accept i/p from User

import java.math.BigInteger;

/*
 * Scanner is class
 * Create a constr of scanner class & pass System.in as parameter
 * Means Get data from user with ref var --sc
 * Read that data by System...System.in-->points to keyboard...i.e.Accept input from User
 * Write data by Systema......System.out-->points to console...i.e.Out data to User
 * 
 * 1.sc=Input.next(); //takes no para & Reads string
 * 2.sc=Input.nextInt(); //Reads int val
 * 3.sc=Input.nextdouble();//Reads double val
 * 
 * Whenever we used above methods,Prog will pause & wait for i/p from user...
 * Then ,that i/p value will be returned by method
 */

import java.util.Scanner;

public class scanner 
{
  public static void main(String[] args) 
  {
//Scanner is class which accepts data from User
//s is ref var
	  
	Scanner Input=new Scanner(System.in);
/*
//1. I/p-String     //To accept String data from user--next();
	
	System.out.println("Enter Any String :");
	String name=Input.next();	
	
	System.out.println("Entered String1= "+name);

//Executes only when Entered data = Compared data
	String name2=Input.next("Shree");
	System.out.println("Entered String2= "+name2);
	
//2. I/p-Integer     //To accept int data from user--nextInt();
	
	System.out.println("Enter Any number :");
	int num=Input.nextInt();

	System.out.println("Entered Number= "+num);
	
//Executes only when	--issue
//	int num2=Input.nextInt(4);//radix
//	System.out.println("Entered Number2= "+num2);
	
		
//3. I/p-Float     //To accept Float data from user--next();
		
	System.out.println("Enter Any Float value :");
	Float fl=Input.nextFloat();

	System.out.println("Entered Float value= "+fl);
		
//4. I/p-Double     //To accept Double data from user--next();
		
	System.out.println("Enter Any Double value :");
	double d=Input.nextDouble();

	System.out.println("Entered value= "+d);

//5. I/p-Boolean     //To accept Boolean data from user--True.true,TRUE,False..	
	
	System.out.println("Enter Any Boolean value :");
	Boolean b=Input.nextBoolean();

	System.out.println("Entered value= "+b);
		
//6. I/p-byte     //To accept byte data from user--between 0 to 127 & -127 to 0
	
	System.out.println("Enter Any Byte value :");
	
	Byte byt=Input.nextByte();

	System.out.println("Entered value= "+byt);	
	
	//Radix
	//Byte byt1=Input.nextByte();

	//System.out.println("Entered value= "+byt1);
	
//7. I/p-Short     //To accept short data from user--next();	
	
	System.out.println("Enter Any Short value1 :");
	short sh= Input.nextShort();

	System.out.println("Entered value= "+sh);		
	
	//Radix
//	System.out.println("Enter Any Short value2 :");
//	short sh1= Input.nextShort(2);
//
//	System.out.println("Entered value= "+sh1);
	
//8. I/p-Long     //To accept Long data from user--next();	
	
	System.out.println("Enter Any Long value :");
	Long l=Input.nextLong();

	System.out.println("Entered value= "+l);		
		
//	System.out.println("Enter Any Long value2 :");
//	Long l2=Input.nextLong(2);
//
//	System.out.println("Entered value= "+l2);	
*/
//9. I/p-Big Integer     //To accept Big Integer data from user--next();	
	
	System.out.println("Enter Any Big Integer value :");
	BigInteger bi=Input.nextBigInteger();

	System.out.println("Entered value= "+bi);		
			
//	System.out.println("Enter Any Big Integer value :");
//	BigInteger bi2=Input.nextBigInteger(7);
//
//	System.out.println("Entered value= "+bi2);

	Input.nextLine();

  }
}
//Success