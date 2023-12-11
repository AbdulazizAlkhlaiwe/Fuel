// name : Abdulaziz alkhlaiwe
// ID : 444101708


import java.util.Scanner;
public class Fuel {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
double distance , kilos , price , cost ;
System.out.print("Enter the driving distance: ");
distance = input.nextDouble();
System.out.print("Enter kilos per liter: ");
kilos = input.nextDouble();
System.out.print("Enter price per liter: ");
price = input.nextDouble();
distance = (distance/ kilos);

cost = (distance*price);
System.out.println("The cost of driving is $"+ cost);
	}

}
