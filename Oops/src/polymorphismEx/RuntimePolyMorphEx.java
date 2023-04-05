package polymorphismEx;

class Birds
{
	public void Sound()
	{
		System.out.println("The Sound of different birds");
	}
}

class Sparrow extends Birds
{
	public void Sound()
	{
		System.out.println("Sparrow is chirping");
	}
}

class Duck extends Birds
{
	public void Sound()
	{
		System.out.println("Duck's sounds is quack quack");
	}
}
class Pigeon extends Birds
{
	public void Sound()
	{
		System.out.println("Pigeon sounds is cooing");
	}
}
public class RuntimePolyMorphEx {
	public static void main(String args[])
	{
		Birds birds=new Birds();
		birds.Sound();
		Birds sparrow=new Sparrow();
		sparrow.Sound();
		Birds duck=new Duck();
		duck.Sound();
		Birds pigeon=new Pigeon();
		pigeon.Sound();
	}
}
