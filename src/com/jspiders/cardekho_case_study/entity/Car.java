package com.jspiders.cardekho_case_study.entity;


public class Car {
	
		private int car_Id;
		private String name;
		private String brand;
		private String Fuel_Type;
		private double price;
		public int getCar_Id() {
			return car_Id;
		}
		public void setCar_Id(int car_Id) {
			this.car_Id = car_Id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getBrand() {
			return brand;
		}
		public void setBrand(String brand) {
			this.brand = brand;
		}
		public String getFuel_Type() {
			return Fuel_Type;
		}
		public void setFuel_Type(String fuel_Type) {
			Fuel_Type = fuel_Type;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}		
}