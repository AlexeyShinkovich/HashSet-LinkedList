package by.htp.mainlinkedlist;

import java.util.LinkedList;
import java.util.List;

import by.htp.entitystudent.Student;

public class Main {

	public static void main(String[] args) {

		List<Student> list = new LinkedList<Student>();
		list.add(new Student("Alex", 1997));
		list.add(new Student("Colin", 1998));
		list.add(new Student("Bart", 1999));

		printList(list);

		list.remove(1);
		printList(list);
	}

	private static void printList(List<Student> list) {
		for (Student student : list) {
			System.out.println(student);
		}
		System.out.println();
	}
}