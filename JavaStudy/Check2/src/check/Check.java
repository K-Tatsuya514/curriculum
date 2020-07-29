package check;

import constants.Constants;

public class Check {
	private static String firstName = "竜也";
	private static String lastName = "小林";

	private static void printName(String first, String last) {
		System.out.println("printNameメソッド → " + last + first);
	}

	public static void main(String[] args) {
		printName(firstName, lastName);

		Pet pet = new Pet(Constants.CHECK_CLASS_JAVA, Constants.CHECK_CLASS_HOGE);
		pet.introduce();

		RobotPet robotpet = new RobotPet(Constants.CHECK_CLASS_R2D2,Constants.CHECK_CLASS_LUKE);
		robotpet.introduce();

	}

}
