package polymorphismEx;
	
public class CompileTimePolyMorphEx  {
 
	public static void main(String args[])
	{
		VehicleTyre();
		VehicleTyre("car");
		VehicleTyre("Cycle",2);
		
	}
	
	public static void VehicleTyre()
	{
		System.out.println("Vehicles name and how many tyres they have");
	}

	
	public static void VehicleTyre(String carName)
	{
		System.out.println(carName+" has four tyres");
	}


	public static void VehicleTyre(String name,int tyre)
	{
		System.out.println(name+" has "+tyre+" tyres");
	}
}
