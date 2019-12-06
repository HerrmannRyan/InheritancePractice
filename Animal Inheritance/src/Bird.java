
public abstract class Bird extends Animal
	{
		
		
		
		public void bearsYoung()
		{
			System.out.println("Look it is a little egg!!");
		}
		
		public void typeOfFeathers()
		{
			System.out.println("Wow the feathers of the birs are " + feathers + "!");
		}
		
		public void wingspanLength()
		{
			System.out.println("The wingspan on this bird is " + wingspan + " inches.");
		}
		
		public void birdFlight()
		{
			if (canFly)
			{
				System.out.println("It can fly!");
			}
			else
			{
				System.out.println("It cannot fly.");
			}
		}
		
	}
