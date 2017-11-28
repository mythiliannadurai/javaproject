
	package org.model;

	import javax.annotation.Generated;
import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.Id;
	import javax.persistence.Temporal;
	import javax.persistence.TemporalType;
	import org.hibernate.type.DateType;

	@Entity
	public class User {
		@Id
		@Generated(value = { "" })
		private int adId;
		private String firstName;
		private String lastName;
		private String address;
		private int date;
		private String mailId;
		private String phno;

		
		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		
	        public String getMailId() {
			return mailId;
		}

		public void setMailId(String mailId) {
			this.mailId = mailId;
		}

		
	           public String getAddress() {
				return address;
			}
			public void setAddress(String address) {
				address = address;
			}
			public String getPhno() {
				return phno;
			}
			public void setPhno(String phno) {
				this.phno = phno;
			}
			
			

	

}
