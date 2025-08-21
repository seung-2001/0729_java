package co.kh.study.voclass.vo;


public class InBody {

    private String name;
    private int age;
    private double height; 
    private double weight; 
    private double bmi;    
    private double bodyFatPercentage;
    private String gender; 
    
    public InBody() { }
    
    public InBody(String name, int age, double height, double weight, String gender ) {
    	this.name = name;
    	this.age = age;
    	this.height = height;
    	this.weight = weight;
    	this.gender = gender;
 
    }


    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getHeight() {
		return height;
	}
	

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getBmi() {
		return bmi;
	}

	public void setBmi(double bmi) {
		this.bmi = bmi;
	}

	public double getBodyFatPercentage() {
		return bodyFatPercentage;
	}

	public void setBodyFatPercentage(double bodyFatPercentage) {
		this.bodyFatPercentage = bodyFatPercentage;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void updateBodyStats() {
		double heightInMeters = height / 100.0;
		bmi = weight / (heightInMeters * heightInMeters);
		
		if (gender.equalsIgnoreCase("M")) {
			bodyFatPercentage = 1.20 * bmi + 0.23 * age - 16.2;
		} else if (gender.equalsIgnoreCase("F")) {
			bodyFatPercentage = 1.20 * bmi + 0.23 * age - 5.4;
		} else {
			System.out.println("성별 정보가 올바르지 않습니다.");
			bodyFatPercentage = 0;
		}
	}
	
	public String showStatus() {
		String status = "이름: " + name 
				+ "\n나이: " + age + "\n키: " + height + " cm" + "\n몸무게: " + weight + " kg" 
				+ "\nBMI: " + bmi 
				+ "\n체지방률: \n"+ bodyFatPercentage;
		return status;
    }
}
