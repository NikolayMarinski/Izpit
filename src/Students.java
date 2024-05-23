public class Students {
    private String firstName;
    private String lastName;
    private int toefl;
    private int sat;
    private double transcript;
    private String major;
    private String university;

    public Students() {
    }

    public Students(String firstName, String lastName, int toefl, int sat, double transcript, String major, String university) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.toefl = toefl;
        this.sat = sat;
        this.transcript = transcript;
        this.major = major;
        this.university = university;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getToefl() {
        return toefl;
    }

    public void setToefl(int toefl) {
        this.toefl = toefl;
    }

    public int getSat() {
        return sat;
    }

    public void setSat(int sat) {
        this.sat = sat;
    }

    public double getTranscript() {
        return transcript;
    }

    public void setTranscript(double transcript) {
        this.transcript = transcript;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public boolean isValid(){

        String nameE

        if(firstName && lastName && sat>1200 && toefl>105 && transcript>5.50){

        }
    }
}
