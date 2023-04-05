package classEx;

public class ClassExample {

	static String studentName;
	static int rollNo;
	public static void main(String[] args) {
		
		studentName="Gudiya";
		rollNo=23;		
		System.out.println("Student name is: "+studentName);
		System.out.println("Student roll no is: "+rollNo);
		PrintCollegeName();
	}
	public static void PrintCollegeName() {
		
		System.out.println(studentName+", whose roll no is "+rollNo+", is a  student of FAMT ");
		
	}

}
