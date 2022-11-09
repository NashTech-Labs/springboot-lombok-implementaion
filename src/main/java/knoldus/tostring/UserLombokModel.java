package knoldus.tostring;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * The type User lombok model.
 */
@Getter
@Setter
@ToString
public class UserLombokModel {
	private long id;
	private String firstName;
	private String lastName;
	private int age;
	private LocalDate createdDate;
	private LocalDate updatedDate;
	private String gender;


	/**
	 * The entry point of application.
	 *
	 * @param args the input arguments
	 */
	public static void main(String[] args) {
		UserLombokModel lombokModel = new UserLombokModel();
		
		lombokModel.setId(100L);
		lombokModel.setFirstName("Rashmi");
		lombokModel.setLastName("rajput");
		lombokModel.setAge(18);
		lombokModel.setGender("female");
		lombokModel.setCreatedDate(LocalDate.now());
		lombokModel.setUpdatedDate(LocalDate.now());
		
		System.out.println(lombokModel.toString());
	}
}
