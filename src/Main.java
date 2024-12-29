import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat formatador = new DecimalFormat("#.#");
        boolean continuar = true;

        while (continuar) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("'C' - Converter para Celsius");
            System.out.println("'F' - Converter para Fahrenheit");
            System.out.println("'K' - Converter para Kelvin");
            System.out.println("'S' - Sair do programa");
            String opcao = input.next();

            if (opcao.equalsIgnoreCase("C")) {
                System.out.print("Digite a temperatura em Fahrenheit: ");
                float fahrenheit = input.nextFloat();
                float celsius = (fahrenheit - 32) * 5 / 9;
                System.out.println("A temperatura em Celsius é: " + formatador.format(celsius) + "°C");
            } else if (opcao.equalsIgnoreCase("F")) {
                System.out.print("Digite a temperatura em Celsius: ");
                float celsius = input.nextFloat();
                float fahrenheit = (celsius * 9 / 5) + 32;
                System.out.println("A temperatura em Fahrenheit é: " + formatador.format(fahrenheit) + "°F");
            } else if (opcao.equalsIgnoreCase("K")) {
                System.out.println("Escolha a conversão:");
                System.out.println("'C' - Converter de Celsius para Kelvin");
                System.out.println("'F' - Converter de Fahrenheit para Kelvin");
                String subOpcao = input.next();

                if (subOpcao.equalsIgnoreCase("C")) {
                    System.out.print("Digite a temperatura em Celsius: ");
                    float celsius = input.nextFloat();
                    float kelvin = celsius + 273.15f;
                    System.out.println("A temperatura em Kelvin é: " + formatador.format(kelvin) + "K");
                } else if (subOpcao.equalsIgnoreCase("F")) {
                    System.out.print("Digite a temperatura em Fahrenheit: ");
                    float fahrenheit = input.nextFloat();
                    float kelvin = (fahrenheit - 32) * 5 / 9 + 273.15f;
                    System.out.println("A temperatura em Kelvin é: " + formatador.format(kelvin) + "K");
                } else {
                    System.out.println("Opção inválida. Por favor, tente novamente.");
                }
            } else if (opcao.equalsIgnoreCase("S")) {
                System.out.println("Encerrando o programa. Até logo!");
                continuar = false;
            } else {
                System.out.println("Opção inválida. Por favor, tente novamente.");
            }
        }

        input.close();
    }
}
