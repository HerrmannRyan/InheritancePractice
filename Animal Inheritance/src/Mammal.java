
public abstract class Mammal extends Animal
	{
		protected String hair;
		
	@Override
	public void bearsYoung()
		{
			System.out.println("OOOO, a cute little Mammal baby!");
			
		}
	
	public void typeOfHair()
	{
		System.out.println("The" + name + "\'s hair is " + hair);
	}
		
	}
