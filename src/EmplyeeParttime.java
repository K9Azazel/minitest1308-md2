public class EmplyeeParttime extends Employee{
    double workingTime;

    public EmplyeeParttime(int employeeCode, String name, int age, String phoneNumber, String email, int workingTime) {
        super(employeeCode, name, age, phoneNumber, email);
        this.workingTime = workingTime;
    }

    public double getWorkingTime() {
        return workingTime;
    }

    public void setWorkingTime(double workingTime) {
        this.workingTime = workingTime;
    }

    @Override
    double getSalary() {
        return this.workingTime*100000;
    }
}
