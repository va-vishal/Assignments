package in.vishal;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Pattern.Flag;

public class Contact {
    @NotEmpty(message = "Name is required")
	private String lname;
    
    @NotEmpty(message = "Name is required")
    private String name;
    
    @NotEmpty(message = "Email is required")
    @Email(regexp = "[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,3}",
    flags = Pattern.Flag.CASE_INSENSITIVE ,message = "Invalid email address")
    private String email;
    
    @NotEmpty(message = "Phone number is required")
    @Pattern(regexp="\\d{10}", message="Phone number must be 10 digits")
    private String phone;
    
    public Contact() {
		// TODO Auto-generated constructor stub
	}
	public Contact(String lname,String name, String email, String phone) {
		super();
		this.lname=lname;
		this.name = name;
		this.email = email;
		this.phone = phone;
	}
	public String getlname() {
		return lname;
	}
	public void setlname(String lname) {
		this.lname = lname;
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
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Contact [lname=" + lname + ", name=" + name + ", email=" + email + ", phone=" + phone + "]";
	}
	
	

}