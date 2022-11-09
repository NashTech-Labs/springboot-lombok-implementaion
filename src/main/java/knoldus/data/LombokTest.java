package knoldus.data;

import java.time.LocalDate;

/**
 * The type Lombok test.
 */
public class LombokTest {
	/**
	 * The entry point of application.
	 *
	 * @param args the input arguments
	 */
	public static void main(String[] args) {
		UserLombokModel lombokModel = new UserLombokModel();

		// test setter methods
		lombokModel.setId(100L);
		lombokModel.setFirstName("Rashmi");
		lombokModel.setLastName("rajput");
		lombokModel.setAge(18);
		lombokModel.setGender("female");
		lombokModel.setCreatedDate(LocalDate.now());
		lombokModel.setUpdatedDate(LocalDate.now());

		UserLombokModel lombokModel2 = new UserLombokModel();

		lombokModel2.setId(100L);
		lombokModel2.setFirstName("Rashmi");
		lombokModel2.setLastName("rajput");
		lombokModel2.setAge(28);
		lombokModel2.setGender("female");
		lombokModel2.setCreatedDate(LocalDate.now());
		lombokModel2.setUpdatedDate(LocalDate.now());

		// equals method
		System.out.println(lombokModel.equals(lombokModel2));

		// hashCode method
		System.out.println(lombokModel.hashCode());
		System.out.println(lombokModel2.hashCode());

		// toString method
		System.out.println(lombokModel.toString());
	}
}
