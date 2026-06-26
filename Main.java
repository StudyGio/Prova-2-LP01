import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        String resultado = "";

        ConsultaAgendada p1 = new ConsultaAgendada(
                14, 30, 0,
                26, 6, 2026,
                "Giovanna Camacho",
                "Dr. Tuller"
        );

        resultado += "===== DADOS DE P1 =====\n";
        resultado += p1.mostrarConsulta() + "\n\n";

        ConsultaAgendada p2 = new ConsultaAgendada();

        resultado += "===== DADOS DE P2 =====\n";
        resultado += p2.mostrarConsulta() + "\n\n";

        p1.setData();
        p1.setHora();
        p1.setNomePaciente();
        p1.setNomeMedico();

        resultado += "===== P1 APÓS ALTERAÇÕES =====\n";
        resultado += p1.mostrarConsulta() + "\n\n";

        resultado += "Quantidade final de consultas: " + p1.getAmostra();


        System.out.println(resultado);

    
        try {
            FileWriter arquivo = new FileWriter("resultado_consultas.txt");

            arquivo.write(resultado);

            arquivo.close();

            System.out.println("\nArquivo resultado_consultas.txt criado com sucesso!");

        } catch (IOException e) {

            System.out.println("Erro ao gravar o arquivo.");

            e.printStackTrace();

        }

    }
}
