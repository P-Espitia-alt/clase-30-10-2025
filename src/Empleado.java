abstract class Empleado {
    protected String nombre;
    protected String apellido;
    protected double SalarioHora;
    protected int horasTrabajadas;


    public Empleado() {
    }

    public Empleado(String nombre, String apellido, double SalarioHora, int horasTrabajadas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.SalarioHora = SalarioHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getSalario() {
        return SalarioHora;
    }

    public void setSalario(double salario) {
        SalarioHora = salario;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }



    public void horasTrabajadas(){
        System.out.println("180 horas trabajadas");
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", SalarioHora=" + SalarioHora +
                ", horasTrabajadas=" + horasTrabajadas +
                '}';
    }

    public String showInfo(){
        return "Nombre:"+nombre+" Apellido:"+apellido+"Salario por Hora:"+SalarioHora+ "Horas Trabajadas:"+horasTrabajadas;
    }


}
