public class StudentRecords {
	private String name;
	private String address;
	private int age;
	private double mathGrade;
	private double englishGrade;
	private double scienceGrade;
	private double average;

	private static int studentCount;

	public String getName() {
		return this.name;
	}

	public double getAverage() {
		double result = 0;
		result = (mathGrade + englishGrade + scienceGrade)/3;
	}

	public void setName(String newName)
		this.name = newName;
}

StudentRecords student1 = new StudentReords