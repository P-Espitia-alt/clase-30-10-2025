public class Main {
    public static void main(String[] args) {

        Director D1= new Director("Wade", "Watts", 100000, 180 );
        Manager M1= new Manager("Sam", "Flynn", 50000, 180);
        //String nombre, String apellido, double SalarioHora, int horasTrabajadas, double sueldoMes


        System.out.println(D1.nombre);
        System.out.println(D1.apellido);
        System.out.println(D1.SalarioHora);
        System.out.println(D1.horasTrabajadas);



        System.out.println(M1.nombre);
        System.out.println(M1.apellido);
        System.out.println(M1.SalarioHora);
        System.out.println(M1.horasTrabajadas);
    }
}


//clase abs Employee
//metodos abs calcSalary y displayInfo
//hijas Manager y Programmer
//metodos correspondeintes para calcular el salario y mostrar la informacion de cada puesto