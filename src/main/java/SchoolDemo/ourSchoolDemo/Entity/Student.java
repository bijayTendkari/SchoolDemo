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
	private int id;
	 @Min(value=3)
	 @Column
	private String FirstName;
	 @Min(value=3)
	 @Column
	private String LastName;
	 @Column(nullable=false)
	 @Min(value = 18, message = "Age must be greater than 15")
	 @Max(value = 25, message = "Age must be smaller than 20")
	private int DoB;
	 @Column(nullable = false)
	private String Section;
	 
	 @Column(nullable = false)
	private String Gender;
	 @Size(min = 0, max = 100, message = "About Me must be between 0 and 100 characters")
	 @Column(nullable = false)
	private int mark1;
	 
	 @Column(nullable = false)
	private int mark2;
	 
	 @Column(nullable = false)
	private int mark3;
	 @Column(nullable = false)
	private int Total;
	 @Column(nullable = false)
	private int Avarage;
	 @Column(nullable = false)
	private int Result;
	
	
	
	
	
	
	
	

}
