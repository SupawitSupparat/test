

	import java.util.Scanner;
	public class Carapp {
		public static void main (String[] args) {
			
			Car c2= new Car();
			Scanner input = new Scanner (System.in);
			double gasburn,gas,distance,newGas;
			
			System.out.print("gas");
			gas=input.nextDouble();
			System.out.print("gasburn");
			gasburn=input.nextDouble();
			System.out.println(c2.getGas());
			System.out.println(c2.getburningGasRate());
			c2.setGas(gas);
			c2.setBurningGasRate(gasburn);
			System.out.print("distance");
			distance=input.nextDouble();
			gas=c2.drive(distance);
			System.out.print("new gas");
			newGas=input.nextDouble();
			c2.fillGas(newGas);
			System.out.println();
			

			System.out.println(c2.toString());

		}
	}




