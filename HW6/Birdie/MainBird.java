package hw6.softserve;

public class MainBird {
	
	public static void main(String[] args) {
		
		Bird [] brd = new Bird [4];
		brd [0] = new Eagle("Yes", "Yes");
		brd [1] = new Swallow("Yes", "Yes");
		brd [2] = new Chicken("Yes", "Yes");
		brd [3] = new Penguin("No", "No");
		
		for (int i=0; i < brd.length; i++){
			brd[i].fly();
			
		}
		
		System.out.println("Is penguin realy bird, at all?)");
	}
}
