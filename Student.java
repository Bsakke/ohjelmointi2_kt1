import java.util.concurrent.ThreadLocalRandom;
import java.util.Calendar;

public class Student {
    private int id;
    private String firstName;
    private String lastName;
    private double bachelorCredits;
    private double masterCredits;
    private String titleOfMastersThesis;
    private String titleOfBachelorThesis;
    private int startYear;
    private int graduationYear;

    public Student() {
        this.id = getRandomId();
        this.firstName = "No name";
        this.lastName = "No name";
        this.bachelorCredits = 0.0;
        this.masterCredits = 0.0;
        this.titleOfMastersThesis = "No title";
        this.titleOfBachelorThesis = "No title";
        this.startYear = Calendar.getInstance().get(Calendar.YEAR);
        this.graduationYear = 0;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        if (id >= 1 && id <= 100) {
            this.id = id;
        }
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName != null) {
            this.firstName = firstName;
        }
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        if (lastName != null) {
            this.lastName = lastName;
        }
    }

    public double getBachelorCredits() {
        return this.bachelorCredits;
    }

    public void setBachelorCredits(final double bachelorCredits) {
        if (bachelorCredits >= 0.0 && bachelorCredits <= 300.0) {
            this.bachelorCredits = bachelorCredits;
        }
    }

    public double getMasterCredits() {
        return this.masterCredits;
    }

    public void setMasterCredits(final double masterCredits) {
        if (masterCredits >= 0.0 && masterCredits <= 300.0) {
            this.masterCredits = masterCredits;
        }
    }

    public String getTitleOfMastersThesis() {
        return titleOfMastersThesis;
    }

    public void setTitleOfMastersThesis(final String title) {
        if (title != null) {
            this.titleOfMastersThesis = title;
        }
    }

    public String getTitleOfBachelorThesis() {
        return this.titleOfBachelorThesis;
    }

    public void setTitleOfBachelorThesis(final String title) {
        if (title != null) {
            this.titleOfBachelorThesis = title;
        }
    }

    public int getStartYear() {
        return this.startYear;
    }

    public void setStartYear(final int startYear) {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        if (startYear > 2000 && startYear <= currentYear) {
            this.startYear = startYear;
        }
    }

    public int getGraduationYear() {
        return graduationYear;
    }

    public void setGraduationYear(int graduationYear) {
        if (canGraduate()) {
            if (graduationYear >= startYear && graduationYear <= Calendar.getInstance().get(Calendar.YEAR)) {
                this.graduationYear = graduationYear;
            }
        }
    }

    private boolean canGraduate() {
        return (bachelorCredits >= 180.0 && !titleOfBachelorThesis.equals("No title"))
                && (masterCredits >= 120.0 && !titleOfMastersThesis.equals("No title"));
    }
    
    public boolean hasGraduated() {
        if (canGraduate() && graduationYear == 0) {
            graduationYear = Calendar.getInstance().get(Calendar.YEAR);
            return true;
        } else {
            return false;
        }
    }
    public int getStudyYears() {
        if (canGraduate() && graduationYear >= startYear) {
            return graduationYear - startYear;
        }
        return (Calendar.getInstance().get(Calendar.YEAR) - startYear);
    }

    private int getRandomId() {
        return ThreadLocalRandom.current().nextInt(1, 101);
    }

    @Override
    public String toString() {
        String result = "ID: " + id + "\n" +
                "Name: " + firstName + " " + lastName + "\n" +
                "Status: " + graduationYear + "\n" +
                "StartYear: " + startYear + " (studies have lasted for "
                + getStudyYears() + " years)" + "\n" +
                "Bachelor credits: " + bachelorCredits + "\n" +
                "Master credits: " + masterCredits + "\n" +
                "TitleOfMasterThesis: " + titleOfMastersThesis + "\n"+
                "TitleOfBachelorThesis: " + titleOfBachelorThesis + "\n";

        return result;
    }

}
