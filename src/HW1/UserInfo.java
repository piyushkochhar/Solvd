package HW1;

public class UserInfo {

	private String firstName;
	private String lastName;
	private int age;
	private String phone;
	private String email;
	private String country;
	private int postalZip;
	
	UserInfo(String firstName, String lastName, int age, String country, int postalZip, String phone, String email) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.country = country;
		this.postalZip = postalZip;
		this.phone = phone;
		this.email = email;
	}
	
	public void printUserInfo() {
		String result = "Your name is " + firstName + " " + lastName + ". Your age is " + age + ". You reside in "
				+ country + ", with zip code " + postalZip + ". Your phone number is " + phone
				+ " and your email id is " + email + ".";
		
		System.out.println(result);
	}

	public static void main(String[] args) {
		
		UserInfo user = new UserInfo(args[0], args[1], Integer.parseInt(args[2]),args[3], Integer.parseInt(args[2]), args[5], args[6]);

		user.printUserInfo();

	}

}
