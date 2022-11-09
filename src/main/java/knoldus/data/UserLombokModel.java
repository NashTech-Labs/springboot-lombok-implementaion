package knoldus.data;

import java.time.LocalDate;

import lombok.Data;

/**
 * The type User lombok model.
 *
 * @Data is a convenient shortcut annotation that bundles the features of
 * @ToString, @EqualsAndHashCode, @Getter / @Setter and @RequiredArgsConstructor together.
 */
@Data
public class UserLombokModel {
	private long id;
	private String firstName;
	private String lastName;
	private int age;
	private LocalDate createdDate;
	private LocalDate updatedDate;
	private String gender;
}
