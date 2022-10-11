package trabDoOutroGrupo.src.test.java.trab;
import trabDoOutroGrupo.src.main.java.trab.CentroDistribuicao;


public class Testes {
    public static void main(String args[]){
        normalAditivoOnPoint();
        normalAditivoInPoint();
        normalAditivoOffPoint();
        normalAditivoOutPoint();
        normalGasolinaOnPoint();
        normalGasolinaInPoint();
        normalGasolinaOffPoint();
        normalGasolinaOutPoint();
        normalAlcoolOnPoint();
        normalAlcoolInPoint();
        normalAlcoolOffPoint();
        normalAlcoolOutPoint();
        sobravisoAditivoOnPoint();
        sobravisoAditivoInPoint();
        sobravisoAditivoOffPoint();
        sobravisoAditivoOutPoint();
        sobravisoGasolinaOnPoint();
        sobravisoGasolinaInPoint();
        sobravisoGasolinaOffPoint();
        sobravisoGasolinaOutPoint();
        sobravisoAlcoolOnPoint();
        sobravisoAlcoolInPoint();
        sobravisoAlcoolOffPoint();
        sobravisoAlcoolOutPoint();
    }

    /*public static void quantidadeInvalidaAditivoOffPointMax(){
        try {
            CentroDistribuicao centroDistribuicaoTeste = new CentroDistribuicao(501, 10000, 1250, 1250);
            System.out.println("Sem exceção");
        } catch (IllegalArgumentException e){
            System.out.println(e);
        }
    }
    
    public static void quantidadeInvalidaAditivoInPointMax(){
        try {
            CentroDistribuicao centroDistribuicaoTeste = new CentroDistribuicao(510, 10000, 1250, 1250);
            System.out.println("Sem exceção");
        } catch (IllegalArgumentException e){
            System.out.println(e);
        };
    }
    
    public static void quantidadeInvalidaGasolinaOffPointMax(){
        try {
            CentroDistribuicao centroDistribuicaoTeste = new CentroDistribuicao(500, 10001, 1250, 1250);
            System.out.println("Sem exceção");
        } catch (IllegalArgumentException e){
            System.out.println(e);
        };
    }
    
    public static void quantidadeInvalidaGasolinaInPointMax(){
        try {
            CentroDistribuicao centroDistribuicaoTeste = new CentroDistribuicao(500, 10010, 1250, 1250);
            System.out.println("Sem exceção");
        } catch (IllegalArgumentException e){
            System.out.println(e);
        };
    }
    
    public static void quantidadeInvalidaAlcoolOffPointMax(){
        try {
            CentroDistribuicao centroDistribuicaoTeste = new CentroDistribuicao(500, 10000, 1251, 1251);
            System.out.println("Sem exceção");
        } catch (IllegalArgumentException e){
            System.out.println(e);
        };
    }
    
    public static void quantidadeInvalidaAlcoolInPointMax(){
        try {
            CentroDistribuicao centroDistribuicaoTeste = new CentroDistribuicao(500, 10000, 2000, 2000);
            System.out.println("Sem exceção");
        } catch (IllegalArgumentException e){
            System.out.println(e);
        };
    }
    //endregion

    //region Teste valor MIN
    
    public static void quantidadeInvalidaAditivoOffPointMin(){ // ADITIVO
        try {
            CentroDistribuicao centroDistribuicaoTeste = new CentroDistribuicao(-1, 10000, 1250, 1250);
            System.out.println("Sem exceção");
        } catch (IllegalArgumentException e){
            System.out.println(e);
        };
    }
    
    public static void quantidadeInvalidaAditivoInPointMin(){ // ADITIVO
        try {
            CentroDistribuicao centroDistribuicaoTeste = new CentroDistribuicao(-10, 10000, 1250, 1250);
            System.out.println("Sem exceção");
        } catch (IllegalArgumentException e){
            System.out.println(e);
        };
    }
    
    public static void quantidadeInvalidaGasolinaOffPointMin(){ // GASOLINA
        try {
            CentroDistribuicao centroDistribuicaoTeste = new CentroDistribuicao(500, -1, 1250, 1250);
            System.out.println("Sem exceção");
        } catch (IllegalArgumentException e){
            System.out.println(e);
        };
    }
    
    public static void quantidadeInvalidaGasolinaInPointMin(){ // GASOLINA
        try {
            CentroDistribuicao centroDistribuicaoTeste = new CentroDistribuicao(500, -10, 1250, 1250);
            System.out.println("Sem exceção");
        } catch (IllegalArgumentException e){
            System.out.println(e);
        };
    }
    
    public static void quantidadeInvalidaAlcoolOffPointMin(){ // ALCOOL
        try {
            CentroDistribuicao centroDistribuicaoTeste = new CentroDistribuicao(500, 10000, -1, -1);
            System.out.println("Sem exceção");
        } catch (IllegalArgumentException e){
            System.out.println(e);
        };
    }
    
    public static void quantidadeInvalidaAlcoolInPointMin(){ // ALCOOL
        try {
            CentroDistribuicao centroDistribuicaoTeste = new CentroDistribuicao(500, 10000, -10, -10);
            System.out.println("Sem exceção");
        } catch (IllegalArgumentException e){
            System.out.println(e);
        };
    }
    //endregion

    //region Teste quantidade diferete de alcool
    
    public static void quantidadeDiferenteAlcool(){ // ALCOOL
        try {
            CentroDistribuicao centroDistribuicaoTeste = new CentroDistribuicao(500, 10000, 1000, 1250);
            System.out.println("Sem exceção");
        } catch (IllegalArgumentException e){
            System.out.println(e);
        };
    }*/
    //endregion

