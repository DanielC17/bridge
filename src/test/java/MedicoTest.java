import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedicoTest {

    @Test
    void deveRetornarSalarioMedicoComGraduacao() {
        Escolaridade escolaridade = new Graduacao();
        Medico medico = new Medico(4000.0f);
        medico.setEscolaridade(escolaridade);
        medico.setNumPlantao(3);
        assertEquals(12000.0f, medico.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioMedicoComPosGraduacao() {
        Escolaridade escolaridade = new PosGraduacao();
        Medico medico = new Medico(4000.0f);
        medico.setEscolaridade(escolaridade);
        medico.setNumPlantao(3);
        assertEquals(13200f, medico.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioMedicoComMestrado() {
        Escolaridade escolaridade = new Mestrado();
        Medico medico = new Medico(4000.0f);
        medico.setEscolaridade(escolaridade);
        medico.setNumPlantao(3);
        assertEquals(14400.0f, medico.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioMedicoComDoutorado() {
        Escolaridade escolaridade = new Doutorado();
        Medico medico = new Medico(4000.0f);
        medico.setEscolaridade(escolaridade);
        medico.setNumPlantao(4);
        assertEquals(20800.0f, medico.calcularSalario(), 0.01f);
    }
}
