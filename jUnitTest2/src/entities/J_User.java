package entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="J_User")
public class J_User {
	
	@Id
	private String email;
	private String name;
	private String password;
	private String address;
	private String state;
	private String zipcode;
	
	public J_User(int id, String email, String name, String password, String address, String state, String zipcode) {
		this.email = email;
		this.name = name;
		this.password = password;
		this.address = address;
		this.state = state;
		this.zipcode = zipcode;
	}
	
	public J_User() {
		
	}


	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}
	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}
	/**
	 * @return the zipcode
	 */
	public String getZipcode() {
		return zipcode;
	}
	/**
	 * @param zipcode the zipcode to set
	 */
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "J_User [email=" + email + ", name=" + name + ", password=" + password + ", address=" + address
				+ ", state=" + state + ", zipcode=" + zipcode + "]";
	}

	
	@Override
	public boolean equals (Object obj) {
		if(obj instanceof J_User) {
			J_User other = (J_User)obj;
			boolean sameEmail = this.email.equals(other.getEmail());
			boolean sameName = this.name.equals(other.getName());
			boolean samePassword = this.password.equals(other.getPassword());
			boolean sameAddress = this.address.equals(other.getAddress());
			boolean sameState = this.state.equals(other.getState());
			boolean sameZipcode = this.zipcode.equals(other.getZipcode());
			if (sameEmail && sameName && samePassword && sameAddress && sameState && sameZipcode) {
				return true;
			}else {
				return false;
			}
		}else {
			return false;
		}

	}
}
	