    //endregion

    //region Teste SITUAÇÃO válido

    //region Teste valor MAX
    /*public static void quantidadeValidaAditivoOnPointMax(){
        try {
            CentroDistribuicao centroDistribuicaoTeste = new CentroDistribuicao(500, 10000, 1250, 1250);
            System.out.println("Sem exceção");
        } catch (IllegalArgumentException e){
            System.out.println(e);
        };
    }
    
    public static void quantidadeValidaAditivoOutPointMax(){
        try {
            CentroDistribuicao centroDistribuicaoTeste = new CentroDistribuicao(450, 10000, 1250, 1250);
            System.out.println("Sem exceção");
        } catch (IllegalArgumentException e){
            System.out.println(e);
        };
    }
    
    public static void quantidadeValidaGasolinaOnPointMax(){
        try {
            CentroDistribuicao centroDistribuicaoTeste = new CentroDistribuicao(500, 10000, 1250, 1250);
            System.out.println("Sem exceção");
        } catch (IllegalArgumentException e){
            System.out.println(e);
        };
    }
    
    public static void quantidadeValidaGasolinaOutPointMax(){
        try {
            CentroDistribuicao centroDistribuicaoTeste = new CentroDistribuicao(500, 9990, 1250, 1250);
            System.out.println("Sem exceção");
        } catch (IllegalArgumentException e){
            System.out.println(e);
        };
    }
    
    public static void quantidadeValidaAlcoolOnPointMax(){
        try {
            CentroDistribuicao centroDistribuicaoTeste = new CentroDistribuicao(500, 10000, 1250, 1250);
            System.out.println("Sem exceção");
        } catch (IllegalArgumentException e){
            System.out.println(e);
        };
    }
    
    public static void quantidadeValidaAlcoolOutPointMax(){
        try {
            CentroDistribuicao centroDistribuicaoTeste = new CentroDistribuicao(500, 10000, 1000, 1000);  
            System.out.println("Sem exceção");
        } catch (IllegalArgumentException e){
            System.out.println(e);
        };
    }
    //endregion

    //region Teste valor MIN
    
    public static void quantidadeValidaAditivoOnPointMin(){
        try {
            CentroDistribuicao centroDistribuicaoTeste = new CentroDistribuicao(0, 10000, 1250, 1250);
            System.out.println("Sem exceção");
        } catch (IllegalArgumentException e){
            System.out.println(e);
        };
    }
    
    public static void quantidadeValidaAditivoOutPointMin(){
        try {
            CentroDistribuicao centroDistribuicaoTeste = new CentroDistribuicao(10, 10000, 1250, 1250);
        
            System.out.println("Sem exceção");
        } catch (IllegalArgumentException e){
            System.out.println(e);
        };
    }
    
    public static void quantidadeValidaGasolinaOnPointMin(){
        try {
            CentroDistribuicao centroDistribuicaoTeste = new CentroDistribuicao(500, 0, 1250, 1250);
        
            System.out.println("Sem exceção");
        } catch (IllegalArgumentException e){
            System.out.println(e);
        };
    }
    
    public static void quantidadeValidaGasolinaOutPointMin(){
        try {
            CentroDistribuicao centroDistribuicaoTeste = new CentroDistribuicao(500, 10, 1250, 1250);
        
            System.out.println("Sem exceção");
        } catch (IllegalArgumentException e){
            System.out.println(e);
        };
    }
    
    public static void quantidadeValidaAlcoolOnPointMin(){
        try {
            CentroDistribuicao centroDistribuicaoTeste = new CentroDistribuicao(500, 10000, 0, 0);
        
            System.out.println("Sem exceção");
        } catch (IllegalArgumentException e){
            System.out.println(e);
        };
    }
    
    public static void quantidadeValidaAlcoolOutPointMin(){
        try {
            CentroDistribuicao centroDistribuicaoTeste = new CentroDistribuicao(500, 10000, 10, 10);
        
            System.out.println("Sem exceção");
        } catch (IllegalArgumentException e){
            System.out.println(e);
        };
    }*/
    //endregion

