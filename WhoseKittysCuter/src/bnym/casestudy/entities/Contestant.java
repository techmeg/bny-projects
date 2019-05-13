package bnym.casestudy.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Contestant {

	
	@NotNull
	@Column(name = "Owner_Name")
	private String name;
	
	
	@Id
	@NotNull
	@Column(name = "Email")
	private String email;
	
	@OneToOne(optional=false)
    @JoinColumn(name = "Cat_Id")
	private Cat cat;

	public Contestant(String name, String email) {
		super();
		this.name = name;
		this.email = email;

	}

	@Override
	public String toString() {
		return "Contestant [name=" + name + ", email=" + email + ", cat=" + cat + "]";
	}

	public Contestant () {
		
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Cat getCat() {
		return cat;
	}

	public void setCat(Cat cat) {
		this.cat = cat;
	}
	
	
}
