
public class AnimalDriver
	{

		public static void main(String[] args)
			{
				
				Animal [] collection = new Animal[4];
				collection[0] = new Bat();
				collection[1] = new Cat();
				collection[2] = new Human();
				collection[3] = new Hawk();
				
				for(Animal a: collection)
					{
						a.bearsYoung();
						a.makesNoise();
						a.eat();
						a.isMaleQuestion();
						a.sleep();
						a.hunt();
						a.weightOfAnimal();
						/* a.birdFlight();
						a.typeOfFeathers();
						a.wingspanLength();*/
						System.out.println();
					}
				
			}

	}
