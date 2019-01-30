
public class allbirds {

	public static void main(String[] args) {
		Beard[] b = new Beard[4];
		b[0]= new Eagle("brown","yes");
		b[1]= new Swallow("black and white","yes");
		b[2]= new penguin("penguin dont have feather","yes");
		b[3]= new Kiwi("Kiwi dont have feather","yes");
		 for(int i =0;i<b.length;i++) {
			 b[i].fly();
			 if(b[i] instanceof flyingBeard) {
				 ((flyingBeard)b[i]).feathers();
				 ((flyingBeard)b[i]).layEggs();
				 
			 }if(b[i] instanceof notFlyingBeard) {
				 ((notFlyingBeard)b[i]).feathers();
				 ((notFlyingBeard)b[i]).layEggs();
			 }
			 
		 }

	}
}
