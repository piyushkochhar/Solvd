package HW1;

public class UserInfo {

	private static String firstName;
	private static String lastName;
	private static int age;
	private static String phone;
	private static String email;
	private static String country;
	private static int postalZip;

	public static void printUserInfo() {
		String result = "Your name is " + firstName + " " + lastName + ". Your age is " + age + ". You reside in "
				+ country + ", with zip code " + postalZip + ". Your phone number is " + phone
				+ " and your email id is " + email + ".";
		
		System.out.println(result);
	}

	public static void main(String[] args) {

		firstName = args[0];
		lastName = args[1];
		age = Integer.parseInt(args[2]);
		country = args[3];
		postalZip = Integer.parseInt(args[4]);
		phone = args[5];
		email = args[6];

		printUserInfo();

	}

}
