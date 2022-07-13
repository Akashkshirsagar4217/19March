package collectionstudy;

import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;

public class HashSetStudy {

	public static void main(String[] args)
	{
		HashSet hs = new HashSet();
		hs.add("Akash");
		hs.add("Akash");
		hs.add("Ashok");
		hs.add("Kshirsagar");
		hs.add('A');
		hs.add(10);
		hs.add(10.10);
		hs.add(true);
		
		System.out.println(hs);
		
		System.out.println( hs.contains('z'));     //Contains
		
		System.out.println(hs.size());             //Size
		
		
		// For Each loop
		for(Object a:hs)
		{
			System.out.println(a);
			
		}
		
		//For Loop
		/*for(int b=0;b<=hs.size()-1;b++)
		{
			System.out.println(hs.get(b));
		}
		*/
		
		//Iterator
		
		Iterator it = hs.iterator(); 
		
		while(it.hasNext())
		{
			System.out.println(it.next());
			
		}
		
		
		

	  


	}

	
	}


