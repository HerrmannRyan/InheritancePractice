
public class AnimalDriver
	{

		public static void main(String[] args)
			{
				
				Animal [] collection = new Animal[3];
				collection[0] = new Bat();
				collection[1] = new Cat();
				collection[2] = new Human();
				
				for(Animal a: collection)
					{
						a.bearsYoung();
						a.makesNoise();
						a.eat();
						a.isMaleQuestion();
						a.sleep();
						a.hunt();
						a.weightOfAnimal();
						System.out.println();
					}
				
			}

	}
