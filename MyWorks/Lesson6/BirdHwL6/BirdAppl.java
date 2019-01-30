package BirdHwL6;

public class BirdAppl {

	public static void main(String[] args) {
		Bird [] bird = {new Penguin(), new Eagle(), new Swallow(), new Kiwi(), new Eagle()};
	  
		for (int i=0; i<bird.length; i++) {
		bird[i].getType();
	    bird[i].canFly();
	    System.out.println(bird[i]);
	    System.out.println();
	    
	}	
	}

}
