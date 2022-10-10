package trabDoOutroGrupo.src.test.java.trab;

import trabDoOutroGrupo.src.main.java.trab.CentroDistribuicao;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidacaoSituacaoTest {

    CentroDistribuicao centroDistribuicao;

    //region Teste SITUAÇÃO inválido

    //region Teste valor MAX
    //ADITIVO   ALCOOL   GASOLINA
    // x>500    x>1250    X>10000
    @Test
    void quantidadeInvalidaAditivoOffPointMax(){
        assertThrows(IllegalArgumentException.class, () -> {
            CentroDistribuicao centroDistribuicaoTeste = new CentroDistribuicao(501, 10000, 1250, 1250);
        });
    }
    @Test
    void quantidadeInvalidaAditivoInPointMax(){
        assertThrows(IllegalArgumentException.class, () -> {
            CentroDistribuicao centroDistribuicaoTeste = new CentroDistribuicao(510, 10000, 1250, 1250);
        });
    }
    @Test
    void quantidadeInvalidaGasolinaOffPointMax(){
        assertThrows(IllegalArgumentException.class, () -> {
            CentroDistribuicao centroDistribuicaoTeste = new CentroDistribuicao(500, 10001, 1250, 1250);
        });
    }
    @Test
    void quantidadeInvalidaGasolinaInPointMax(){
        assertThrows(IllegalArgumentException.class, () -> {
            CentroDistribuicao centroDistribuicaoTeste = new CentroDistribuicao(500, 10010, 1250, 1250);
        });
    }
    @Test
    void quantidadeInvalidaAlcoolOffPointMax(){
        assertThrows(IllegalArgumentException.class, () -> {
            CentroDistribuicao centroDistribuicaoTeste = new CentroDistribuicao(500, 10000, 1251, 1251);
        });
    }
    @Test
    void quantidadeInvalidaAlcoolInPointMax(){
        assertThrows(IllegalArgumentException.class, () -> {
            CentroDistribuicao centroDistribuicaoTeste = new CentroDistribuicao(500, 10000, 2000, 2000);
        });
    }
    //endregion

    //region Teste valor MIN
    @Test
    void quantidadeInvalidaAditivoOffPointMin(){ // ADITIVO
        assertThrows(IllegalArgumentException.class, () -> {
            CentroDistribuicao centroDistribuicaoTeste = new CentroDistribuicao(-1, 10000, 1250, 1250);
        });
    }
    @Test
    void quantidadeInvalidaAditivoInPointMin(){ // ADITIVO
        assertThrows(IllegalArgumentException.class, () -> {
            CentroDistribuicao centroDistribuicaoTeste = new CentroDistribuicao(-10, 10000, 1250, 1250);
        });
    }
    @Test
    void quantidadeInvalidaGasolinaOffPointMin(){ // GASOLINA
        assertThrows(IllegalArgumentException.class, () -> {
            CentroDistribuicao centroDistribuicaoTeste = new CentroDistribuicao(500, -1, 1250, 1250);
        });
    }
    @Test
    void quantidadeInvalidaGasolinaInPointMin(){ // GASOLINA
        assertThrows(IllegalArgumentException.class, () -> {
            CentroDistribuicao centroDistribuicaoTeste = new CentroDistribuicao(500, -10, 1250, 1250);
        });
    }
    @Test
    void quantidadeInvalidaAlcoolOffPointMin(){ // ALCOOL
        assertThrows(IllegalArgumentException.class, () -> {
            CentroDistribuicao centroDistribuicaoTeste = new CentroDistribuicao(500, 10000, -1, -1);
        });
    }
    @Test
    void quantidadeInvalidaAlcoolInPointMin(){ // ALCOOL
        assertThrows(IllegalArgumentException.class, () -> {
            CentroDistribuicao centroDistribuicaoTeste = new CentroDistribuicao(500, 10000, -10, -10);
        });
    }
    //endregion

    //region Teste quantidade diferete de alcool
    @Test
    void quantidadeDiferenteAlcool(){ // ALCOOL
        assertThrows(IllegalArgumentException.class, () -> {
            CentroDistribuicao centroDistribuicaoTeste = new CentroDistribuicao(500, 10000, 1000, 1250);
        });
    }
    //endregion

    //endregion

    //region Teste SITUAÇÃO válido

    //region Teste valor MAX
    @Test
    void quantidadeValidaAditivoOnPointMax(){
        assertDoesNotThrow(() -> {
            CentroDistribuicao centroDistribuicaoTeste = new CentroDistribuicao(500, 10000, 1250, 1250);
        });
    }
    @Test
    void quantidadeValidaAditivoOutPointMax(){
        assertDoesNotThrow(() -> {
            CentroDistribuicao centroDistribuicaoTeste = new CentroDistribuicao(450, 10000, 1250, 1250);
        });
    }
    @Test
    void quantidadeValidaGasolinaOnPointMax(){
        assertDoesNotThrow(() -> {
            CentroDistribuicao centroDistribuicaoTeste = new CentroDistribuicao(500, 10000, 1250, 1250);
        });
    }
    @Test
    void quantidadeValidaGasolinaOutPointMax(){
        assertDoesNotThrow(() -> {
            CentroDistribuicao centroDistribuicaoTeste = new CentroDistribuicao(500, 9990, 1250, 1250);
        });
    }
    @Test
    void quantidadeValidaAlcoolOnPointMax(){
        assertDoesNotThrow(() -> {
            CentroDistribuicao centroDistribuicaoTeste = new CentroDistribuicao(500, 10000, 1250, 1250);
        });
    }
    @Test
    void quantidadeValidaAlcoolOutPointMax(){
        assertDoesNotThrow(() -> {
            CentroDistribuicao centroDistribuicaoTeste = new CentroDistribuicao(500, 10000, 1000, 1000);
        });
    }
    //endregion

    //region Teste valor MIN
    @Test
    void quantidadeValidaAditivoOnPointMin(){
        assertDoesNotThrow(() -> {
            CentroDistribuicao centroDistribuicaoTeste = new CentroDistribuicao(0, 10000, 1250, 1250);
        });
    }
    @Test
    void quantidadeValidaAditivoOutPointMin(){
        assertDoesNotThrow(() -> {
            CentroDistribuicao centroDistribuicaoTeste = new CentroDistribuicao(10, 10000, 1250, 1250);
        });
    }
    @Test
    void quantidadeValidaGasolinaOnPointMin(){
        assertDoesNotThrow(() -> {
            CentroDistribuicao centroDistribuicaoTeste = new CentroDistribuicao(500, 0, 1250, 1250);
        });
    }
    @Test
    void quantidadeValidaGasolinaOutPointMin(){
        assertDoesNotThrow(() -> {
            CentroDistribuicao centroDistribuicaoTeste = new CentroDistribuicao(500, 10, 1250, 1250);
        });
    }
    @Test
    void quantidadeValidaAlcoolOnPointMin(){
        assertDoesNotThrow(() -> {
            CentroDistribuicao centroDistribuicaoTeste = new CentroDistribuicao(500, 10000, 0, 0);
        });
    }
    @Test
    void quantidadeValidaAlcoolOutPointMin(){
        assertDoesNotThrow(() -> {
            CentroDistribuicao centroDistribuicaoTeste = new CentroDistribuicao(500, 10000, 10, 10);
        });
    }
    //endregion

    //endregion

    //region NORMAL
    //region Teste SITUAÇÃO NORMAL Aditivo
    @Test
    void normalAditivoOnPoint(){
        centroDistribuicao = new CentroDistribuicao(250, 10000, 1250, 1250);
        Assertions.assertEquals(CentroDistribuicao.SITUACAO.NORMAL, centroDistribuicao.getSituacao());
    }
    @Test
    void normalAditivoInPoint(){
        centroDistribuicao = new CentroDistribuicao(300, 10000, 1250, 1250);
        Assertions.assertEquals(CentroDistribuicao.SITUACAO.NORMAL, centroDistribuicao.getSituacao());
    }
    @Test
    void normalAditivoOffPoint(){
        centroDistribuicao = new CentroDistribuicao(249, 10000, 1250, 1250);
        Assertions.assertNotEquals(CentroDistribuicao.SITUACAO.NORMAL, centroDistribuicao.getSituacao());
    }
    @Test
    void normalAditivoOutPoint(){
        centroDistribuicao = new CentroDistribuicao(200, 10000, 1250, 1250);
        Assertions.assertNotEquals(CentroDistribuicao.SITUACAO.NORMAL, centroDistribuicao.getSituacao());
    }
    //endregion

    //region Teste SITUAÇÃO NORMAL Gasolina
    @Test
    void normalGasolinaOnPoint(){
        centroDistribuicao = new CentroDistribuicao(500, 5000, 1250, 1250);
        Assertions.assertEquals(CentroDistribuicao.SITUACAO.NORMAL, centroDistribuicao.getSituacao());
    }
    @Test
    void normalGasolinaInPoint(){
        centroDistribuicao = new CentroDistribuicao(500, 6000, 1250, 1250);
        Assertions.assertEquals(CentroDistribuicao.SITUACAO.NORMAL, centroDistribuicao.getSituacao());
    }
    @Test
    void normalGasolinaOffPoint(){
        centroDistribuicao = new CentroDistribuicao(500, 4999, 1250, 1250);
        Assertions.assertNotEquals(CentroDistribuicao.SITUACAO.NORMAL, centroDistribuicao.getSituacao());
    }
    @Test
    void normalGasolinaOutPoint(){
        centroDistribuicao = new CentroDistribuicao(500, 4000, 1250, 1250);
        Assertions.assertNotEquals(CentroDistribuicao.SITUACAO.NORMAL, centroDistribuicao.getSituacao());
    }
    //endregion

    //region Teste SITUAÇÃO NORMAL Alcool
    @Test
    void normalAlcoolOnPoint(){
        centroDistribuicao = new CentroDistribuicao(500, 10000, 625, 625);
        Assertions.assertEquals(CentroDistribuicao.SITUACAO.NORMAL, centroDistribuicao.getSituacao());
    }
    @Test
    void normalAlcoolInPoint(){
        centroDistribuicao = new CentroDistribuicao(500, 10000, 1000, 1000);
        Assertions.assertEquals(CentroDistribuicao.SITUACAO.NORMAL, centroDistribuicao.getSituacao());
    }
    @Test
    void normalAlcoolOffPoint(){
        centroDistribuicao = new CentroDistribuicao(500, 10000, 624, 624);
        Assertions.assertNotEquals(CentroDistribuicao.SITUACAO.NORMAL, centroDistribuicao.getSituacao());
    }
    @Test
    void normalAlcoolOutPoint(){
        centroDistribuicao = new CentroDistribuicao(500, 10000, 600, 600);
        Assertions.assertNotEquals(CentroDistribuicao.SITUACAO.NORMAL, centroDistribuicao.getSituacao());
    }
    //endregion
    //endregion

    //region SOBRAVISO
    //region Teste SITUAÇÃO SOBRAVISO Aditivo
    @Test
    void sobravisoAditivoOnPoint(){
        centroDistribuicao = new CentroDistribuicao(500, 5000, 1250, 1250);
        Assertions.assertEquals(CentroDistribuicao.SITUACAO.SOBRAVISO, centroDistribuicao.getSituacao());
    }
    @Test
    void sobravisoAditivoInPoint(){
        centroDistribuicao = new CentroDistribuicao(500, 4000, 1250, 1250);
        Assertions.assertEquals(CentroDistribuicao.SITUACAO.SOBRAVISO, centroDistribuicao.getSituacao());
    }
    @Test
    void sobravisoAditivoOffPoint(){
        centroDistribuicao = new CentroDistribuicao(500, 4999, 1250, 1250);
        Assertions.assertNotEquals(CentroDistribuicao.SITUACAO.SOBRAVISO, centroDistribuicao.getSituacao());
    }
    @Test
    void sobravisoAditivoOutPoint(){
        centroDistribuicao = new CentroDistribuicao(500, 7000, 1250, 1250);
        Assertions.assertNotEquals(CentroDistribuicao.SITUACAO.SOBRAVISO, centroDistribuicao.getSituacao());
    }
    //endregion

    //region Teste SITUAÇÃO SOBRAVISO Gasolina
    @Test
    void sobravisoGasolinaOnPoint(){
        centroDistribuicao = new CentroDistribuicao(500, 5000, 1250, 1250);
        Assertions.assertEquals(CentroDistribuicao.SITUACAO.SOBRAVISO, centroDistribuicao.getSituacao());
    }
    @Test
    void sobravisoGasolinaInPoint(){
        centroDistribuicao = new CentroDistribuicao(500, 6000, 1250, 1250);
        Assertions.assertEquals(CentroDistribuicao.SITUACAO.SOBRAVISO, centroDistribuicao.getSituacao());
    }
    @Test
    void sobravisoGasolinaOffPoint(){
        centroDistribuicao = new CentroDistribuicao(500, 4999, 1250, 1250);
        Assertions.assertNotEquals(CentroDistribuicao.SITUACAO.SOBRAVISO, centroDistribuicao.getSituacao());
    }
    @Test
    void sobravisoGasolinaOutPoint(){
        centroDistribuicao = new CentroDistribuicao(500, 4000, 1250, 1250);
        Assertions.assertNotEquals(CentroDistribuicao.SITUACAO.SOBRAVISO, centroDistribuicao.getSituacao());
    }
    //endregion

    //region Teste SITUAÇÃO SOBRAVISO Alcool
    @Test
    void sobravisoAlcoolOnPoint(){
        centroDistribuicao = new CentroDistribuicao(500, 10000, 625, 625);
        Assertions.assertEquals(CentroDistribuicao.SITUACAO.SOBRAVISO, centroDistribuicao.getSituacao());
    }
    @Test
    void sobravisoAlcoolInPoint(){
        centroDistribuicao = new CentroDistribuicao(500, 10000, 500, 500);
        Assertions.assertEquals(CentroDistribuicao.SITUACAO.SOBRAVISO, centroDistribuicao.getSituacao());
    }
    @Test
    void sobravisoAlcoolOffPoint(){
        centroDistribuicao = new CentroDistribuicao(500, 10000, 624, 624);
        Assertions.assertNotEquals(CentroDistribuicao.SITUACAO.SOBRAVISO, centroDistribuicao.getSituacao());
    }
    @Test
    void sobravisoAlcoolOutPoint(){
        centroDistribuicao = new CentroDistribuicao(500, 10000, 700, 700);
        Assertions.assertNotEquals(CentroDistribuicao.SITUACAO.SOBRAVISO, centroDistribuicao.getSituacao());
    }
    //endregion
    //endregion

    //region EMERGÊNCIA
    //region Teste SITUAÇÃO EMERGENCIA Aditivo
    @Test
    void emergenciaAditivoOnPoint(){
        centroDistribuicao = new CentroDistribuicao(125, 10000, 1250, 1250);
        Assertions.assertEquals(CentroDistribuicao.SITUACAO.EMERGENCIA, centroDistribuicao.getSituacao());
    }
    @Test
    void emergenciaAditivoInPoint(){
        centroDistribuicao = new CentroDistribuicao(100, 10000, 1250, 1250);
        Assertions.assertEquals(CentroDistribuicao.SITUACAO.EMERGENCIA, centroDistribuicao.getSituacao());
    }
    @Test
    void emergenciaAditivoOffPoint(){
        centroDistribuicao = new CentroDistribuicao(124, 10000, 1250, 1250);
        Assertions.assertNotEquals(CentroDistribuicao.SITUACAO.EMERGENCIA, centroDistribuicao.getSituacao());
    }
    @Test
    void semergenciaAditivoOutPoint(){
        centroDistribuicao = new CentroDistribuicao(200, 10000, 1250, 1250);
        Assertions.assertNotEquals(CentroDistribuicao.SITUACAO.EMERGENCIA, centroDistribuicao.getSituacao());
    }
    //endregion

    //region Teste SITUAÇÃO EMERGENCIA Gasolina
    @Test
    void emergenciaGasolinaOnPoint(){
        centroDistribuicao = new CentroDistribuicao(500, 2500, 1250, 1250);
        Assertions.assertEquals(CentroDistribuicao.SITUACAO.EMERGENCIA, centroDistribuicao.getSituacao());
    }
    @Test
    void emergenciaGasolinaInPoint(){
        centroDistribuicao = new CentroDistribuicao(500, 2000, 1250, 1250);
        Assertions.assertEquals(CentroDistribuicao.SITUACAO.EMERGENCIA, centroDistribuicao.getSituacao());
    }
    @Test
    void emergenciaGasolinaOffPoint(){
        centroDistribuicao = new CentroDistribuicao(500, 2501, 1250, 1250);
        Assertions.assertNotEquals(CentroDistribuicao.SITUACAO.EMERGENCIA, centroDistribuicao.getSituacao());
    }
    @Test
    void emergenciaGasolinaOutPoint(){
        centroDistribuicao = new CentroDistribuicao(500, 5500, 1250, 1250);
        Assertions.assertNotEquals(CentroDistribuicao.SITUACAO.EMERGENCIA, centroDistribuicao.getSituacao());
    }
    //endregion

    //region Teste SITUAÇÃO EMERGENCIA Alcool
    @Test
    void emergenciaAlcoolOnPoint(){
        centroDistribuicao = new CentroDistribuicao(500, 10000, 312, 312);
        Assertions.assertEquals(CentroDistribuicao.SITUACAO.EMERGENCIA, centroDistribuicao.getSituacao());
    }
    @Test
    void emergenciaAlcoolInPoint(){
        centroDistribuicao = new CentroDistribuicao(500, 10000, 300, 300);
        Assertions.assertEquals(CentroDistribuicao.SITUACAO.EMERGENCIA, centroDistribuicao.getSituacao());
    }
    @Test
    void semergenciaAlcoolOffPoint(){
        centroDistribuicao = new CentroDistribuicao(500, 10000, 311, 311);
        Assertions.assertNotEquals(CentroDistribuicao.SITUACAO.EMERGENCIA, centroDistribuicao.getSituacao());
    }
    @Test
    void emergenciaAlcoolOutPoint(){
        centroDistribuicao = new CentroDistribuicao(500, 10000, 400, 400);
        Assertions.assertNotEquals(CentroDistribuicao.SITUACAO.EMERGENCIA, centroDistribuicao.getSituacao());
    }
    //endregion
    //endregion

}