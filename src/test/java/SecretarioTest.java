import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class SecretarioTest {
   @Test
    void deveRetornarSalarioSecretarioComGraduacao() {
        Escolaridade escolaridade = new Graduacao();
        Secretaria secretaria = new Secretaria(2000.0f);
        secretaria.setEscolaridade(escolaridade);
        assertEquals(2000.0f, secretaria.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioSecretarioComPosGraduacao() {
        Escolaridade escolaridade = new PosGraduacao();
        Secretaria secretaria = new Secretaria(2000.0f);
        secretaria.setEscolaridade(escolaridade);
        assertEquals(2000.0f, secretaria.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioSecretarioComMestrado() {
        Escolaridade escolaridade = new Mestrado();
        Secretaria secretaria = new Secretaria(2000.0f);
        secretaria.setEscolaridade(escolaridade);
        assertEquals(2000.0f, secretaria.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioSecretarioComDoutorado() {
        Escolaridade escolaridade = new Doutorado();
        Secretaria secretaria = new Secretaria(2000.0f);
        secretaria.setEscolaridade(escolaridade);
        assertEquals(2000.0f, secretaria.calcularSalario(), 0.01f);
    }
}