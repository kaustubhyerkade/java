import java.util.*;

public class CollectionDemo {

	public static void main(String Args[])
	{

		List<Integer> lst = new LinkedList<Integer>();
		lst.add(new Integer(10));
		lst.add(new Integer(20));
		lst.add(new Integer(30));
		lst.add(new Integer(40));
		lst.add(new Integer(50));
		lst.add(new Integer(60));
		lst.add(new Integer(70));
		lst.add(80);
		lst.add(90);

		System.out.println("LinkedList: "+lst);

		List<Integer> alst = new ArrayList<Integer>();
		alst.add(new Integer(10));
		alst.add(new Integer(20));
		alst.add(new Integer(30));
		alst.add(new Integer(40));
		alst.add(new Integer(50));
		alst.add(new Integer(60));
		alst.add(new Integer(70));
		alst.add(new Integer(80));
		alst.add(90);
		alst.add(100);
		System.out.println(alst.get(3));
		System.out.println(alst);
		alst.remove(9);

		if(alst.contains(110))
		{
			System.out.println("true");
		}


		System.out.println("ArrayList: "+alst);


		Set<Integer> hset = new HashSet<Integer>();
		hset.add(10);
		hset.add(20);
		hset.add(30);
		hset.add(40);
		hset.add(50);
		hset.add(60);
		hset.add(70);
		hset.add(70);
		System.out.println("HashSet: "+hset);


		Set<Integer> tset=new TreeSet<Integer>();
		tset.add(10);
		tset.add(20);
		tset.add(30);
		tset.add(40);
		tset.add(50);
		tset.add(60);
		tset.add(10);
		System.out.println("TreeSet: "+tset);




		System.out.println("1. ArrayList 2. LinkedList 3. HashSet 4. TreeSet ");




	}	

}
