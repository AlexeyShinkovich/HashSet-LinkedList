package by.htp.entitystudent;

public class Student {
	private String name;
	private int dateBirth;

	public Student() {
	}

	public Student(String name, int dateBirth) {
		super();
		this.name = name;
		this.dateBirth = dateBirth;
	}
	
	public String getName() {
		return name;
	}

	public int getDateBirth() {
		return dateBirth;
	}
	@Override
	public String toString() {
		System.out.println(name+" "+dateBirth);
		return super.toString();
	}
}
