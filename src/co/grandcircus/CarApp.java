package co.grandcircus;

import java.util.ArrayList;
import java.util.Scanner;

public class CarApp {

	public static void main(String[] args) {
		System.out.println("Welcome to Kevon's Car Lot!!");
		//Ask user how many cars they want to enter.
		Scanner scan = new Scanner(System.in);
		System.out.println("How many Cars Would You Like:");
		int numCars = scan.nextInt(); //always call the scanner to get user input 
		
		ArrayList<Car> cars = new ArrayList<>();
		
		for (int i = 1; i<= numCars; i++) {
			System.out.println("make " + i +":"); // this helps to put a number before you start
			String make = scan.next();
			
			System.out.println("model " + i + ": ");
			String model = scan.next();
			
			System.out.println("year " + i + ": ");
			int year = scan.nextInt();
			
			System.out.println("price " + i +": ");
			double price = scan.nextDouble();
			
			Car c = new Car(make, model, year, price);
			cars.add(c);
					
		}
		//System.out.println(cars);
		System.out.println("Current Inventory: ");
		for (Car car: cars) {
			System.out.println(car);
		}
	}

}
