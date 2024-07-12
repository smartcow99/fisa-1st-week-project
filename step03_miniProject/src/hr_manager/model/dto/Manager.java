package hr_manager.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@Builder
public class Manager {
	// Manager PK
	private int no;

	// Manager Name
	private String name;

	// Manager Tel
	private String tel;

	// Manger Email(ID)
	private String email;

	// Manger Password
	private String pw;

	public String toCsvString() {
		return no + "," + name + "," + tel + "," + email + "," + pw;
	}
}
