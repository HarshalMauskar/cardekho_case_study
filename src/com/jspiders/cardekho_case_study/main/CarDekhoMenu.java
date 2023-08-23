package com.jspiders.cardekho_case_study.main;

import java.util.Scanner;

import com.jspiders.cardekho_case_study.operations.CarOperations;


public class CarDekhoMenu {
	private static CarOperations operations = new CarOperations();
    private static boolean loop = true;

    public static void main(String[] args) {
    	while (loop)
		{
			carDekhoMenu();
		}
	}
    
    private static void carDekhoMenu() {
		System.out.println("==========MENU==========\n"
								+"1. Add Car Details \n"
								+"2. Search Car Details \n"
								+"3. Update Car Details \n"
								+"4. Delete Car Details \n"
								+"5. Exit");
		Scanner scanner = new Scanner(System.in);
		System.out.println("\nEnter your choice : ");
		int choice1 = scanner.nextInt();
		switch (choice1) {
		case 1:
			System.out.println("==========MENU==========\n"
								+"1. Add Car Details \n"
								+"2. Remove Car Details \n"
								+"3. Go Back To Main Menu");
			System.out.println("\nEnter Your Choice");
			int choice2 =scanner.nextInt();
			switch (choice2) {
			case 1:
				operations.addCarDetails();
				break;
				
			case 2:
				operations.removeCarDetails();
				break;
				
			case 3:
				carDekhoMenu();
				break;
				
			default:
				System.out.println("\nInvalid Choice. Try Again...!!!!");
				break;
			}
			break;
			
		case 2:
				System.out.println("==========MENU==========\n"
									+"1. Search Car By Name \n"
									+"2. Search Car By Brand \n"
									+"3. Search Car By Fuel Type"
									+"4. Search All Car \n"
									+"5. Go Back To Main Menu");
				int choice3=scanner.nextInt();
				switch (choice3) {
				case 1:
					operations.searchByName();
					break;
					
				case 2:
					operations.searchCarByBrand();
					break;
					
				case 3:
					operations.searchByFuelType();
					break;
					
				case 4:
					operations.getAllCarDetails();
					break;
					
				case 5:
					carDekhoMenu();
					break;
					
				default:
					System.out.println("\nInvalid Choice. Try Again...!!!!");
					break;
				}
				break;
				
		case 3:
			operations.editCarDetails();
			break;
			
		case 4:
			System.out.println("Thank You....!!!!");
			loop=false;
			scanner.close();
			break;
			
		default:
			System.out.println("\nInvalid Choice. Try Again...!!!!");
			break;
		}
	}
} 