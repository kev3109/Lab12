package co.grandcircus;

import java.util.ArrayList;
import java.util.Scanner;

public class UsedCarApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Car> carList = new ArrayList<>();
		carList.add(new Car("Tesla", "Model S", 2017, 54999.99));
		carList.add(new UsedCar("Ford", "Escape", 2017, 31999.90, 123122));
		carList.add(new UsedCar("Chevy", "Corvette", 2017, 44989.95, 563566));
		carList.add(new UsedCar("Honda", "Pilot", 2015, 14795.50, 124211));
		carList.add(new UsedCar("Ford", "F-150", 2015, 9800.99, 132322));
		
		String cont = "Y";
		while (cont.equalsIgnoreCase("y")) {
			System.out.println("Welcome to my Lemon Lot! ");
			System.out.println("Please select a Car: ");
			for (int i = 0; i < carList.size(); i++) {

				System.out.println((i + 1) + ". " + carList.get(i));
			}
			int carSelection = scan.nextInt();
			carList.remove(carSelection - 1);
			for (int i = 0; i < carList.size(); i++) {

				System.out.println((i + 1) + ". " + carList.get(i));
			} 
		System.out.println("Do you want to continue? y/n " );
		cont = scan.next();
		}
		System.out.println("Goodbye! Enjoy your Lemon");

	}
}
