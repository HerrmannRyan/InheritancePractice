
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
		
		
		//Specific to bird
		protected String feathers;
		protected int wingspan;
		protected boolean canFly;
		
		public abstract void typeOfFeathers();
		public abstract void wingspanLength();
		public abstract void birdFlight();
		
		
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


