
public class Dogs {
	private  String name;
	private  int age;
	private  Breed breed;

	public Dogs(String name, int age, Breed breed) {
		this.name = name;
		this.age = age;
		this.breed = breed;
	}
	 

	public static void main(String[] args) {
		Dogs dog1 = new Dogs("Bob",9,Breed.Retrievers);
		Dogs dog2 = new Dogs("Bob",3,Breed.Retrievers);
		Dogs dog3 = new Dogs("Jimm",7,Breed.Spaniels);
		
		
		
		
		if((dog1.name.equals(dog2.name))||(dog1.name.equals(dog2.name))||(dog1.name.equals(dog2.name))) {
				System.out.println("Dogs have same name");
		}
		if((dog1.age>dog2.age)&&(dog1.age>dog3.age)) {
			System.out.println(dog1);
		}
		if((dog2.age>dog1.age)&&(dog2.age>dog3.age)) {
			System.out.println(dog2);
		}
		if((dog3.age>dog2.age)&&(dog3.age>dog1.age)) {
			System.out.println(dog3);
		}
			
		
	}
	
		
	@Override
	public String toString() {
		return "Oldest dog is " + name + ", age=" + age + ", breed=" + breed;
	}
	
	public void out() {
	System.out.println(name);
	}
	
}
