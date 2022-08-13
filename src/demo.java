import java.util.Arrays;
public class demo {
    public static void main(String[] args) {
        Employee A = new EmployeeFulltime(1, "A", 18, "011223344", "a@gmail.com", 500000, 0, 50000000);
        Employee B = new EmployeeFulltime(2, "B", 19, "011223345", "b@gmail.com", 400000, 0, 40000000);
        Employee C = new EmployeeFulltime(3, "C", 20, "011223346", "c@gmail.com", 300000, 100000, 50000000);
        Employee D = new EmployeeFulltime(4, "D", 21, "011223347", "d@gmail.com", 700000, 200000, 70000000);
        Employee E = new EmployeeFulltime(5, "E", 22, "011223348", "e@gmail.com", 200000, 300000, 80000000);
        Employee F = new EmplyeeParttime(6, "F", 23, "0313911911", "f@gmail.com", 4);
        Employee G = new EmplyeeParttime(7, "G", 24, "0313113113", "g@gmail.com", 5);
        Employee H = new EmplyeeParttime(8, "Trương Huy Hoàng", 23, "0313911911", "hoang@gmail.com", 2);
        Employee J = new EmplyeeParttime(9, "J", 21, "0313776644", "j@gmail.com", 4);
        Employee K = new EmplyeeParttime(10, "K", 23, "0313778866", "k@gmail.com", 6);
        Employee[] employees = {A, B, C, D, E, F, G, H, J, K};
        //tính trung bình
        long salaryAverage = average(employees);
        System.out.println(salaryAverage);
    }
    public static long average(Employee[] employees){
        long salaryAverage = 0;
        long sum = 0;
        for (int i = 0; i < employees.length; i++) {
            sum += employees[i].getSalary();
        }
        salaryAverage = sum / employees.length;
        return salaryAverage;
    }
    public static void DoNgheoKhi(Employee[] employees, long salaryAverage){
        for (int i = 0; i < employees.length; i++) {
            if(employees[i].getSalary()<salaryAverage){
                System.out.println(employees[i].getName());
            }
        }
    }
    public static void BacLuong(Employee[] employees){
        Arrays.sort(employees);
        for (int i = 0; i < employees.length; i++) {
            System.out.println("bac luong " +  (10 - i) +" : " + employees[i].getName() +" " + employees[i].getSalary());
        }
        }
//    public static long LuongParttime(Employee[] employees){
//        long LuongParttime =0;
//        for (int i = 0; i < employees.length; i++){
//            if (employees[i] instanceof EmployeeParttime){
//                EmployeeParttime employeeParttime = (EmployeeParttime) employees[i];
//                sumOfEmployeeParttime+= employeeParttime.getSalary();
//            }
//        }
//        return sumOfEmployeeParttime;
    }
