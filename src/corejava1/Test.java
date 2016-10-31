package corejava1;

import java.io.IOException;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) throws IOException {

		double d[]={1,2,3,4,5,6,7,8,9,10,11};
	       
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the range :");
        int range=sc.nextInt();
        
        System.out.println((d.length%range)+ " remaing numbers are not coming into a group "+"\t");
        
        int remaingno=d.length%range;
                
        double restsum=0;
        
   
       
       Integer number= Test.getArrayLength(d, range);
     
       
   
       
       for (int r = d.length-1 ; r>(d.length-remaingno-1); r--) 
       {
		
    	   restsum=restsum + d[r];
    	   
       }
       
      
       double arr[]=new double[number];
       
        System.out.println(arr.length+" The length of the new arry");
        
        System.out.println("**************************************************");  
        
        int p=0;
        
        for( int m=0, j=0; j<(d.length-remaingno); ){   
             
            double average;
           
            double total=0.0;
           
            for(int l=0;l<range;l++)
            {
                 total=total+d[m];
                 m++;
                 
               
            }
            System.out.println(total+"............total");
           
            average=total/range;
           
            arr[p]=average;
            p++;
                       
           
            j+=range;
           

        }
        System.out.println(restsum+"restsum total");
        
        System.out.println("************************************************************");
        
        
        
        arr[p]=restsum/remaingno;

        System.out.println("so the average list ...................");
        
        for(int k=0;k<arr.length; k++){     

            System.out.println(arr[k]);

        }
        
        System.out.println("// note::: last average is not devided by range ; its divided by remaining numbers ........Its the exact way to find average.. This is correct procedure ");
        
    }
	
	
	
	
	 public static int getArrayLength(double[]numbers ,int range )
	    {
	        int length=0;

	        if(((numbers.length) % range)!=0)
	        {
	        	length= (numbers.length / range) + 1;

	        }
	        else{

	        	length= (numbers.length / range);

	        }

	        return length;
	        
	    }
	
	
}
