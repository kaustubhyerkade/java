import java.util.*;

public class Hash {
	public static void main(String args[])
     {
		
		Map<String,Integer> mp = new TreeMap<String,Integer>();
		
		mp.put("Maruti", 7000000);
		mp.put("BMW", 50000000);
		mp.put("Honda", 90000000);
		System.out.println("TreeSet"+mp);
		System.out.println(mp.get("Honda"));
		System.out.println(mp.containsKey("BMW"));
		System.out.println(mp.containsValue(50000000));
		
		Set<String> s = mp.keySet();
		for(String s:set)
		{
			int i = mp.get(s);
			System.out.println("Key"+s+"Value"+i);
			
		}
		
		
		
		Map<String,Integer> mp2=new HashMap<String,Integer>();
		
		mp2.put("Maruti", 700000);
		mp2.put("BMW", 50000000);
		mp2.put("Honda", 90000000);
		System.out.println("HashMap:"+mp2);
		
		 
     }
}
