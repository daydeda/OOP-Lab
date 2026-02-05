package Class_Relationships;

public class TestAggregation {
    public static void main(String[] args){
        Address address = new Address("123 Main St", "Chiang Mai", "50200");
        Student student = new Student("682115036", "Puri Sangnawakit", address);
        System.out.println(student.getStudentInfo());
    }
}