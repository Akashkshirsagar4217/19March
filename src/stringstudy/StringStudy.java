package stringstudy;

public class StringStudy {

	public static void main(String[] args) 
	{
		String S1= new String("Akash");
		System.out.println(S1);

		String S2= "Kshirsagar";
		System.out.println(S2);
		
		String S3="VELOCITY";
		String S4="velocity";
	    String S5="velocity";
	    String S6="veloCITY";
	    String S7="";
        		
	    System.out.println("===============================");
		//Length
		System.out.println(S1.length());
		int len = S2.length();
	    System.out.println(len);
	  
	    System.out.println("===============================");
	    //To Uppercase
	    System.out.println(S1.toUpperCase());
	    String upper = S2.toUpperCase();
	    System.out.println(upper);
	    System.out.println(S4.toUpperCase());
	   
	    System.out.println("===============================");
	    //To lowercase
	    System.out.println(S1.toLowerCase());
	    String lower = S2.toLowerCase();
	    System.out.println(lower);
	    
	    System.out.println("===============================");
	    //equals
	    System.out.println(S3.equals(S4));    //case sensitive
	    System.out.println(S4.equals(S5));
	    
	    System.out.println("===============================");
	    //==
	    System.out.println(S3==S4);
	   System.out.println(S5==S4);
	   System.out.println(S1==S2);
	   
	   System.out.println("===============================");
	   //equalsIgnoreCase
	   System.out.println(S3.equalsIgnoreCase(S4));
	   System.out.println(S5.equalsIgnoreCase(S6));
	   
	   System.out.println("===============================");
	   //contain
	   System.out.println(S1.contains("Akas"));
	    System.out.println(S6.contains("CITY"));         //case sensitive
	
	    System.out.println("===============================");
	    //isEmpty
	    System.out.println(S1.isEmpty());
	    System.out.println(S7.isEmpty());
	    
	    System.out.println("===============================");
	    //charAt
	    System.out.println(S1.charAt(4));
	    System.out.println(S6.charAt(6));
	    
	    System.out.println("===============================");
	    //endswith
	    System.out.println(S1.endsWith("sh"));
	    System.out.println(S5.endsWith("city"));
	    System.out.println(S4.endsWith("CITY"));  //case sensitive
	    
	    System.out.println("===============================");
	    //startswith
	    System.out.println(S1.startsWith("Ak"));
	    System.out.println(S2.startsWith("Kshi"));  //case sensitive
	    
	    System.out.println("===============================");
	    //substring
	    System.out.println(S1.substring(2));
	    System.out.println(S2.substring(3, 7));
	    
	    System.out.println("===============================");
	    //concat
	    System.out.println(S1.concat(S2));
	    System.out.println(S3.concat(S4));
	    
	    System.out.println("===============================");
	    //indexof
	    System.out.println(S4.indexOf("o"));
	    System.out.println(S2.indexOf("K"));
	    
	    System.out.println("===============================");
	    //lastindexof
	    System.out.println(S3.lastIndexOf("Y"));
	    System.out.println(S2.lastIndexOf("a"));
	    
	    System.out.println("===============================");
	    //replace
	    System.out.println(S1.replace("ka","ta" ));
	    
	}

}
