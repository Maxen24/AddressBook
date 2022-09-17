/**
 * 
 */
package com.bridgeLabz;

/**
 * @author mshub
 *
 */
public class AddressBookUC1 {  //follow naming convention for class name
 private String firstName;
 private String lastName;
 private String address;
 private String mobileNumber;
 private String zipCode;
 private String email;
 
 public void setfirstName(String f) {
	 firstName=f;
	 }
 public void setlastName(String l) {
	 lastName=l;
	 }
 public void setaddress(String add) {
	 address=add;
 }
 public void setmobileNumber(String call) {
	mobileNumber=call;
 }
 public void setzipCode(String zip) {
	 zipCode=zip;
 }
 public void setemail(String mailid) {
	 email=mailid;
 }
 public String getfirstName() {
	 return firstName;
 }
 public String getlastName() {
	 return lastName;
 }
 public String getaddress() {
 	return address;
 }
public String getmobileNumber() {
	return mobileNumber;
 }
public String getzipCode() {
	return zipCode;
 }
public String getemail() {
	return email;
}
public static void main(String[] args) {
	AddressBookUC1 myEntry=new AddressBookUC1();
	myEntry.setfirstName("Enter your First Name:"+" "+"Shubham");
	myEntry.setlastName("Enter your Last Name:"+" "+"Mishra");
	myEntry.setaddress("Enter your address:"+" "+"Lucknow UP");
	myEntry.setmobileNumber("Enter your Mobile Number:"+" "+"9695795784");
	myEntry.setzipCode("Enter your Zipcode:"+" "+"211013");
	myEntry.setemail("Enter Your Email Id:"+" "+"mshubham242@gmail.com");
System.out.println(myEntry.getfirstName());
System.out.println(myEntry.getlastName());
System.out.println (myEntry.getmobileNumber());
System.out.println(myEntry.getaddress());
System.out.println(myEntry.getzipCode());
System.out.println(myEntry.getemail());	

}
	
	
	
	
	
	
	
	
	
	
}