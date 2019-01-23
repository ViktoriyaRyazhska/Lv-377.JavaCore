package BirdHwL6;

public class BirdAppl {

	public static void main(String[] args) {
		Bird[] bird = new Bird[5];
		bird[0]=new Penguin();
		bird[1]=new Eagle();
		bird[2]=new Swallow();
		bird[3]=new Kiwi();
		bird[4]=new Eagle();
	for (int i=0; i<bird.length; i++) {
	    System.out.println();
		bird[i].getType();
		bird[i].layEggs();
		bird[i].feathers();
	    bird[i].canFly();
	    
	}	
	}

}
