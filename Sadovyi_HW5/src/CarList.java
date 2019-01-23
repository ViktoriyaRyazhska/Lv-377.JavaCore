import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CarList {

	public static void main(String[] args) throws Exception, IOException {
		
		BufferedReader br=new BufferedReader( new InputStreamReader(System.in));
	
	Car[] car=new Car[4];
	
	car[1] = new Car("Golf1", 1971, 70);
	car[2] = new Car("Golf2", 1981, 80);
	car[3] = new Car("Golf3", 1991, 90);
	car[0] = new Car("Golf4", 2001, 100);
		
		System.out.println("Enter year");
		int yer = Integer.parseInt(br.readLine());
		
		for(int i = 0;i<car.length;i++) {
			if(car[i].getYear()==yer) {
				System.out.println(car[i]);
				
			}
			
		}
	}

	
	

}
