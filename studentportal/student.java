package studentportal;

class student {
    private String Name;
    private int RollNo;
    private double Percentage;

    public String getName() {
        return Name;
    }
    public void setName(String name) {
        this.Name = name;
    }

    public int getRollNo() {
        return RollNo;
    }   
    public void setRollNo(int rollNo) {
        this.RollNo = rollNo;
    }

    public double getPercentage() {
        return Percentage;
    }
    public void setPercentage(double percentage) {
        this.Percentage = percentage;
    }
}