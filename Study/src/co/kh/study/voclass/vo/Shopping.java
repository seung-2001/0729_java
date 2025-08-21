package co.kh.study.voclass.vo;

public class Shopping {
    private String itemName;
    private int quantity;
    private double pricePerUnit;
    private String category;
    private boolean isDelivered;
    
    public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPricePerUnit() {
		return pricePerUnit;
	}

	public void setPricePerUnit(double pricePerUnit) {
		this.pricePerUnit = pricePerUnit;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public boolean isDelivered() {
		return isDelivered;
	}

	public void setDelivered(boolean isDelivered) {
		this.isDelivered = isDelivered;
	}



    public String showInfo() {
        String info = "\n🛒 쇼핑 정보:"
        		+"- 상품명: " + itemName
        		+"- 수량: " + quantity
        		+"- 단가: %.2f 원\n" + pricePerUnit
        		+"- 카테고리: " + category
        		+"- 배송 여부: " + (isDelivered ? "배송 완료" : "배송 대기");
        return info;
    }

    public void deliver() {
        if (isDelivered) {
            System.out.println("이미 배송 완료된 상품입니다.");
        } else {
            isDelivered = true;
            quantity = 0; 
            System.out.println("상품이 배송 처리되었고, 재고가 0으로 변경되었습니다.");
        }
    }


    public void printTotalPrice() {
        double total = quantity * pricePerUnit;
        System.out.printf("총 가격: %.2f 원\n", total);
    }
}
