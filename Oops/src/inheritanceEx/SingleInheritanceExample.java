package inheritanceEx;

class Teacher {
	 
	  String designation = "Teacher";
	  String collegeName = "FAMT";
	  String mainSubject = "JAVA";
	  
	  void Occupation(){
	    System.out.println("Teaching");
	  }
	}
public class SingleInheritanceExample extends Teacher{
	
	
	
	  public static void main(String args[]){
		  SingleInheritanceExample obj = new SingleInheritanceExample();
	    System.out.println(obj.collegeName);
	    System.out.println(obj.designation);

	    System.out.println(obj.mainSubject);	    
	    obj.Occupation();
}
}
