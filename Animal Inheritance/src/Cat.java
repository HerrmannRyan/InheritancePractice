
public class Cat extends Mammal
	{

		public Cat()
		{
			hair = "Dark black fur!";
			weight = 10;
			name = "Cat";
			food = "mice";
			isMale = false;
			
		}
		
	@Override
	public void makesNoise()
		{
			System.out.println("MEOW!!");
			
		}

	@Override
	public void hunt()
		{
			System.out.println("The cat is going to pounce on the laser pointer.");
			
		}

	@Override
	public void sleep()
		{
			System.out.println("The cat is lazy and sleeps a lot!");
			
		}
		
	}
