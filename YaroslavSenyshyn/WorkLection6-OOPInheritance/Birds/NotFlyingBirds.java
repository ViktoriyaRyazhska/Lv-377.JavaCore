package OOPInheritanceHW;

public class NotFlyingBirds extends Birds{

	@Override
	void fly() {
		System.out.printf("This bird can't fly. Feathers - "+getFeathers()+", Lay Eggs - "+getLayEggs());
	}
}
