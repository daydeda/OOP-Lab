package Class_Relationships;

public class Student {
    private String studentID;
    private String name;
    private Address address;

    public Student(String studentID, String name, Address address) {
        this.studentID = studentID;
        this.name = name;
        this.address = address;
    }
    public String getStudentInfo(){
        return "Student ID: " + studentID + ", Name: " + name + ", Address: " + address.getStreet() + ", " + address.getCity() + ", " + address.getZipCode();
    }
}