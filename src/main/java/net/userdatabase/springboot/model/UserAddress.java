package net.userdatabase.springboot.model;


	
	import javax.persistence.CascadeType;
import javax.persistence.Column;
	import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.JoinColumn;
	import javax.persistence.ManyToOne;
import javax.persistence.Table;

	@Entity
	@Table(name = "useraddress")
	public class UserAddress {
		
		@Id
		@GeneratedValue(strategy =  GenerationType.IDENTITY)
		private int id;

		
		@Column(name = "addrLn1")
		private String addrLn1;
		
		@Column(name = "addrLn2")
		private String addrLn2;
		
		@Column(name = "email")
		private String email;
		
		@Column(name = "addrname")
		private String addrname;
		

		@Column(name = "addrtype")
		private String addrtype;
		
		@Column(name = "city")
		private String city;
		
	
		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getAddrLn1() {
			return addrLn1;
		}

		public void setAddrLn1(String addrLn1) {
			this.addrLn1 = addrLn1;
		}

		public String getAddrLn2() {
			return addrLn2;
		}

		public void setAddrLn2(String addrLn2) {
			this.addrLn2 = addrLn2;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getAddrname() {
			return addrname;
		}

		public void setAddrname(String addrname) {
			this.addrname = addrname;
		}

		public String getAddrtype() {
			return addrtype;
		}

		public void setAddrtype(String addrtype) {
			this.addrtype = addrtype;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getCountry() {
			return country;
		}

		public void setCountry(String country) {
			this.country = country;
		}

		public String getLocationCode() {
			return locationCode;
		}

		public void setLocationCode(String locationCode) {
			this.locationCode = locationCode;
		}

		public String getPostalCode() {
			return postalCode;
		}

		public void setPostalCode(String postalCode) {
			this.postalCode = postalCode;
		}

		public String getStateCode() {
			return stateCode;
		}

		public void setStateCode(String stateCode) {
			this.stateCode = stateCode;
		}

		@Column(name = "country")
		private String country;
		
		@Column(name = "locationCode")
		private String locationCode;
		
		@Column(name = "postalCode")
		private String postalCode;
		
		@Column(name = "stateCode")
		private String stateCode;
		
		@ManyToOne(targetEntity = User.class)
		@JoinColumn(name = "user_id")
		private User user;

	
		

}
