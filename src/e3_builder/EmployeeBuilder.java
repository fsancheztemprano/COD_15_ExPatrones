package e3_builder;
/**
 * @author fsancheztemprano
 */
public class EmployeeBuilder {
    
   private String lastName;
   private String middleName;
   private String firstName;
   private long id;
   private int birthYear;
   private int birthMonth;
   private int birthDate;
   private int hireYear;
   private int hireMonth;
   private int hireDate;

    public EmployeeBuilder(String firstName, long id) {
        this.firstName = firstName;
        this.id = id;
    }

    public EmployeeBuilder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public EmployeeBuilder setMiddleName(String middleName) {
        this.middleName = middleName;
        return this;
    }

    public EmployeeBuilder setBirthYear(int birthYear) {
        this.birthYear = birthYear;
        return this;
    }

    public EmployeeBuilder setBirthMonth(int birthMonth) {
        this.birthMonth = birthMonth;
        return this;
    }

    public EmployeeBuilder setBirthDate(int birthDate) {
        this.birthDate = birthDate;
        return this;
    }

    public EmployeeBuilder setHireYear(int hireYear) {
        this.hireYear = hireYear;
        return this;
    }

    public EmployeeBuilder setHireMonth(int hireMonth) {
        this.hireMonth = hireMonth;
        return this;
    }

    public EmployeeBuilder setHireDate(int hireDate) {
        this.hireDate = hireDate;
        return this;
    }
    
    public Employee createEmployee(){
        return new Employee(lastName, middleName, firstName, id, birthYear, birthMonth, birthDate, hireYear, hireMonth, hireDate);
    }
   
}
