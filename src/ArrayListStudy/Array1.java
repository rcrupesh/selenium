package ArrayListStudy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Array1 {

	public static void main(String[] args) 
	{
		
		ArrayList al=new ArrayList<>();   //created array list
		al.add("velocity");
		al.add('A');
		al.add(null);
		al.add(null);
		al.add('A');
		al.add(3.14);
		al.add(123);
		
		System.out.println(al);
		System.out.println(al.size());
		al.add(1, "pune");
		System.out.println(al);
		al.remove(2);
		System.out.println(al);
		
		System.out.println(al.isEmpty());
		System.out.println(al.contains(123));
		System.out.println(al.get(1));
		
		System.out.println("=======By using For Loop==============");
		for(int i=0;i<=al.size()-1;i++)
		{
			System.out.println(al.get(i));
		}
		System.out.println("=======By using  iterator==============");
		Iterator it = al.iterator();  //created iterator
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("=======By using For each==============");
		for(Object o:al)
		{
			System.out.println(o);
		}
		ArrayList<String> als = new ArrayList<>();
		als.add("one");
		als.add("two");
		als.add("three");
		als.add("four");
		System.out.println("==========By using For Each loop========");
		for(String s:als)
		{
			System.out.println(s);
		}
		System.out.println("=======By using list iterator==============");
		ListIterator<String> l = als.listIterator();
		while(l.hasNext())
		{
			System.out.println(l.next());
		}
		
		
		
		
		
		
		
		
		
		
	}

}
