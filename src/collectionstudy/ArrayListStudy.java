package collectionstudy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListStudy {

	public static void main(String[] args) 
	{
	 ArrayList al = new ArrayList();
	  al.add("Akash");
	  al.add("Ashok");
	  al.add("kshirsagar");
	  al.add('A');
	  al.add(11);
	  al.add(11.11);
	  al.add(83.80);
	  
	 System.out.println(al);
	 System.out.println(al.size());                       //size[length]
	 System.out.println(al.indexOf("Akash"));             //index
	 System.out.println(al.indexOf(11.11));              
	 
	 System.out.println(al.lastIndexOf('A'));       //lastindexof
	 System.out.println(al.lastIndexOf(11));
	// al.set(3, 'B');
	 //System.out.println(al);
	  //al.add(4, 22);
	 //System.out.println(al);
	 al.add(0, "akki");
	 al.add(8,"k'sagar");
	 System.out.println(al);
	 
 System.out.println("============================");
	

       //iterator by using FOR LOOP
       for(int i=0;i<=al.size()-1;i++)
       {
    	   System.out.println(al.get(i));
       }
System.out.println("============================");

        //For Each loop   
       for(Object h:al)
       {
    	   System.out.println(h);
       }
 System.out.println("============================"); 
 
 // iterator By using WHILE LOOP \\hasNext
	Iterator it = al.iterator();
	 
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
System.out.println("============================"); 

ListIterator LI = al.listIterator();
    while(LI.hasNext())
    {
    	System.out.println(LI.next());
    }









	 
	}

}
