public class Medico extends CargoHospital {

    private int numPlantao;

    public Medico(float salarioBase) {
        super(salarioBase);
    }

    public void setNumPlantao(int numPlantao) {
        this.numPlantao = numPlantao;
    }

    public float calcularSalario() {
        return this.salarioBase * this.numPlantao * (1 + this.escolaridade.percentualAumento());
    }
}
