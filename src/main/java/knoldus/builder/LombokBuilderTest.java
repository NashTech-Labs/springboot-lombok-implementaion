package knoldus.builder;

import knoldus.builder.User.UserBuilder;

/**
 * The type Lombok builder test.
 */
public class LombokBuilderTest {
	/**
	 * The entry point of application.
	 *
	 * @param args the input arguments
	 */
	public static void main(String[] args) {
		// create builder class and add parameters to it.
		UserBuilder builder = new UserBuilder();

		builder.id(100L);
		builder.firstName("Rashmi");
		builder.lastName("rajput");
		builder.age(18);
		builder.gender("female");
		builder.build();
		System.out.println();
		System.out.println(builder.toString());
		System.out.println();
	}
}
