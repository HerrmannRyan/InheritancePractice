
public abstract class Animal
	{
		protected String name;
		protected String food;
		protected boolean isMale;
		protected int weight;
		
		//Abstract methods
		public abstract void bearsYoung();
		public abstract void makesNoise();
		public abstract void hunt();
		public abstract void sleep();
		
		public void eat()
			{
				System.out.println("The " + name + " is looking forward to eating " + food + ".");
			}
		
		public void isMaleQuestion()
			{
				System.out.println("Male: " + isMale);
			}
		
		public void weightOfAnimal()
		{
			System.out.println("The " + name + " weights " + weight + " pounds.");
		}
		
	}


