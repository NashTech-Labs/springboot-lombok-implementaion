package knoldus.builder;

import lombok.Builder;

import lombok.ToString;

/**
 * The type User.
 */
@Builder
@ToString
public class User {
	private long id;
	private String firstName;
	private String lastName;
	private int age;
	private String gender;
}
