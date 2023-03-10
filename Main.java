public class Main {

    public static void main(String[] args) {

        Student student1 = new Student();

        student1.setStartYear(2021);
        student1.setId(0);
        student1.setLastName("Donald");
        student1.setFirstName("Duck");
        student1.setBachelorCredits(180.0);
        student1.setMasterCredits(120.0);
        student1.setTitleOfMastersThesis("Masters thesis title");
        student1.setTitleOfBachelorThesis("Bachelor thesis title");
        student1.setGraduationYear(2023);

        Student student2 = new Student();

        student2.setStartYear(2023);
        student2.setId(101);
        student2.setLastName(ConstantValues.NO_NAME);
        student2.setFirstName(ConstantValues.NO_NAME);
        student2.setBachelorCredits(180.0);
        student2.setMasterCredits(120.0);
        student2.setTitleOfMastersThesis("Happy ending");
        student2.setTitleOfBachelorThesis("How to survive a bachelors thesis");
        student2.setGraduationYear(2019);

        System.out.println(student1.toString());
       
        System.out.println(student2.toString());
      

    }
}