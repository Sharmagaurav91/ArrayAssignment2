package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ArrayAssignmentTest2 {
	
	static int[] displayArrayElementTwice(int new_randNumbers[]) {
				
		 System.out.print("Elements that appear more than twice are: ");
		
		 System.out.print("[");
		 for(int i = 0, j = 1; j < new_randNumbers.length ; j++, i++){
			    if(new_randNumbers[i] == new_randNumbers[j]){
			    	
			    	System.out.print(new_randNumbers[i]+",");
			    
			    	
			        while(j < new_randNumbers.length && new_randNumbers[i] == new_randNumbers[j]) 
			        j++;
			        i = j - 1; 
			  }
			 
		 }
		 System.out.print("]"+"\n"+"\n");
		return new_randNumbers;
		 
	}
	
	
	public static void main(String[] args) {
		int[] org_randNumbers = new int[50];
	
		// Generates 50 random integers between 1 and 20
        for (int i = 0; i < org_randNumbers.length; i++) {
            org_randNumbers[i] = (int) (Math.random() * 20 + 1);
        }
              
        
        
        // Sorting Array in ascending order
        Arrays.sort(org_randNumbers);
        
     // Displaying Array that stores 50 Random Integers between 1 and 20
        System.out.print("Arrays with 50 Random Numbers: ");
        System.out.println(Arrays.toString(org_randNumbers));
        System.out.println("\n");
           
        // Display Frequency of random elements in array
        displayArrayElementTwice(org_randNumbers);
           
        // New array to store the frequency of each elements in array
        int[] new_randNumbers=new int[org_randNumbers.length];
        int temp;
        for(int t=0;t<org_randNumbers.length-1;t++){
            for(int s=0;s<org_randNumbers.length-1;s++){
                if(org_randNumbers[s] > org_randNumbers[s+1]){   // use < for Descending order
                    temp = org_randNumbers[s+1];
                    org_randNumbers[s+1] = org_randNumbers[s];
                    org_randNumbers[s]=temp;
                    
                }
            }
        }
        
        
        System.out.println("----------------xxx------xxxx-----------------------");
        System.out.println("Number"+"\t"+"Frequency");
      
        int visited=-1;
       
        for(int p=0;p<org_randNumbers.length;p++) {
        	int count=1;
        	for(int q=p+1;q<org_randNumbers.length;q++) {
        		if(org_randNumbers[p]==org_randNumbers[q]) {
        			
        			count++;
        			new_randNumbers[q]=visited;
        		
        		}
        	
        	}
        	if(new_randNumbers[p] != visited)
        		new_randNumbers[p]=count;    
        	}
        
       
        
        for(int p=0;p<new_randNumbers.length;p++) {
        	if(new_randNumbers[p] != visited) { 
        		
        		System.out.println(" "+org_randNumbers[p]+"\t"+"\t"+new_randNumbers[p]);
        	}
        }

}
}
