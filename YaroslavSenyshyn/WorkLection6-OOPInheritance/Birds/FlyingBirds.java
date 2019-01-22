package OOPInheritanceHW;

public class FlyingBirds extends Birds {

	@Override
	void fly() {
		
		if (getFeathers() == "Yes") {
			System.out.printf("This bird can fly. Feathers - "+getFeathers()+", Lay Eggs - "+getLayEggs());
		} 
		else {
			System.out.printf("Pleas input corect feathers for flyinng birds. Must be - Yes");
		}
	}
}
