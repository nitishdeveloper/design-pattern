package com.design.pattern.builder;

public class Address {
	
	private final String fullAddress;
	private final String state;
	private final String city;
	private final String pincode;
	private final String country;
	
	private Address(Builder builder) {
		this.fullAddress = builder.fullAddress;
		this.city = builder.city;
		this.state = builder.state;
		this.pincode = builder.pincode;
		this.country = builder.country;
	}
	
	
	
	@Override
	public String toString() {
		return "Address : \nfullAddress : " + fullAddress + "\nstate : " + state + "\ncity : " + city + "\ncountry : " + country
				+ "\npincode : " + pincode ;
	}

	public static class Builder{
		private  String fullAddress;
		private  String state;
		private  String city;
		private  String pincode;
		private  String country;
		
		public Builder fullAddress(String fullAddress) {
			this.fullAddress = fullAddress;
			return this;
		}
		public Builder state(String state) {
			this.state = state;
			return this;
		}
		public Builder city(String city) {
			this.city = city;
			return this;
		}
		public Builder country(String country) {
			this.country = country;
		    return this;
		}
		public Builder pincode(String pincode) {
			this.pincode = pincode;
			return this;
		}
		
		public Address build() {
			return new Address(this);
		}
	}
	
}
