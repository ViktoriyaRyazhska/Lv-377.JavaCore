package plant;

public class Main {

	public static void main(String[] args) {
		Plant plant1 = null;
		Plant plant2 = null;
		Plant plant3 = null;
		Plant plant4 = null;
		Plant plant5 = null;
		try {
			plant1 = new Plant(5, "pink", "tree");
			plant2 = new Plant(5, "red", "flower");
			plant3 = new Plant(5, "green", "flower");
			plant4 = new Plant(5, "blue", "tree");
			plant5 = new Plant(5, "red", "flower");
		
		} catch (ColorException e) {
			
			e.printStackTrace();
		} catch (TypeException e) {
			
			e.printStackTrace();
		}
			Plant[] plants = {plant1, plant2, plant3, plant4, plant5};
			for(Plant p : plants) {
				System.out.println(p);
			}

		

	}

}
