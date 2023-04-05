package inheritanceEx;

class ChildDetails
{
	String firstChildName="AAyana";;
	String secondChildName="Aaryan";;
	int firstChildAge=4;
	int secondChildAge=6;
	float firstChildHeight=3.2f;
	float secChildHeight=4.3f;
}

class ChildName extends ChildDetails
{	
	public void PrintName() {
	 System.out.println("First child name is "+super.firstChildName);
	  System.out.println("second child name is "+super.secondChildName);
	}
	
}
 class ChildAge extends ChildDetails
{
	public void PrintChildAge()
	{
		System.out.println("First child age is "+super.firstChildAge);
		System.out.println("Second child age is "+super.secondChildAge);
	}
}
 
 class ChildHeight extends ChildDetails
 {
	 public void PrintChildHeight()
	 {
		 System.out.println("First child height is "+super.firstChildHeight+" foot");
		 System.out.println("First child name is "+super.secChildHeight+" foot"); 
	 }
 }
public class HierarchicalEx 
{
	public static void main(String args[])
	{
		
		ChildName childName=new ChildName();
		childName.PrintName();
		
		ChildAge childAge=new ChildAge();
		childAge.PrintChildAge();
		
		ChildHeight childHeight=new ChildHeight();
		childHeight.PrintChildHeight();
	}

}
