package com.msultan.spring.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class User {

	@Id
	private String id;

	private String userName;

	private String password;

	private String email;

	private String firstName;

	private String lastName;
}
