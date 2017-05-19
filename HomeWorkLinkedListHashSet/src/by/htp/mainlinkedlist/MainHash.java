package by.htp.mainlinkedlist;

import java.util.Set;
import java.util.HashSet;

public class MainHash {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("Alex");
		set.add("Tom");
		set.add("Martin");
		set.add("Alex");
		set.add("Frank");
		set.add("Andrey");
		set.add("Alex");
		set.add("Vova");
		set.add("Johnny");
		set.add("Paul");
		set.add("Andy");
		set.add("Oleg");
		set.add("Ivan");
		set.add("Roma");
		set.add("Petr");
		set.add("Alex");
		set.add("Alexey");
		set.add("Fedor");
		set.add("Artem");
		set.add("Nikolay");
		set.add("Alex");
		set.add("Marat");
		set.add("Victor");
		set.add("Yura");
		set.add("Bart");
		set.add("Alex");
		set.add("AAAOOO");
		
		System.out.println();
		for (String string : set) {
			char[] a = string.toCharArray();
			if (a[0] == 'A' || a[0] == 'O' || a[0] == 'E' || a[0] == 'I' || a[0] == 'Y') {
				System.out.println(string);
			}
		}
	}
}