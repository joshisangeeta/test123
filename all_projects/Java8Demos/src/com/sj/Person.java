/**
 * 
 */
package com.sj;

/**
 * @author sangeeta
 *
 */
public class Person  {
	
	    int age;
	    String name;
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Person(int age, String name) {
			super();
			this.age = age;
			this.name = name;
		}
		public Person() {
			super();
			// TODO Auto-generated constructor stub
		}	    
	
	     public static int comparePersons(Person a,Person b,PersonComparator c)
	     {
	    	return  c.comparePersons(a, b);
	     }
	
	        
	     
	     
	     
	     
	     
	     
	     

}
