/* Enter a string and print the longest word of that string
   
   Enter your sentence:- find the longest's character
   
*/

/**
 * @author Gautam Goyal
 * 
 * Email: gautamgoyal24012001@gmail.com
 * 
 * Date: 13-09-2021
 * 
 * Version: 1.1
 * 
 */

// import java.util.ArrayList;  // for array-list only

import java.util.Scanner;

public class Longest_Word {

	public static void main(String[] args) {
				
        System.out.println("\n\n\n\t\t\tX--------Longest's-----------------Word-----------------In-----------------A-----------------Sentence--------X");
	    
		// Variables
		
		int i,j,k; 
		
		String str;
		
		Scanner sc = new Scanner(System.in);      // Using Scanner for user inputs

	    System.out.print("\n\nEnter a Sentence: "); // Asking for user input
	       
	    str = sc.nextLine();                      // Return User Input
	  
        k = str.length();                         // Length of the sentence
        
/*	  
        Part A done by in-built function
        
        ArrayList<String> list = new ArrayList<String>(); 
	    
	    for (String s : str.split("\\s"))  
	    {  
	       list.add(s);
	       
	    }
	    
	    System.out.println(list);
	    
	    System.out.println(list.get(1));
*/	    
	    
	    
        // Part A done manually to remove space and add words in an array and find the max length of the word
		
//        System.out.println("\n\n\n\t\t\tX---------------X-----------------------X--------------------X");
//        System.out.println("\n\t\t\t                          Part A ");

        
        // Variables 
        
		int p = 0, c = 0, m = 0;
		 
        char letter = 0;      
        
        String q=""; // To add each letter and create a word
        
        String[] word = new String[k]; // new array to store each word, no spaces are stored
        
        
    	for(i = m; i < k; i++) {  // m = 0;
        	
           
        	for(j=m; j < k; j++) { // m = 0;
                
            	 letter = str.charAt(j); // single letter  sentence used from above and the first letter be 'f'
                    
                if(j == k-1) {       // if last element which is in our case 'r'
                
                	m = j + 1;        
                	
                	q = q + str.charAt(j);   // it will add string and make it one word     th + e = the         	
                	
                	break;                // will break the loop 
                }
                
                else if(' '== letter) {           // if space
                   
                		m = j + 1;   // add 1 and goes to the next word
                    	
                		break;
                }
           
                else {            // it will count
                
                	q = q + str.charAt(j);   // t + h = th
                }
            	
            } // inner loop of j ends
        	
        	word[i] = q;  // store values in array 
        	q = "";      // value is none
        	
        } // outter loop of i ends
        
    	
        // Find MAX length of word from an array
        
		int max = 0, length = 0;
		
			for(j = 0; j < word.length; j++)
			{
				
				length = word[j].length(); // length of the word at index j
				
				if (j == 0)
					max = length;          // let the word is longest
				
				else if(max < length)  // if length is greater
					max = length;   // max changes else remains same				
			} // loop ends
			        

			
			// Part B
        
	        System.out.println("\n\t\t\tX-----------X-----------------------X--------------------X-----------------X--------------------X------------X");

//        System.out.println("\n\t\t\t                          Part B ");
        
        // Variable
        
        int count = 1;
                
        System.out.println("\n\nLongest word's occurred in a Sentence of length: " + max);
        
        for(i = 0; i < word.length; i++) {    	 // array length
         
        	if (word[i].length() == max) {
				
        		System.out.println("\n" + count + ". " + word[i]); // PRINTING every longest string
        		
        		count++;
			}
        }
     
       }	
	}

