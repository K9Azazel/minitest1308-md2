public class EmployeeFulltime extends Employee{
    long salaryBonus;
    long salaryPenalty;
    long salary;

    public EmployeeFulltime(int employeeCode, String name, int age, String phoneNumber, String email, long salaryBonus, long salaryPenalty, long salary) {
        super(employeeCode, name, age, phoneNumber, email);
        this.salaryBonus = salaryBonus;
        this.salaryPenalty = salaryPenalty;
        this.salary = salary;
    }

    @Override
   public double getSalary() {
        return this.salary + (this.salaryBonus-this.salaryPenalty);
    }
}

