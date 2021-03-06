package gradle_spring5_chap02.di;

public class RegisterRequest {

	private String email;
	private String password;
	private String confirmPassword;
	private String name;

	public RegisterRequest() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RegisterRequest(String email, String password, String confirmPassword, String name) {
		super();
		this.email = email;
		this.password = password;
		this.confirmPassword = confirmPassword;
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return String.format("RegisterRequest [email=%s, password=%s, confirmPassword=%s, name=%s]", email, password,
				confirmPassword, name);
	}
	
	public boolean isPasswordEqualsToConfirmPassword() {
		return password.equals(confirmPassword);
	}

}
