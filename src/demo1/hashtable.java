 package demo1;

import java.util.Hashtable;

public class hashtable {

	public static void main(String[] args) {
		
	Hashtable<String,String> h1=new  Hashtable<String,String>();
	h1.put("name","n1");
	h1.put("city","pune");
	System.out.println(h1.size());
	
	System.out.println(h1.get("name"));
	h1.put("name", "n1_new");
	System.out.println(h1.get("name"));
	
	Hashtable<String,String> emp1=new Hashtable<String,String>();
	emp1.put("name", "n1");
	emp1.put("city", "pune");
	
	Hashtable<String,String> emp2=new Hashtable<String,String>();
	emp2.put("name", "shubham");
	emp2.put("city", "aurangabad");
	Hashtable<Integer,Hashtable<String,String>> allemp=new Hashtable<Integer,Hashtable<String,String>>();
	allemp.put(7, emp1);
	System.out.println(allemp.get(7).get("name"));
	System.out.println(allemp.get(7).get(allemp));
	
	Hashtable<String,String> employee=new Hashtable<String,String>();
	employee.put("name", "shubham");
	employee.put("city", "pune");
	System.out.println(employee.get("name"));
	
	}

}
