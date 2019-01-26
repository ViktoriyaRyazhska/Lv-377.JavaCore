package animal;

public class Main {

	public static void main(String[] args) {

		Animal bobik = new Dog("bobik");
		Animal tuzik = new Dog("tuzik");
		Animal barsik = new Cat("barsik");
		Animal vaska = new Cat("vaska");
		Animal[] mas = {bobik, tuzik, barsik, vaska};
		
		for(int i = 0; i < mas.length; i++) {
			mas[i].voice();
			mas[i].feed();
			System.out.println(mas[i]);
		}
		 
	}

}
