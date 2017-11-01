package Test1;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetExample {
	
	public static void main(String[] args) {
		Set<String>setA = new HashSet<String>();
		setA.add("a");
		setA.add("d");
		setA.add("b");
		setA.add("am");
		setA.add(null);
		setA.add(null);
		
		System.out.println(setA);
		Set<String> linkedHashSet=new LinkedHashSet<String>();
		linkedHashSet.add("a");
		linkedHashSet.add("c");
		linkedHashSet.add("b");
		linkedHashSet.add("d");
		linkedHashSet.add(null);
		linkedHashSet.add(null);
		System.out.println(linkedHashSet);
		Set<String> treeHashSet=new TreeSet<String>();
		treeHashSet.add("za");
		treeHashSet.add("d");
		treeHashSet.add("b");
		treeHashSet.add("b");
		treeHashSet.add("lc");
		treeHashSet.add("lc");
		
		System.out.println(treeHashSet);
	}

}
