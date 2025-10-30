class Manager extends Empleado{
 public Manager() {
    }



    public Manager(String nombre, String apellido, double SalarioHora, int horasTrabajadas) {
        super(nombre, apellido, SalarioHora, horasTrabajadas);

    }




    @Override
    public String toString() {
        return "Manager{" +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", SalarioHora=" + SalarioHora +
                ", horasTrabajadas=" + horasTrabajadas +
                '}';
    }

    @Override
    public String showInfo(){
        return "Nombre:"+nombre+" Apellido:"+apellido+"Salario por Hora:"+SalarioHora+ "Horas Trabajadas:"+horasTrabajadas;
    }
}
