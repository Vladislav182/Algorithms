package Algoritmi;
import java.util.HashMap;
import java.util.Map;

public class HashMapClass {

	public static void main(String[]args) {
		// TODO Auto-generated method stub
		Map<String, Double>MyDictionary  = new HashMap <String, Double>();
		 
		 MyDictionary.put("Pesho", 3.00);
		 MyDictionary.put("Gosho", 5.00);
		 MyDictionary.put("Ivan", 2.00);
		 MyDictionary.put("Vasko", 5.00);
		 MyDictionary.put("Anton", 6.00);
		 MyDictionary.put("Alex", 4.00);
	 
	 
		 System.out.println("HashMap Size:" + MyDictionary.size());
	 
		 ///////////////////////////////////////////////////////////////////////////////
		 // GET 
	 
		 Double Gosho = MyDictionary.get("Gosho");
		 System.out.printf("Gosho's mark " +  Gosho);
	 
		 ///////////////////////////////////////////////////////////////////////////////
		 // REMOVE
	 
		 MyDictionary.remove("Gosho");
		 System.out.println();
		 System.out.println(" Gosho removed ");
	 
		 ///////////////////////////////////////////////////////////////////////////////
		 // CONTAINS KEY
		 System.out.printf("Is Gosho is in the HashMap : " + MyDictionary.containsKey("Gosho"));
	 
		 ///////////////////////////////////////////////////////////////////////////////
		 // CONTAINS VALUE
		 System.out.println();
		 System.out.printf("Is Gosho in the HashMap :" + MyDictionary.containsValue(5.00));
	 
	 
	 
	 
	 
		 MyDictionary.put("Alex", 4.25);
		 System.out.println();
		 System.out.println( " Alex grade has changed ");
	 
	 
	 
		 System.out.println(" Students and marks : ");
	 
	 
	 
		 for(Map.Entry<String, Double> items: MyDictionary.entrySet()) {
			 System.out.printf(" Student has "+ items.getKey()+  "  "+ items.getValue ());
		 }
	 
	 
	 
	 
		 System.out.println();
		 System.out.printf(" How many students there are : " + MyDictionary.size());
		 MyDictionary.clear();
		 System.out.println();
		 System.out.println(" The HashMap is empty ");
		 System.out.println();
		 System.out.printf(" Is the HashMap empty? " + MyDictionary.isEmpty());
	 
	 }
	


	}