    //endregion

    //region NORMAL
    //region Teste SITUAÇÃO NORMAL Aditivo
    
    public static void normalAditivoOnPoint(){
        CentroDistribuicao centroDistribuicao = new CentroDistribuicao(250, 10000, 1250, 1250);
        if (CentroDistribuicao.SITUACAO.NORMAL == centroDistribuicao.getSituacao()) System.out.println("OK");
    }
    
    public static void normalAditivoInPoint(){
        CentroDistribuicao centroDistribuicao = new CentroDistribuicao(300, 10000, 1250, 1250);
        if (CentroDistribuicao.SITUACAO.NORMAL == centroDistribuicao.getSituacao()) System.out.println("OK");
    }
    
    public static void normalAditivoOffPoint(){
      CentroDistribuicao centroDistribuicao = new CentroDistribuicao(249, 10000, 1250, 1250);
        if (CentroDistribuicao.SITUACAO.NORMAL != centroDistribuicao.getSituacao()) System.out.println("OK");
    }
    
    public static void normalAditivoOutPoint(){
      CentroDistribuicao centroDistribuicao = new CentroDistribuicao(200, 10000, 1250, 1250);
        if (CentroDistribuicao.SITUACAO.NORMAL != centroDistribuicao.getSituacao()) System.out.println("OK");
    }
    //endregion

    //region Teste SITUAÇÃO NORMAL Gasolina
    
    public static void normalGasolinaOnPoint(){
      CentroDistribuicao centroDistribuicao = new CentroDistribuicao(500, 5000, 1250, 1250);
        if (CentroDistribuicao.SITUACAO.NORMAL == centroDistribuicao.getSituacao()) System.out.println("OK");
    }
    
    public static void normalGasolinaInPoint(){
      CentroDistribuicao centroDistribuicao = new CentroDistribuicao(500, 6000, 1250, 1250);
        if (CentroDistribuicao.SITUACAO.NORMAL == centroDistribuicao.getSituacao()) System.out.println("OK");
    }
    
    public static void normalGasolinaOffPoint(){
      CentroDistribuicao centroDistribuicao = new CentroDistribuicao(500, 4999, 1250, 1250);
        if (CentroDistribuicao.SITUACAO.NORMAL == centroDistribuicao.getSituacao()) System.out.println("OK");
    }
    
    public static void normalGasolinaOutPoint(){
      CentroDistribuicao centroDistribuicao = new CentroDistribuicao(500, 4000, 1250, 1250);
        if (CentroDistribuicao.SITUACAO.NORMAL == centroDistribuicao.getSituacao()) System.out.println("OK");
    }
    //endregion

    //region Teste SITUAÇÃO NORMAL Alcool
    
    public static void normalAlcoolOnPoint(){
      CentroDistribuicao centroDistribuicao = new CentroDistribuicao(500, 10000, 625, 625);
        if (CentroDistribuicao.SITUACAO.NORMAL == centroDistribuicao.getSituacao()) System.out.println("OK");
    }
    
    public static void normalAlcoolInPoint(){
      CentroDistribuicao centroDistribuicao = new CentroDistribuicao(500, 10000, 1000, 1000);
        if (CentroDistribuicao.SITUACAO.NORMAL == centroDistribuicao.getSituacao()) System.out.println("OK");
    }
    
