package Lab1A;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class student {
	
	String usn="";
	String name="";
	String address="";

	student(String usn,String name,String add){
		this.usn=usn;
		this.name=name;
		this.address=add;
			}
	
	public student() {
		// TODO Auto-generated constructor stub
	}

	public void displayStudent() {
		System.out.println("USN :"+this.usn);
		System.out.println("Name :"+this.name);
		System.out.println("Address :"+this.address);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<student> list1=new ArrayList<student>();
		
		//Adding Student object to collection
		student s1=new student("1RV21MC052","Kishan","Ankola");
		list1.add(s1);
		
		//Adding Student object to collection 
		list1.add(new student ("1RV21MC053","Kiran","Bangaluru"));
		list1.add(new student ("1RV21MC051","Jay Shah","Bangaluru"));
		
		//Displaying the elements
		Iterator<student> itr1=list1.iterator();
		while(itr1.hasNext()) {
			student s2=itr1.next();
			s2.displayStudent();
		}

		//or 
		
//		Iterator<student> itr1=list1.iterator();
//		while(itr1.hasNext()) {
//			itr1.next().displayStudent();
//		}

	}

}















