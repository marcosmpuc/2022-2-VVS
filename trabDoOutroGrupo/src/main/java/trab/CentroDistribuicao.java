package trabDoOutroGrupo.src.main.java.trab;

public class CentroDistribuicao {
    public enum SITUACAO {
        NORMAL, SOBRAVISO, EMERGENCIA
    }

    public enum TIPOPOSTO {
        COMUM, ESTRATEGICO
    }

    public static final double MAX_ADITIVO = 500;
    public static final double MAX_ALCOOL = 2500;
    public static final double MAX_GASOLINA = 10000;

    private double tAditivo;
    private double tAlcool2;
    private double tAlcool1;
    private double tGasolina;
    private SITUACAO situacao;

    public CentroDistribuicao(double tAditivo, double tGasolina, double tAlcool1, double tAlcool2)
            throws IllegalArgumentException {
        if ((tAditivo <= 0) || (tGasolina <= 0) || (tAlcool1 <= 0) || (tAlcool2 <= 0)){
            throw new IllegalArgumentException("Valor negativo ou zero não suportado");
        } else if (tAlcool1 != tAlcool2) {
            throw new IllegalArgumentException("Os valores de Alcool devem ser iguais");
        } else {
            this.tAditivo = tAditivo;
            this.tGasolina = tGasolina;
            this.tAlcool1 = tAlcool1;
            this.tAlcool2 = tAlcool2;
            this.situacao = defineSituacao();
        }
    }

    public SITUACAO defineSituacao() {
        if ((tGasolina >= (MAX_GASOLINA * 0.25)) && (tGasolina <= (MAX_GASOLINA * 0.5))) {
            if ((tAlcool1 + tAlcool2 >= (MAX_ALCOOL * 0.25)) && (tAlcool1 + tAlcool2 <= (MAX_ALCOOL * 0.5))) {
                if ((tAditivo >= (MAX_ADITIVO * 0.25)) && (tAditivo <= (MAX_ADITIVO * 0.5))) {
                    situacao = SITUACAO.SOBRAVISO;
                    return situacao;
                }
            }
        }
        if (tGasolina < (MAX_GASOLINA * 0.25)) {
            if (tAlcool1 + tAlcool2 < (MAX_ALCOOL * 0.25)) {
                if (tAditivo < (MAX_ADITIVO * 0.25)) {
                    situacao = SITUACAO.EMERGENCIA;
                    return situacao;
                }
            }
        }
        situacao = SITUACAO.NORMAL;
        return situacao;

    }

    public SITUACAO getSituacao() {
        return situacao;
    }

    public double getGasolina() {
        return tGasolina;
    }

    public double getAditivo() {
        return tAditivo;
    }

    public double getAlcool1() {
        return tAlcool1;
    }

    public double getAlcool2() {
        return tAlcool2;
    }

    public int recebeAditivo(int qtdade) {
        if (getAditivo() < qtdade * 0.05) {
            return 0;
        } else

            return (int) (qtdade * 0.05);

    }

    public int recebeGasolina(int qtdade) {
        if (getGasolina() < qtdade * 0.70) {
            return 0;
        } else

            return (int) (qtdade * 0.70);

    }

    public int recebeAlcool(int qtdade) {
        // comentar validação. redundância com o construtor
        if (getAlcool1() != getAlcool2()) {
            return 0;
        }
        double alcool = 0;
        alcool = getAlcool1() + getAlcool2();
        if (alcool < qtdade * 0.25) {
            return 0;
        } else
            return (int) (qtdade * 0.25);

    }

    public int[] encomendaCombustivel(int qtdade, TIPOPOSTO tipoPosto) {
        // int qtdade = total de gasolina | mistura
        int[] gasosa = { 0, 0, 0 }; // | gasolina | aditivo | alcool |

        if (tipoPosto == TIPOPOSTO.COMUM) { // tipo de posto
            if (getSituacao() == SITUACAO.NORMAL) {// situações diversas
                gasosa[0] = (int) (qtdade * 0.70); // valores de gasolina aditivo e alcool encomendados.
                tGasolina = tGasolina - (qtdade * 0.70);
                gasosa[1] = (int) (qtdade * 0.05);
                tAditivo = tAditivo - (qtdade * 0.05);
                gasosa[2] = (int) (qtdade * 0.25);
                tAlcool1 = tAlcool1 - ((qtdade * 0.25) / 2);
                tAlcool2 = tAlcool2 - ((qtdade * 0.25) / 2);
                return gasosa;
            }
            if (getSituacao() == SITUACAO.SOBRAVISO) { // 50% off
                gasosa[0] = (int) ((qtdade * 0.70) / 2); // valores de gasolina aditivo e alcool encomendados.
                tGasolina = tGasolina - ((qtdade * 0.70) / 2);
                gasosa[1] = (int) ((qtdade * 0.05) / 2);
                tAditivo = tAditivo - ((qtdade * 0.05) / 2);
                gasosa[2] = (int) ((qtdade * 0.25) / 2);
                tAlcool1 = tAlcool1 - ((qtdade * 0.25) / 4);
                tAlcool2 = tAlcool2 - ((qtdade * 0.25) / 4);
                return gasosa;
            }
            if (getSituacao() == SITUACAO.EMERGENCIA) {
                return gasosa;
            }
        } else if (tipoPosto == TIPOPOSTO.ESTRATEGICO) {
            if (getSituacao() == SITUACAO.NORMAL) {// situações diversas
                gasosa[0] = (int) (qtdade * 0.70); // valores de gasolina aditivo e alcool encomendados.
                tGasolina = tGasolina - (qtdade * 0.70);
                gasosa[1] = (int) (qtdade * 0.05);
                tAditivo = tAditivo - (qtdade * 0.05);
                gasosa[2] = (int) (qtdade * 0.25);
                tAlcool1 = tAlcool1 - ((qtdade * 0.25) / 2);
                tAlcool2 = tAlcool2 - ((qtdade * 0.25) / 2);
                return gasosa;
            }
            if (getSituacao() == SITUACAO.SOBRAVISO) { // 50% off
                gasosa[0] = (int) ((qtdade * 0.70)); // valores de gasolina aditivo e alcool encomendados.
                tGasolina = tGasolina - ((qtdade * 0.70));
                gasosa[1] = (int) ((qtdade * 0.05));
                tAditivo = tAditivo - ((qtdade * 0.05));
                gasosa[2] = (int) ((qtdade * 0.25));
                tAlcool1 = tAlcool1 - ((qtdade * 0.25) / 2);
                tAlcool2 = tAlcool2 - ((qtdade * 0.25) / 2);
                return gasosa;
            }
            if (getSituacao() == SITUACAO.EMERGENCIA) {
                gasosa[0] = (int) ((qtdade * 0.70) / 2); // valores de gasolina aditivo e alcool encomendados.
                tGasolina = tGasolina - ((qtdade * 0.70) / 2);
                gasosa[1] = (int) ((qtdade * 0.05) / 2);
                tAditivo = tAditivo - ((qtdade * 0.05) / 2);
                gasosa[2] = (int) ((qtdade * 0.25) / 2);
                tAlcool1 = tAlcool1 - ((qtdade * 0.25) / 4);
                tAlcool2 = tAlcool2 - ((qtdade * 0.25) / 4);
                return gasosa;
            }
        }
        return gasosa;

    }

    @Override
    public String toString() {
        return "Aditivo = " + tAditivo + "\nGasolina = " + tGasolina + "\nAlcool1 = " + tAlcool1 + "\nAlcool2 = "
                + tAlcool2 + "\nSituação do posto = " + situacao;
    }
}
