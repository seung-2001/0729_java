package com.kh.model.vo;

public class Car {
	private int parkingNum;
	private int carNum;
	private int carType;
	private String owner;

	public Car() {
		super();
	}

	public Car(int carNum, int carType, String owner) {
		super();
		this.carNum = carNum;
		this.carType = carType;
		this.owner = owner;
		this.parkingNum++;
	}

	public int getParkingNum() {
		return parkingNum;
	}

	public void setParkingNum(int parkingNum) {
		this.parkingNum = parkingNum;
	}

	public int getCarNum() {
		return carNum;
	}

	public void setCarNum(int carNum) {
		this.carNum = carNum;
	}

	public int getCarType() {
		return carType;
	}

	public void setCarType(int carType) {
		this.carType = carType;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	@Override
	public String toString() {
		String typeName;

		switch (carType) {
			case 1:
				typeName = "경차";
				break;
			case 2:
				typeName = "세단";
				break;
			case 3:
				typeName = "SUV";
				break;
			case 4:
				typeName = "트럭";
				break;
			default:
				typeName = "알 수 없는 차량";
				break;
		}

		return "Car [parkingNum=" + parkingNum 
				+ ", carNum=" + carNum 
				+ ", carType=" + typeName 
				+ ", owner=" + owner + "]";
	}
}
