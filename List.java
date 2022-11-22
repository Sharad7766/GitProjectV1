package practice;
//Print a string in revers Order...Exact Mirror

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class List 
{
  public static void main(String[] args)
  {
//Given a string
	  String f= "Sharad is a boy";
	  
	  System.out.println("Given String is: "+f);
	    
//1. Make it into ArrayList
	  
	  ArrayList<String> al= new ArrayList<String>();
	  al.add("Sharad");
	  al.add("is");
	  al.add("a");
	  al.add("boy");

//ListIterator-Func used to check & get values inside List

	 ListIterator<String> itr =al.listIterator();
	 
	 System.out.println("Fwd String is: ");
	 while(itr.hasNext())
	 System.out.print(itr.next());
	 
	 System.out.println();
	 
	 System.out.println("Bwd String is: ");
	 while(itr.hasPrevious())
	 System.out.print(itr.previous());
  }

}
