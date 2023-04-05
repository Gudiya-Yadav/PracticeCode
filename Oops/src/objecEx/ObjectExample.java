package objecEx;

public class ObjectExample {

		 String name;

	public static void main(String args[])
	{
		
		ObjectExample objectExample=new ObjectExample();
		objectExample.name="It is an example of object";
		objectExample.PrintTheData(objectExample.name);
	}

	public void PrintTheData(String name) {
		
		System.out.println(name);
		System.out.println("Object is a pillar of oops concept");
	}
}
