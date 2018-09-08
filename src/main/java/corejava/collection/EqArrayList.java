package corejava.collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class EqArrayList {

	public static void main(String[] args) {
		
		
		
		
		try {
			
		}finally {
              // try {			
		        int a = 	1/0;
//                }catch(Exception e) {
//                	e.printStackTrace();
//                }
		}
		
		SortedMap<String, String> sMap = new TreeMap<>();
	    sMap.put("CSS", "style");
	    sMap.put("HTML", "mark up");
	    sMap.put("Oracle", "database");
	    sMap.put("XML", "data");

	    SortedMap<String, String> subMap = sMap.subMap("CSS", "XML");
	    System.out.println(subMap);

	    // Get the first and last keys
	    String firstKey = sMap.firstKey();
	    String lastKey = sMap.lastKey();
	    System.out.println("First Key:  " + firstKey);
	    System.out.println("Last key:   " + lastKey);
	  
		
		
		
		
		
		ArrayList<String>    alist = new ArrayList<String>();
		alist.add("Sudesh");
		alist.add("Anaya");
		alist.add("Rakhi");
		
		SortedSet<Integer> ord = new TreeSet<>();
		ord.add(0);
		ord.add(1);
		ord.add(2);
		ord.add(3);
		ord.add(4);
		ord.add(6);
		ord.add(1);
		System.out.println("Normal order: " + ord);
		
		//SortedSet<String> sortedNames1 = new TreeSet<>(Comparator.comparing(Person::getId));
		SortedSet<Person> person = new TreeSet<>(Comparator.comparing(Person::getId));

		// Treeset is a class and sorted set is Interface !!
		
		//SortedSet<Person>   person = new TreeSet<Person>();
		person.add(new Person(101,"sudesh","Dewas"));
		person.add(new Person(103,"Anaya","Dewas"));
		person.add(new Person(102,"rakhi","Dewas"));
		person.add(new Person(105,"sudesh","Indore"));
		System.out.println("Persons by  Name: ");
		person.forEach(System.out::println);
		
		
		/*Set<String> set = new HashSet<String>();
		set.add("sudesh");
		set.add("rakhi");
		set.add(null);
		set.add("sudesh");
		System.out.println(set);*/
		
	}
}
class Person {
	public int id; 
	public String name;
	public String add;
	
	public Person(int id, String name, String add) {
		super();
		this.id = id;
		this.name = name;
		this.add = add;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	
	public boolean equals(Object o) {
			    if (!(o instanceof Person)) {
			      return false;
			    }
		
			    // id must be the same for two Persons to be equal
			    Person p = (Person) o;
			    if (this.id == p.getId()) {
			      return true;
			    }
		
			    return false;
	  }
	
	
	@Override
	  public int hashCode() {
	    return this.id;
	  }

	  @Override
	  public String toString() {
	    return "(" + id + ", " + name + ")";
	  }
	
	
	
}