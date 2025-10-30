class Director extends Empleado{

    public Director() {
    }

    public Director(String nombre, String apellido, double SalarioHora, int horasTrabajadas) {
        super(nombre, apellido, SalarioHora, horasTrabajadas);

    }



    @Override
    public String toString() {
        return "Director{" +
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
