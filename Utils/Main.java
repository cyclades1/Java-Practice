import java.util.*;
import java.io.*;
import java.lang.*;


class Main{
	public static void print(int n){
		System.out.println(n);
	}
	public static void print(String s){
		System.out.println(s);
	}


	public static void main(String [] args){
		ArrayList <Integer> list = new ArrayList<Integer>();
		list.add(3);
		list.add(2);
		list.add(4);
		Iterator<Integer> it = list.iterator();
		print("before");
		while(it.hasNext()){
			System.out.println(it.next());
			
		}
		Collections.sort(list);
		print("after sort");
		for(int num: list)
		{
			print(num);
		}
		list.remove(0);
		list.set(0, 2);
		print("after delete and replace");
		for(int i=0;i<list.size();i++){
			print(list.get(i));
		}
		list.clear();

		HashMap<String, String> map  = new HashMap<String, String>();
		map.put("human", "kid");
		map.put("lion", "cub");
		map.put("cat", "kitten");
		print(map.size());
		print(map.get("lion"));
		print("before");
		for(String i : map.keySet()){
			print(String.format("%s -> %s", i , map.get(i)));
		}
		print("after"); 
		map.remove("human");
		for(String i : map.keySet()){
			print(String.format("%s -> %s", i , map.get(i)));
		}
		map.clear();

		HashSet<String> set = new HashSet<String>();
		set.add("abhishek");
		set.add("ankit");
		set.add("jyotish");
		set.add("dgks");
		print(set.size());
		System.out.println(set);
		set.remove("dgks");
		System.out.println(set.contains("abhishek"));
		System.out.println(set.contains("dgks"));
		System.out.println(set);

	}
}