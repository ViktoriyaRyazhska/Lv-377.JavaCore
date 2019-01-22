package OOPInheritanceHW;

public class BirdMain {
	public static void main(String[] args) {
		
		Birds[] birds = new Birds[4];
		birds[0] = new Eagle();
		birds[1] = new Swallow();
		birds[1].setFeathers("No");
		birds[2] = new Kiwi();
		birds[3] = new Penguin();
		for (int i = 0; i < birds.length; i++) {
			birds[i].fly();
			System.out.println();
		}
	}
}
