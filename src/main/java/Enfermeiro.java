public class Enfermeiro extends CargoHospital {

    private int numPlantao;
    public Enfermeiro(float salarioBase){
        super(salarioBase);
    }
    public void setNumPlantao(int numPlantao) {
        this.numPlantao = numPlantao;
    }

    public float calcularSalario() {
        return this.salarioBase * this.numPlantao * (1 + this.escolaridade.percentualAumento());
    }

}
