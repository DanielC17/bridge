import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EnfermeiroTest  {

    @Test
    void deveRetornarSalarioEnfermeiroComGraduacao() {
        Escolaridade escolaridade = new Graduacao();
        Enfermeiro enfermeiro = new Enfermeiro(2000.0f);
        enfermeiro.setEscolaridade(escolaridade);
        enfermeiro.setNumPlantao(2);
        assertEquals(4000.0f, enfermeiro.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioEnfermeiroComPosGraduacao() {
        Escolaridade escolaridade = new PosGraduacao();
        Enfermeiro enfermeiro = new Enfermeiro(2000.0f);
        enfermeiro.setEscolaridade(escolaridade);
        enfermeiro.setNumPlantao(2);
        assertEquals(4400.0f, enfermeiro.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioEnfermeiroComMestrado() {
        Escolaridade escolaridade = new Mestrado();
        Enfermeiro enfermeiro = new Enfermeiro(2000.0f);
        enfermeiro.setEscolaridade(escolaridade);
        enfermeiro.setNumPlantao(2);
        assertEquals(4800.0f, enfermeiro.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioEnfermeiroComDoutorado() {
        Escolaridade escolaridade = new Doutorado();
        Enfermeiro enfermeiro = new Enfermeiro(2000.0f);
        enfermeiro.setEscolaridade(escolaridade);
        enfermeiro.setNumPlantao(2);
        assertEquals(5200.0f, enfermeiro.calcularSalario(), 0.01f);
    }
}
