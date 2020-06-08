package src; 
public class Main {

    public static void main(String[] args) {
        StudentProfiles profileOne = new StudentProfiles("Rory","Clarke", 3.65, "Computer", 2021);
        
        
        profileOne.incrementGraduationYear();
        System.out.println(profileOne.expectedGraduationYear);
    }
    }


