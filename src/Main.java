public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Furkan", 2000, 45, 2009);
        System.out.println(employee);
        employee.calculateTax();
        employee.calcBonus();
        employee.calcRaiseSalary();
        employee.calcTotalPayment();

    }
}