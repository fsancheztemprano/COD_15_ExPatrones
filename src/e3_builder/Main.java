package e3_builder;
/**
 * @author fsancheztemprano
 */
public class Main {
    public static void main(String[] args) {
        Employee gerente = new EmployeeBuilder("Luis", 1)
                .setLastName("Vasquez")
                .setBirthDate(10)
                .setBirthMonth(9)
                .setBirthYear(1987)
                .createEmployee();
        System.out.println(gerente.toString());


    }
}