package StudentProjectByUsingCURD;

public class student {
protected static String name;
protected static String ph;
protected static String email;
protected static String gender;
protected static String course;
protected static String fee;
public static String getName() {
	return name;
}
public static void setName(String name) {
	student.name = name;
}
public static String getPh() {
	return ph;
}
public static void setPh(String ph) {
	student.ph = ph;
}
public static String getEmail() {
	return email;
}
public static void setEmail(String email) {
	student.email = email;
}
public static String getGender() {
	return gender;
}
public static void setGender(String gender) {
	student.gender = gender;
}
public static String getCourse() {
	return course;
}
public static void setCourse(String course) {
	student.course = course;
}
public static String getFee() {
	return fee;
}
public static void setFee(String fee) {
	student.fee = fee;
}
public student() {
	super();
	// TODO Auto-generated constructor stub
}
public student(String name,String ph,String email,String gender,String course,String fee) {
	super();
	this.name=name;
	this.ph=ph;
	this.email=email;
	this.gender=gender;
	this.course=course;
	this.fee = fee;
	
}
	
}
