public class Salario {
    private Double salarioBruto;
    private Double descontoINSS;
    private Double descontoIRRF;
    private Double salarioFinal;

    public Salario(Double salarioBruto) {
        this.salarioBruto = salarioBruto;

        this.descontoINSS = calcularINSS();
        this.descontoIRRF = calcularIRRF();

        this.salarioFinal = salarioBruto - (descontoINSS + descontoIRRF);
    }

    private Double calcularINSS() {
        double aliqINSS = salarioBruto < 1212 ? 0.075 : salarioBruto < 2427.35 ? 0.09 : salarioBruto < 3641.03 ? 0.12 : 0.14;
        return salarioBruto * aliqINSS;
    }

    private Double calcularIRRF() {
        double aliqIRRF = salarioBruto < 1903.99 ? 0 : salarioBruto < 2826.66 ? 0.075 : salarioBruto < 3751.06 ? 0.15 : salarioBruto < 4664.68 ? 0.225 : 0.275;
        return salarioBruto * aliqIRRF;
    }

    @Override
    public String toString() {
        return "Salário Bruto: " + String.format("%.2f", salarioBruto) + " - INSS: " + String.format("%.2f", descontoINSS) + " - IRPF: " + String.format("%.2f", descontoIRRF) + " - Salario Líquido: " + String.format("%.2f", salarioFinal);
    }
}