    public static void normalAlcoolOffPoint(){
      CentroDistribuicao centroDistribuicao = new CentroDistribuicao(500, 10000, 624, 624);
        if (CentroDistribuicao.SITUACAO.NORMAL != centroDistribuicao.getSituacao()) System.out.println("OK");
    }
    
    public static void normalAlcoolOutPoint(){
      CentroDistribuicao centroDistribuicao = new CentroDistribuicao(500, 10000, 600, 600);
        if (CentroDistribuicao.SITUACAO.NORMAL != centroDistribuicao.getSituacao()) System.out.println("OK");
    }
    //endregion
    //endregion

    //region SOBRAVISO
    //region Teste SITUAÇÃO SOBRAVISO Aditivo
    
    public static void sobravisoAditivoOnPoint(){
      CentroDistribuicao centroDistribuicao = new CentroDistribuicao(500, 5000, 1250, 1250);
        if (CentroDistribuicao.SITUACAO.SOBRAVISO == centroDistribuicao.getSituacao()) System.out.println("OK");
    }
    
    public static void sobravisoAditivoInPoint(){
      CentroDistribuicao centroDistribuicao = new CentroDistribuicao(500, 4000, 1250, 1250);
        if (CentroDistribuicao.SITUACAO.SOBRAVISO == centroDistribuicao.getSituacao()) System.out.println("OK");
    }
    
    public static void sobravisoAditivoOffPoint(){
      CentroDistribuicao centroDistribuicao = new CentroDistribuicao(500, 4999, 1250, 1250);
        if (CentroDistribuicao.SITUACAO.SOBRAVISO != centroDistribuicao.getSituacao()) System.out.println("OK");
    }
    
    public static void sobravisoAditivoOutPoint(){
      CentroDistribuicao centroDistribuicao = new CentroDistribuicao(500, 7000, 1250, 1250);
        if (CentroDistribuicao.SITUACAO.SOBRAVISO != centroDistribuicao.getSituacao()) System.out.println("OK");
    }
    //endregion

    //region Teste SITUAÇÃO SOBRAVISO Gasolina
    
    public static void sobravisoGasolinaOnPoint(){
      CentroDistribuicao centroDistribuicao = new CentroDistribuicao(500, 5000, 1250, 1250);
        if (CentroDistribuicao.SITUACAO.SOBRAVISO == centroDistribuicao.getSituacao()) System.out.println("OK");
    }
    
    public static void sobravisoGasolinaInPoint(){
      CentroDistribuicao centroDistribuicao = new CentroDistribuicao(500, 6000, 1250, 1250);
        if (CentroDistribuicao.SITUACAO.SOBRAVISO == centroDistribuicao.getSituacao()) System.out.println("OK");
    }
    
    public static void sobravisoGasolinaOffPoint(){
      CentroDistribuicao centroDistribuicao = new CentroDistribuicao(500, 4999, 1250, 1250);
        if (CentroDistribuicao.SITUACAO.SOBRAVISO != centroDistribuicao.getSituacao()) System.out.println("OK");
    }
    
    public static void sobravisoGasolinaOutPoint(){
      CentroDistribuicao centroDistribuicao = new CentroDistribuicao(500, 4000, 1250, 1250);
        if (CentroDistribuicao.SITUACAO.SOBRAVISO != centroDistribuicao.getSituacao()) System.out.println("OK");
    }
    //endregion

    //region Teste SITUAÇÃO SOBRAVISO Alcool
    
    public static void sobravisoAlcoolOnPoint(){
      CentroDistribuicao centroDistribuicao = new CentroDistribuicao(500, 10000, 625, 625);
        if (CentroDistribuicao.SITUACAO.SOBRAVISO == centroDistribuicao.getSituacao()) System.out.println("OK");
    }
    
    public static void sobravisoAlcoolInPoint(){
      CentroDistribuicao centroDistribuicao = new CentroDistribuicao(500, 10000, 500, 500);
        if (CentroDistribuicao.SITUACAO.SOBRAVISO == centroDistribuicao.getSituacao()) System.out.println("OK");
    }
    
    public static void sobravisoAlcoolOffPoint(){
      CentroDistribuicao centroDistribuicao = new CentroDistribuicao(500, 10000, 624, 624);
        if (CentroDistribuicao.SITUACAO.SOBRAVISO != centroDistribuicao.getSituacao()) System.out.println("OK");
    }
    
