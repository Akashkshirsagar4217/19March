package ArrayStudy;

public class SingleDimensionArrayStudy {

	public static void main(String[] args) 
	{
		
		//Akash Ashok Kshirsagar
		
		//Single Dimension Array
		
		//Array declaration
		String[] name = new String[3];
		
		//Array Declaration
		name[0]="Akash";
		name[1]="Ashok";
		name[2]="Kshirsagar";
		
		//Usage
		System.out.println(name[0]);
		System.out.println(name[1]);
        System.out.println(name[2]);
        
        System.out.println("================================");
        
       for(int i=0;i<=name.length-1;i++)
       {
    	   System.out.println(name[i]);
       }
	
       System.out.println("================================");
       for(int j=name.length-1;j>=0;j--)
       {
    	   System.out.println(name[j]);
       }
	}

}
