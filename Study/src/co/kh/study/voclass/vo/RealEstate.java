package co.kh.study.voclass.vo;

public class RealEstate {
    private String address;
    private String type;
    private int area;
    private int rooms;
    private int price;

    public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}

	public int getRooms() {
		return rooms;
	}

	public void setRooms(int rooms) {
		this.rooms = rooms;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String showInfo() {

		String info = "\n🏠 부동산 정보:"
        +"- 주소: " + address
        +"- 종류: " + type
        +"- 면적: " + area + "㎡"
        +"- 방 개수: " + rooms
        +"- 가격: " + price + " 만원";
		return info;
    }

    public void increasePrice(int amount) {
        price += amount;
        System.out.println("가격이 " + amount + "만원 올랐습니다. 현재 가격: " + price + " 만원");
    }

    public void renovate() {
        rooms += 1;
        price += 1000;
        System.out.println("리모델링 완료! 방 1개 추가, 가격 1000만원 상승.");
        System.out.println("현재 방 개수: " + rooms + ", 현재 가격: " + price + "만원");
    }
}
