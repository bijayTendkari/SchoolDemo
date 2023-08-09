package SchoolDemo.ourSchoolDemo.Entity;

import org.antlr.v4.runtime.misc.NotNull;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Student")

public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Min(value = 3, message = "first name must be 3 character")
	@Column
	private String FirstName;
	@Min(value = 3, message = "first name must be 3 character")
	@Column
	private String LastName;
	@Column
	@NotBlank
	@Min(value = 15, message = "Age must be greater than 15")
	@Max(value = 20, message = "Age must be smaller than 20")
	LocalDate dateOfBirth;
	@Column
	@Pattern(regexp = "^[A-C]")
	private String Section;

	@Column
	private String Gender;
	@Size(min = 0, max = 100, message = "About Me must be between 0 and 100 characters")
	@Size(min = 34, message = "validation fail")
	@Column(nullable = false)
	private int mark1;
	@Size(min = 0, max = 100, message = "About Me must be between 0 and 100 characters")
	@Size(min = 34, message = "validation fail")
	@Column
	private int mark2;
	@Size(min = 0, max = 100, message = "About Me must be between 0 and 100 characters")
	@Size(min = 34, message = "validation fail")
	@Column
	private int mark3;

	@Column(nullable = false)
	private int getTotal() {

		return mark1 + mark2 + mark3;

	}

	@Column
	private int getAvarage() {

		return (mark1 + mark2 + mark3) / 3;
	}

	@Column(nullable = false)
	private void getResult() {

		String result;
		double avg = (mark1 + mark2 + mark3) / 3;
		if (avg > 35) {

			result = "pass";

		} else {

			result = "fail";
		}

	}

	

}
