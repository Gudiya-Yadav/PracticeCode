package inheritanceEx;
 class Teacher1 {
		
		String phyTeacher="G.B.Sharma";
		String chemTeacher="John";
		
}

 class Subject extends Teacher1
 {
	String firstSub="Physics";
	String secondSub="Chemistry";
	 
}
public class MultiLevelEx extends Subject
{
    public static void main()
    {
    	MultiLevelEx multiLevelEx=new MultiLevelEx();
    	System.out.println("Data of Teachers");
    	System.out.println(multiLevelEx.phyTeacher+" teaches "+multiLevelEx.firstSub);
    	System.out.println(multiLevelEx.chemTeacher+" teaches "+multiLevelEx.secondSub);
    	
    }
}
