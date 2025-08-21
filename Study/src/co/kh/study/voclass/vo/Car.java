package co.kh.study.voclass.vo;

public class Car {
    private String name;
    private int fuel;
    private int speed;
    private int price;
    private String color;
    
    public Car() { }
    
    public Car(String name, int fuel, int speed, int price, String color) {
    	this.name = name;
    	this.fuel = fuel;
    	this.speed = speed;
    	this.price = price;
    	this.color = color;
    }
    
    
    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getFuel() {
		return fuel;
	}

	public void setFuel(int fuel) {
		this.fuel = fuel;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void speedUp() {
    	if(fuel<10) {
    		System.out.println("기름이 부족합니다. 기름을 충전해주세요");
    		System.out.println("기름 > "+ fuel);
    	}else {
    		speed = speed + 10;
    		System.out.println(name + "의 속도를 올립니다!");
    		System.out.println(name + "의 현재속도는 > " + speed);
    		fuel = fuel -5;
    	}
    }

    public String displayInfo() {
        String info ="🚗 의 이름 : " + name + "\n속도 :  " + speed + "\n남은연료 :  " +  fuel+ "\n가격 : " + price + "\n색 : " +color;
        return info;
    }
}
