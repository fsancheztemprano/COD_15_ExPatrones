package e3_builder;
/**
 * @author fsancheztemprano
 */
public class Main {
    public static void main(String[] args) {
        
        /*
        creamos un obj EmployeeBuilder cuyo metodo createEmployee() 
        retornara un Employee construido
        
        Usamos su constructor que 
        nos pide solo los atributos obligatorios
        */
        Employee gerente = new EmployeeBuilder("Luis", 1)
                .setLastName("Vasquez")//Establecemos los atributos opcionales
                .setBirthDate(10)
                .setBirthMonth(9)
                .setBirthYear(1987)
                .createEmployee();//retornamos el ob Employee
        /*
        imprimimos por consola el obj Employee gerente para 
        verificar su creacion correctamente
        */
        System.out.println(gerente.toString());


    }
}