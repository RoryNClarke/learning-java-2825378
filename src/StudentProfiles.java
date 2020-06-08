package src;

public class StudentProfiles {

    String firstName;
    String lastName;
    double gpa; 
    String declaredMajor;
    int expectedGraduationYear;

    public StudentProfiles (String firstName, String lastName, double gpa,
                            String declaredMajor, int expectedGraduationYear){

            this.firstName = firstName;
            this.lastName = lastName;
            this.gpa = gpa;
            this.declaredMajor = declaredMajor;
            this.expectedGraduationYear = expectedGraduationYear;
                            }

    public void incrementGraduationYear () {

        this.expectedGraduationYear = expectedGraduationYear ++ ; 
    }
    
}