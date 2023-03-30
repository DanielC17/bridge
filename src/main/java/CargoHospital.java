public abstract class CargoHospital {

    protected Escolaridade escolaridade;

    protected float salarioBase;

    public CargoHospital(float salarioBase){
        this.salarioBase = salarioBase;
    }

    public void setEscolaridade(Escolaridade escolaridade){
        this.escolaridade = escolaridade;
    }

    public void setSalarioBase(float salarioBase){
        this.salarioBase = salarioBase;
    }

    public abstract float calcularSalario();
}
