package com.jspiders.cardekho_case_study.operations;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.jspiders.cardekho_case_study.entity.Car;


public class CarOperations {
	
	private List<Car> cars = new ArrayList<Car>();
	
	public void addCarDetails() {
		System.out.println("How many car details you want add? ");
		Scanner scanner =new Scanner(System.in);
		int choice = scanner.nextInt();
		for (int i = 0; i < choice; i++) {
			Car car =new Car();
			System.out.print("Enter car id : ");
			car.setCar_Id(scanner.nextInt());
			System.out.print("Enter car name : ");
			car.setName(scanner.next());
			System.out.print("Enter car brand : ");
			car.setBrand(scanner.next());
			System.out.print("Enter car fuel type : ");
			car.setFuel_Type(scanner.next());
			System.out.println("Enter the car price : ");
			car.setPrice(scanner.nextDouble());
			cars.add(car);
			System.out.println("\n\n" + car.getName() + "Added....!!!!");
		}
		getAllCarDetails();
	}
	
	public void removeCarDetails() {
		getAllCarDetails();
		if (cars.isEmpty() == false) {
			Car car1 = null;
			System.out.println("\nEnter car ID to remove : ");
			Scanner scanner = new Scanner(System.in);
			int choice = scanner.nextInt();
			for (Car car : cars) {
				if (car.getCar_Id() == choice) {
					car1 = car;
				}
			}
			if (car1 != null) {
				cars.remove(car1);
				System.out.println(car1.getName() + "removed...!!!!");
			}else {
				System.out.println("Invalid choice. Try again...!!!!!");
			}
		}
	}
	
	public void getAllCarDetails() {
		if (cars.isEmpty()) {
			System.out.println("No car details found....!!!!");
		}else {
			System.out.println("Total car details :" +cars.size());
			System.out.println("ID\t" + "Name\t" + "Brand\t" + "Price");
			System.out.println("======================================");
			for(Car car : cars) {
				System.out.println(car.getCar_Id() + "\t" + car.getName() + "\t" + car.getBrand() 
				+ "\t" + car.getFuel_Type() + "\t\t" + car.getPrice());
			}
		}
	}
	
	public void searchByName() {
		if (cars.isEmpty()) {
			System.out.println("No car details found....!!!!");
		}else {
			System.out.println("Enter car Name : ");
			Scanner scanner = new Scanner(System.in);
			String name = scanner.next();
			List<Car> allCars = new ArrayList<Car>();
			for (Car car :cars) {
				 if (car.getName().equalsIgnoreCase(name)) {
					allCars.add(car);
				}
			}
			System.out.println("Total car details : " + allCars.size());
			System.out.println("ID\t" + "Name\t" + "Fuel Type\t" + "Price");
			System.out.println("===========================================");
			for (Car car : allCars) {
				System.out.println(car.getCar_Id() + "\t" + car.getName() + "\t" + car.getBrand()
								   + "\t" + car.getFuel_Type() + "\t\t" + car.getPrice());
			}
		}
	}
	
	public void searchCarByBrand() {
		if (cars.isEmpty()) {
			System.out.println("No car details found....!!!!");
		}else {
			System.out.println("Enter car Brand : ");
			Scanner scanner = new Scanner(System.in);
			String brand = scanner.next();
			List<Car> allCars = new ArrayList<Car>();
			for (Car car : cars) {
				 if (car.getBrand().equalsIgnoreCase(brand)) {
					allCars.add(car);
				}
			}
			System.out.println("Total car details : " + allCars.size());
			System.out.println("ID\t" + "Name\t" + "Brand\t" + "fuel\t" + "Price");
			System.out.println("==================================================");
			for (Car car : allCars) {
				System.out.println(car.getCar_Id() + "\t" + car.getName() + "\t" + car.getBrand()
								   + "\t" + car.getFuel_Type() + "\t\t" + car.getPrice());
			}
		}
	}
	
	public void searchByFuelType() {
		if (cars.isEmpty()) {
			System.out.println("No car details found..!!!");
		}else {
			System.out.println("Enter car fuel type : ");
			Scanner scanner = new Scanner(System.in);
			String fuel_type = scanner.next();
			List<Car> allCars = new ArrayList<Car>();
			for (Car car : cars) {
				if (car.getFuel_Type().equalsIgnoreCase(fuel_type)) {
					allCars.add(car);
				}
			}
			System.out.println("Total car details : " + allCars.size());
			System.out.println("ID\t" + "Name\t" + "Brand\t" + "Fuel Type\n" + "Price");
			System.out.println("=======================================================");
			for (Car car : allCars) {
				System.out.println(car.getCar_Id() + "\t" + car.getName() + "\t" + car.getBrand()
								   + "\t" + car.getFuel_Type() + "\t\t" + car.getPrice());
			}
		}
	}
	
	public void editCarDetails() {
		getAllCarDetails();
		if (cars.isEmpty() == false) {
			System.out.println("Enter car ID to update : ");
			Scanner scanner = new Scanner(System.in);
			int car_id = scanner.nextInt();
			for (Car car : cars) {
				if (car.getCar_Id() == car_id) {
					System.out.println("enter new car name : ");
					car.setName(scanner.next());
					System.out.println("Enter new car brand : ");
					car.setBrand(scanner.next());
					System.out.println("Enter new car fuel type : ");
					car.setFuel_Type(scanner.next());
					System.out.println("Enter new car Price : ");
					car.setPrice(scanner.nextDouble());
					System.out.println("Car details updated..!!");
				}
			}
		}
	}
}