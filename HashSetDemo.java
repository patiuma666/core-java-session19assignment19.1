/*
 * showing a HashSet using iterator  by taking the student objects
 */

package assignment19HashSet; //creating package name as assignment19HashSet

import java.util.HashSet;
import java.util.Iterator;

class Student{  //creating class as Student 
	
	String name; //taking three three properties 
	int rollno;
	String department;
	
	public Student(String name,int rollno,String department){ //creating a constructor for the student class 
		this.name = name;                       //and passing three arguments
		this.rollno = rollno;
		this.department = department;
		
	}
	@Override
    public String toString() // to  return values of the objects we taking toString() method of the object class
    { 
        return name+ ", " +rollno+ ", " +department;
    }

}
             public class HashSetDemo {                  //here created main class as HashSetDemo

	                   public static void main(String[] args) {    //created main method
	                	   
	            HashSet <Student>setlist = new HashSet<Student>();  //creating a HashSet object of setlist 
	            
		 Student student1 = new Student ("Shanthi"  ,8, "IIT");  //creating object for the student class and initializing elements
		 Student student2 = new Student ("Roopa"    ,6, "EEE");
		 Student student3 = new Student ("Pallavi"  ,4, "MSC");
		 Student student4 = new Student ("Keerthi"  ,9, "CIVIL");
		 Student student5 = new Student ("Narmada"  ,3, "CEC");
		 Student student6 = new Student ("Manasa"   ,7, "EE");
		 
		 setlist.add(student1);           //here creating the objects for the HashSet and adding the elements of student objects
		 setlist.add(student2);
		 setlist.add(student3);
		 setlist.add(student4);
		 setlist.add(student5);
		 setlist.add(student6);
		 
		 Iterator <Student>iterator = setlist.iterator();    //by using iterator we are iterating the elements of the HashSet
		 
		 while (iterator.hasNext()){
			 Student studentiterator = (Student)iterator.next();
			 System.out.println(studentiterator);          //printing the elements of HashSet
		 }
		 
	}

}
