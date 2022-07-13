package collectionstudy;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorClassStudy {

	public static void main(String[] args) 
	{
	Vector VC = new Vector();
			VC.add("Akash");
			VC.add("Ashok");
			VC.add("Kshirsagar");
			VC.add('A');
			VC.add(83.80);
			VC.add(88);
			
			System.out.println(VC);
System.out.println("*********************************");	
              //**For LOOP**
                for(int i=0;i<=VC.size()-1;i++)
			{
				System.out.println(VC.get(i));
			}
System.out.println("*********************************");
                //FOR EACH LOOP
           for(Object k:VC)
           {
        	   System.out.println(k);
           }
System.out.println("*********************************");	
			
           //Using ITERATOR
         Iterator it = VC.iterator();
     
         while(it.hasNext())
         {
        		System.out.println(it.next());
         }
  System.out.println("*********************************");
         
         //LIST-ITERATOR
        ListIterator LI = VC.listIterator();
        while(LI.hasNext())
        {
        	System.out.println(LI.next());
        }
 System.out.println("*********************************");	
 
     //ENUMRATION
   Enumeration en= VC.elements();
    while(en.hasMoreElements())
    {
    	System.out.println(en.nextElement());
    }
        		 
	}

}
