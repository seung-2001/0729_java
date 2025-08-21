package co.kh.study.voclass.vo;

public class MusicPlayer {

    private String musicName;
    private int storage;
    private int batteryLifeHours;
    private String supportedFormats;
    private boolean hasBluetooth;
    
    public MusicPlayer() {
    	
    }
    public MusicPlayer(String musicName,int storage,int batteryLifeHours,String supportedFormats,boolean hasBluetooth) {
    	this.musicName = musicName;
    	this.storage = storage;
    	this.batteryLifeHours = batteryLifeHours;
    	this.supportedFormats = supportedFormats;
    	this.hasBluetooth = hasBluetooth;
    }

    public String getMusicName() {
		return musicName;
	}

	public void setMusicName(String musicName) {
		this.musicName = musicName;
	}

	public int getStorage() {
		return storage;
	}

	public void setStorage(int storage) {
		this.storage = storage;
	}

	public int getBatteryLifeHours() {
		return batteryLifeHours;
	}

	public void setBatteryLifeHours(int batteryLifeHours) {
		this.batteryLifeHours = batteryLifeHours;
	}

	public String getSupportedFormats() {
		return supportedFormats;
	}

	public void setSupportedFormats(String supportedFormats) {
		this.supportedFormats = supportedFormats;
	}

	public boolean isHasBluetooth() {
		return hasBluetooth;
	}

	public void setHasBluetooth(boolean hasBluetooth) {
		this.hasBluetooth = hasBluetooth;
	}

	public int getBattery() {
		return battery;
	}

	public void setBattery(int battery) {
		this.battery = battery;
	}

	public int battery = 100;

    public void playMusic() {
        if (battery < 1) {
            System.out.println("배터리가 부족합니다. 충전이 필요합니다. (현재 배터리: " + battery + "%)");
        } else {
            System.out.println("🎵 '" + musicName + "' 음악 재생 중...");
            battery -= 10;
            batteryLifeHours -= 1;
            System.out.println("남은 배터리: " + battery + "%"+ "\n남은 재생 시간: " + batteryLifeHours + "시간");
        }
    }

    public void changeMusic(String newMusicName) {
        System.out.println("🎶 음악을 '" + musicName + "'에서 '" + newMusicName + "'로 변경합니다.");
        musicName = newMusicName;
    }

    public String showStatus() {
    	String status = "\n Music Player 상태 확인:"
    					+ "\n- 현재 음악: " + musicName
    					+ "\n- 저장 용량: " + storage + "GB"
    					+ "\n- 배터리 잔량: " + battery + "%"
    					+ "\n- 남은 사용 시간: " + batteryLifeHours + "시간"
    					+ "\n- 지원 포맷: " + supportedFormats
    					+ "\n- 블루투스 지원 여부: " + (hasBluetooth ? "지원" : "미지원");
    	return status;
    }
}