    public static void sobravisoAlcoolOutPoint(){
      CentroDistribuicao centroDistribuicao = new CentroDistribuicao(500, 10000, 700, 700);
        if (CentroDistribuicao.SITUACAO.SOBRAVISO != centroDistribuicao.getSituacao()) System.out.println("OK");
    }
    //endregion
    //endregion

    //region EMERGÊNCIA
    //region Teste SITUAÇÃO EMERGENCIA Aditivo
    
    public static void emergenciaAditivoOnPoint(){
      CentroDistribuicao centroDistribuicao = new CentroDistribuicao(125, 10000, 1250, 1250);
        if (CentroDistribuicao.SITUACAO.SOBRAVISO == centroDistribuicao.getSituacao()) System.out.println("OK");
    }
    
    public static void emergenciaAditivoInPoint(){
      CentroDistribuicao centroDistribuicao = new CentroDistribuicao(100, 10000, 1250, 1250);
        if (CentroDistribuicao.SITUACAO.SOBRAVISO == centroDistribuicao.getSituacao()) System.out.println("OK");
    }
    
    public static void emergenciaAditivoOffPoint(){
        CentroDistribuicao centroDistribuicao = new CentroDistribuicao(124, 10000, 1250, 1250);
        if (CentroDistribuicao.SITUACAO.SOBRAVISO != centroDistribuicao.getSituacao()) System.out.println("OK");
    }
    
    public static void semergenciaAditivoOutPoint(){
        CentroDistribuicao centroDistribuicao = new CentroDistribuicao(200, 10000, 1250, 1250);
        if (CentroDistribuicao.SITUACAO.SOBRAVISO != centroDistribuicao.getSituacao()) System.out.println("OK");
    }
    //endregion

    //region Teste SITUAÇÃO EMERGENCIA Gasolina
    
    public static void emergenciaGasolinaOnPoint(){
        CentroDistribuicao centroDistribuicao = new CentroDistribuicao(500, 2500, 1250, 1250);
        if (CentroDistribuicao.SITUACAO.SOBRAVISO == centroDistribuicao.getSituacao()) System.out.println("OK");
    }
    
    public static void emergenciaGasolinaInPoint(){
        CentroDistribuicao centroDistribuicao = new CentroDistribuicao(500, 2000, 1250, 1250);
        if (CentroDistribuicao.SITUACAO.SOBRAVISO == centroDistribuicao.getSituacao()) System.out.println("OK");
    }
    
    public static void emergenciaGasolinaOffPoint(){
        CentroDistribuicao centroDistribuicao = new CentroDistribuicao(500, 2501, 1250, 1250);
        if (CentroDistribuicao.SITUACAO.SOBRAVISO != centroDistribuicao.getSituacao()) System.out.println("OK");
    }
    
    public static void emergenciaGasolinaOutPoint(){
        CentroDistribuicao centroDistribuicao = new CentroDistribuicao(500, 5500, 1250, 1250);
        if (CentroDistribuicao.SITUACAO.SOBRAVISO != centroDistribuicao.getSituacao()) System.out.println("OK");
    }
    //endregion

    //region Teste SITUAÇÃO EMERGENCIA Alcool
    
    public static void emergenciaAlcoolOnPoint(){
        CentroDistribuicao centroDistribuicao = new CentroDistribuicao(500, 10000, 312, 312);
        if (CentroDistribuicao.SITUACAO.SOBRAVISO == centroDistribuicao.getSituacao()) System.out.println("OK");
    }
    
    public static void emergenciaAlcoolInPoint(){
        CentroDistribuicao centroDistribuicao = new CentroDistribuicao(500, 10000, 300, 300);
        if (CentroDistribuicao.SITUACAO.SOBRAVISO == centroDistribuicao.getSituacao()) System.out.println("OK");
    }
    
    public static void semergenciaAlcoolOffPoint(){
        CentroDistribuicao centroDistribuicao = new CentroDistribuicao(500, 10000, 311, 311);
        if (CentroDistribuicao.SITUACAO.SOBRAVISO != centroDistribuicao.getSituacao()) System.out.println("OK");
    }
    
    public static void emergenciaAlcoolOutPoint(){
        CentroDistribuicao centroDistribuicao = new CentroDistribuicao(500, 10000, 400, 400);
        if (CentroDistribuicao.SITUACAO.SOBRAVISO != centroDistribuicao.getSituacao()) System.out.println("OK");
    }

}
