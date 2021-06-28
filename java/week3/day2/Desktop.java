package week3.day2;

public class Desktop implements HardWare, Software{

	public void desktopModel() {
		System.out.println("This is desktop Model");

	}

	public void softwareResources() {
		System.out.println("This is Software Resources");
		
	}

	public void hardwareResources() {
		System.out.println("This is Hardware Resources");
		
	}
	public static void main(String[] args) {
		Desktop desk = new Desktop();
		desk.desktopModel();
		desk.softwareResources();
		desk.hardwareResources();
	}
}
