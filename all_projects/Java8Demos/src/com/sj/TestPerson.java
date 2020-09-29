/**
 * 
 */
package com.sj;

/**
 * @author sangeeta
 *
 */
public class TestPerson {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    Person p1 = new Person(34,"abc");
	    Person p2 =new Person(27,"xyzz");
	    
	     int diff=Person.comparePersons(p1, p2,(p3,p4)->{return p3.age - p4.age;} );
	
	     
	           if(diff>0)
	        	   System.out.println("p1 is older");
	           else
	        	   System.out.println("p2 is older");
	
	      
	
	     int diff1 = Person.comparePersons(p1,p2,(p3,p4)->{return p3.name.length() -p4.name.length();});
	
	     if(diff1>0)
      	   System.out.println("p1's name is longer");
         else
      	   System.out.println("p2's name is longer");
	   
	      }
	
	/*public int comparePersons(Person p1,Person p2)
	{
		
		 return (p1.age - p2.age);
		
	}*/
	

}

