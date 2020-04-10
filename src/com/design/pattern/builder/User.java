package com.design.pattern.builder;

public class User {
	private final String firstname;
	private final String lastname;
	private final String mobile;
	private final String address;
	
	private User(UserBuilder userBuilder) {
		this.firstname = userBuilder.firstname;
		this.lastname = userBuilder.lastname;
		this.mobile = userBuilder.mobile;
		this.address = userBuilder.address;
	}

	public String getFirstname() {
		return firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public String getMobile() {
		return mobile;
	}

	public String getAddress() {
		return address;
	}

	@Override
	public String toString() {
		return "User : \nName : " + firstname + " " + lastname + "\nmobile : " + mobile
				+ "\naddress : " + address;
	}
	
	public static class UserBuilder {
		private final String firstname;
		private final String lastname;
		private String mobile;
		private String address;
		
		public UserBuilder(String firstname, String lastname) {
			this.firstname = firstname;
			this.lastname = lastname;
		}
		
		public UserBuilder moibile(String mobile) {
			this.mobile = mobile;
			return this;
		}
		
		public UserBuilder address(String address) {
			this.address =  address;
			return this;
		}
		
		public User build() {
			return new User(this);
		}
		
	}
}
