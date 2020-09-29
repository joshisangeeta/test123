/**
 * 
 */
package com.sj.simpledemos;

/**
 * @author sangeeta
 *
 */
public class LambdaFunctionalDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MaxFinder finder = (int n1,int n2)->n1>n2?n1:n2;
		
		    int maxno =finder.max(8, 13);
		  System.out.println("maxno"+maxno);
		  
		  
		  
		//  System.out.println("greater no:"));
		  
		
	}
	
	

}
