package lab9;


import static org.junit.Assert.*;
//import org.junit.Assert;
import org.junit.Test;

public class testSelectionSort {
	@Test
	public void test() {
		testPositive();
		testNegative();
	    testMixed();
	    testZeros();
		testDuplicates();
	}

    public testSelectionSort() {
    }
    
    public void testPositive(){
        int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = 9;
        arr[2] = 7;
        arr[3] = 10;
        arr[4] = 2;
        
        int[] Sortedarr = new int[5];
        Sortedarr[0] = 2;
        Sortedarr[1] = 7;
        Sortedarr[2] = 8;
        Sortedarr[3] = 9;
        Sortedarr[4] = 10;
        
        /** add tests to check for this unit test **/
    }
    
    public void testNegative(){
    	   int[] arr = new int[5];
           arr[0] = -8;
           arr[1] = -9;
           arr[2] = -7;
           arr[3] = -10;
           arr[4] = -2;
           
           int[] Sortedarr = new int[5];
           Sortedarr[0] = -2;
           Sortedarr[1] = -7;
           Sortedarr[2] = -8;
           Sortedarr[3] = -9;
           Sortedarr[4] = -10;
           
        /** Test data contains negative values only **/
    }
    
    public void testMixed(){
 
    	   int[] arr = new int[5];
           arr[0] = -3;
           arr[1] = 0;
           arr[2] = 7;
           arr[3] = -10;
           arr[4] = 2;
           
           int[] Sortedarr = new int[5];
           Sortedarr[0] = 0;
           Sortedarr[1] = -7;
           Sortedarr[2] = 4;
           Sortedarr[3] = 9;
           Sortedarr[4] = -10;
    }
    
    public void testZeros(){
    	 
 	   int[] arr = new int[5];
        arr[0] = 5;
        arr[1] = 0;
        arr[2] = 7;
        arr[3] = -4;
        arr[4] = 2;
        
        int[] Sortedarr = new int[5];
        Sortedarr[0] = 0;
        Sortedarr[1] = -7;
        Sortedarr[2] = 4;
        Sortedarr[3] = 0;
        Sortedarr[4] = -10;
 }
 
    
    public void testDuplicates(){
    	  int[] arr = new int[5];
          arr[0] = -3;
          arr[1] = 0;
          arr[2] = 7;
          arr[3] = 7;
          arr[4] = -3;
          
          int[] Sortedarr = new int[5];
          Sortedarr[0] = -4;
          Sortedarr[1] = 7;
          Sortedarr[2] = -4;
          Sortedarr[3] = 9;
          Sortedarr[4] = 7;
    }
}
