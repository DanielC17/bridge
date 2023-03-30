public class Secretaria extends CargoHospital{
    public Secretaria(float salarioBase){
        super(salarioBase);
    }

    public float calcularSalario(){
        return this.salarioBase;
    }
}
