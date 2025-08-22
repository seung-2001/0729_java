package com.kh.controller;

import java.util.ArrayList;
import com.kh.model.vo.Car;

public class ParkingTowerController {
    private ArrayList<Car> carList;

    public ParkingTowerController() {
    	super();
    }

    public ParkingTowerController(ArrayList<Car> carList) {
		super();
		this.carList = carList;
	}

	public void insertCar(int carNum, int num, String owner) {
        carList.add(new Car(carNum, num, owner));
    }

    public int deleteCar(int carNum) {
        for (int i = 0; i < carList.size(); i++) {
            Car car = carList.get(i);
            if (carNum == car.getCarNum()) {
                carList.remove(i);
                return 1;
            }
        }
        return 0;
    }

    public ArrayList<Car> searchCar(String owner) {
        ArrayList<Car> searchCar = new ArrayList<>();

        for (Car car : carList) {
            if (car.getOwner().equals(owner)) {
                searchCar.add(car);
            }
        }

        return searchCar;
    }

    public ArrayList<Car> selectList() {
        return carList;
    }
}
