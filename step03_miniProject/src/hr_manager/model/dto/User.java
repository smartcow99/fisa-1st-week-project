package hr_manager.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {
	//
	private int no;
	
	private String email;
	
	private String pw;
	
	private String name;
	
	private String cls;
	
	private String tel;
}
