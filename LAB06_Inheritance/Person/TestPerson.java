public class TestPerson {
    public static void main(String[] args) {
        Person person = new Person("Peter", "20 Ingram Street", "212-555-1234", "peter.parker@example.com");
        System.out.println(person.toString());

        Student student = new Student("Susan", "30 Oak Avenue", "415-555-5678", "susan.jones@example.com",
                Student.FRESHMAN);
        System.out.println(student.toString());

        Employee employee = new Employee("Eva", "100 Main Street", "310-555-9012", "eva.doe@example.com", "Room 101",
                50000);
        System.out.println(employee.toString());

        Faculty faculty = new Faculty("Frank", "50 Pine Road", "212-555-2345", "frank.smith@example.com", "Room 102",
                70000, "9am-5pm", "Professor");
        System.out.println(faculty.toString());

        Staff staff = new Staff("Shane", "Room 202", "415-555-3456", "shane.member@example.com", "Room 202", 60000,
                "Manager");
        System.out.println(staff.toString());
    }
}