package pubmaticone;

import java.util.*;
import java.util.AbstractCollection;


public class Solution{

	public static void main(String args[])
	{
		/*
        AbstractCollection<Object> abs1 = new ArrayList<Object>();
        abs1.add("hello");
        abs1.add("World");
        abs1.add(1111);
        abs1.add(23.67);
        abs1.add('a');
        System.out.println(""+abs1);

        AbstractCollection<Object> abs2 = new ArrayList<Object>();

        System.out.println(abs2);
        abs2.addAll(abs1);
        System.out.println(abs2);
        abs1.clear();
        System.out.println(abs1.isEmpty());
		 */
		//iterator
		ArrayList<String> list = new ArrayList<String>();

		list.add("kaustubh");
		list.add("h");
		list.add("e");
		list.add("l");
		list.add("l");
		list.add("l");
		list.add("l");
		list.add("0");
		list.add("o");
		list.add(2,"yerkade");
1
		Iterator iterator = list.iterator();

		System.out.println("List of elemrnts: ");

		while(iterator.hasNext())
		{
			System.out.println(iterator.next() + " ");
			System.out.println();
		}


	}


}
