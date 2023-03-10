
import java.time.Year;
import java.util.Random;

public class Filler {
    private String firstName;
    private String lastName;
    private int id;
    private double bachelorCredits;
    private double masterCredits;
    private String titleOfMastersThesis;
    private String titleOfBachelorThesis;
    private int startYear;
    private int graduationYear;

    public Filler() {
        this(ConstantValues.NO_NAME, ConstantValues.NO_NAME);
    }

    public Filler(String lastName, String firstName) {
        this.firstName = firstName != null ? firstName : ConstantValues.NO_NAME;
        this.lastName = lastName != null ? lastName : ConstantValues.NO_NAME;
        this.id = generateId();
        this.bachelorCredits = ConstantValues.MIN_CREDIT;
        this.masterCredits = ConstantValues.MIN_CREDIT;
        this.titleOfMastersThesis = ConstantValues.NO_TITLE;
        this.titleOfBachelorThesis = ConstantValues.NO_TITLE;
        this.startYear = Year.now().getValue();
        this.graduationYear = getGraduationYear();

    }

    private int generateId() {
        Random random = new Random();
        int id = random.nextInt(100) + 1;
        if (id < 1 || id > 100) {
            System.out.println("Error with ID");
            return id = -1;

        }
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName != null) {
            this.firstName = firstName;
        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName != null) {
            this.lastName = lastName;
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id >= ConstantValues.MIN_ID && id <= ConstantValues.MAX_ID) {
            // id can be set only if it is within the allowed range
            // otherwise, it remains unchanged
            this.id = id;
        }
    }

    public double getBachelorCredits() {
        return bachelorCredits;
    }

    public void setBachelorCredits(double bachelorCredits) {
        if (bachelorCredits >= ConstantValues.MIN_CREDIT && bachelorCredits <= ConstantValues.MAX_CREDITS) {
            // bachelor credits can be set only if they are within the allowed range
            this.bachelorCredits = bachelorCredits;
        }
    }

    public double getMasterCredits() {
        return masterCredits;
    }

    public void setMasterCredits(double masterCredits) {
        if (masterCredits >= ConstantValues.MIN_CREDIT && masterCredits <= ConstantValues.MAX_CREDITS) {
            // master credits can be set only if they are within the allowed range
            this.masterCredits = masterCredits;
        }
    }

    public String getTitleOfMastersThesis() {
        return titleOfMastersThesis;
    }

    public void setTitleOfMastersThesis(String titleOfMastersThesis) {
        if (titleOfMastersThesis != null) {
            this.titleOfMastersThesis = titleOfMastersThesis;

        }
    }

    public String getTitleOfBachelorThesis() {
        return titleOfBachelorThesis;
    }

    public void setTitleOfBachelorThesis(String titleOfBachelorsThesis) {
        if (titleOfBachelorsThesis != null) {
            this.titleOfBachelorThesis = titleOfBachelorsThesis;
        }
    }

    public int getGraduationYear() {
        return graduationYear;
    }

    public void setGraduationYeaar(int graduationYear) {
        this.graduationYear = graduationYear;
    }

    public int getStartYear() {
        return startYear;
    }

    public void setStartYear(int startYear) {
        this.startYear = startYear;
    }
}
