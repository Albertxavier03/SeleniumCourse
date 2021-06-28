package week3.day1;

public class SmartPhone extends AndroidPhone {
	
	public void connectWhatsApp() {
		System.out.println("connecting to WhatsApp");
	}
	public void takeVideo() {
		System.out.println("taking the video in Smart Phone");

	}

	public static void main(String[] args) {
		SmartPhone mySmartPhone = new SmartPhone();
		mySmartPhone.takeVideo();
	}

}
