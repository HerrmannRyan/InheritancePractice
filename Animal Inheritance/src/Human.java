
public class Human extends Mammal
	{
		
		public Human()
		{
			name = "Human";
			weight = 155;
			isMale = true;
			food = "3 course dinner";
			hair = "Short to none";
		}

		@Override
		public void makesNoise()
			{
				System.out.println("The human has a casual conversation.");
				
			}

		@Override
		public void hunt()
			{
				System.out.println("The human doesn\'t actually hunt. It just goes to the store.");
				
			}

		@Override
		public void sleep()
			{
				System.out.println("The human is supposed to go to get 8 hours of sleep, but only gets 5.5.");
				
			}
		
	}
