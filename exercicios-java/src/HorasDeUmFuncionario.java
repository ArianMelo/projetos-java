public class HorasDeUmFuncionario {

    public static void main(String[] args) {
    // requisitas o valor do salário
    int salario = 1400;
    // requisitar o valor das horas trabalhadas por mês
    int horas = 180;
    // montar a formula (salário mensal/ horas mensais) e gerar um valor resultante.
    double salarioHora = (salario/horas);
    // Criar uma texto exibindo o "O valor do salario em horas do funcionarios é $valorResutante por hora.
        System.out.println("O salário por hora do funcionário é: R$"+ salarioHora);
    }

}
