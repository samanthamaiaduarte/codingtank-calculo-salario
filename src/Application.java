import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Salario> salarios = new ArrayList<>();

        for(int i = 0; i < 5; i++) {
            System.out.printf("Informe o %dº salario: ", i + 1);
            double bruto = sc.nextDouble();

            salarios.add(new Salario(bruto));
        }

        for(Salario salario : salarios) {
            System.out.println(salario);
        }

        sc.close();
    }
}
