public class CalculoIMC {

    public static void main(String[] args) {
        
        // Entrada de dados
        String nome = IO.readln("Informe o seu nome: ");
        
        String generoInput = IO.readln("Informe seu gênero (M: masculino, F: feminino, N: prefiro não informar): ");
        char genero = generoInput.charAt(0);
        
        String alturaInput = IO.readln("Informe sua altura em metros (ex: 1.75): ");
        double altura = Double.parseDouble(alturaInput);
        
        String pesoInput = IO.readln("Informe seu peso em quilos (ex: 70.5): ");
        double peso = Double.parseDouble(pesoInput);
        
        // Cálculo do IMC
        double imc = peso / (altura * altura);
        
        // Variável para armazenar a classificação
        String classificacao = "";
        
        // SWITCH para verificar o gênero
        switch (genero) {
            
            // Caso Masculino
            case 'M':
                // IFs obrigatórios dentro do case para classificação Masculino
                if (imc >= 40) {
                    classificacao = "Obesidade Mórbida";
                } else if (imc >= 30) {
                    classificacao = "Obesidade Moderada";
                } else if (imc >= 25) {
                    classificacao = "Obesidade Leve";
                } else if (imc >= 20) {
                    classificacao = "Normal";
                } else {
                    classificacao = "Abaixo do Normal";
                }
                break;
            
            // Caso Feminino ou N (não informar) - usa os valores da coluna Feminino
            case 'F':
            case 'N':
                // IFs obrigatórios dentro do case para classificação Feminino/N
                if (imc >= 39) {
                    classificacao = "Obesidade Mórbida";
                } else if (imc >= 29) {
                    classificacao = "Obesidade Moderada";
                } else if (imc >= 24) {
                    classificacao = "Obesidade Leve";
                } else if (imc >= 19) {
                    classificacao = "Normal";
                } else {
                    classificacao = "Abaixo do Normal";
                }
                break;
            
            // Caso padrão (gênero inválido)
            default:
                // IFs para classificação (mesma lógica Feminino)
                if (imc >= 39) {
                    classificacao = "Obesidade Mórbida";
                } else if (imc >= 29) {
                    classificacao = "Obesidade Moderada";
                } else if (imc >= 24) {
                    classificacao = "Obesidade Leve";
                } else if (imc >= 19) {
                    classificacao = "Normal";
                } else {
                    classificacao = "Abaixo do Normal";
                }
                break;
        }
        
        // Exibição do resultado
        System.out.println("Nome: " + nome);
        System.out.println("Gênero: " + genero);
        System.out.printf("IMC: %.1f\n", imc);
        System.out.println("Classificação: " + classificacao);
        
        // Mensagem final
        System.out.println("Atitus Educação - A tabela fornecida é apenas para fins de estudo e não possui validação científica");
    }
}
