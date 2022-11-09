package knoldus.constructor;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * The type User lombok model.
 */
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserLombokModel {
	private long id;
	
	@Getter
	@Setter
	private String firstName;
	
	@Getter
	@Setter
	private String lastName;
	private int age;
	private String gender;
}
