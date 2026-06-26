import java.util.Scanner;

public class ConsultaAgendada {
    private Data data;
    private Hora hora;
    private String nomePaciente;
    private static int quantidade = 0;
    private String nomeMedico;

    Scanner scan = new Scanner(System.in);

    public ConsultaAgendada() {
        setData();
        setHora();
        setNomePaciente();
        setNomeMedico();
        quantidade++;
    }

    public ConsultaAgendada(int h, int mi, int s, int d, int m, int a, String p, String med) {
        this.hora = new Hora(h, mi, s);
        this.data = new Data(d, m, a);
        this.nomePaciente = p;
        this.nomeMedico = med;
        quantidade++;
    }

    public ConsultaAgendada(Data d, Hora h, String p, String m) {
        this.data = d;
        this.hora = h;
        this.nomePaciente = p;
        this.nomeMedico = m;
        quantidade++;
    }

    public void setData(int a, int b, int c) {
        this.data = new Data(a, b, c);
    }

    public void setData() {
        System.out.print("Digite o dia: ");
        int d = scan.nextInt();

        System.out.print("Digite o mes: ");
        int m = scan.nextInt();

        System.out.print("Digite o ano: ");
        int a = scan.nextInt();
        scan.nextLine();

        this.data = new Data(d, m, a);
    }

    public void setHora(int a, int b, int c) {
        this.hora = new Hora(a, b, c);
    }

    public void setHora() {
        System.out.print("Digite a hora: ");
        int h = scan.nextInt();

        System.out.print("Digite os minutos: ");
        int mi = scan.nextInt();

        System.out.print("Digite os segundos: ");
        int s = scan.nextInt();
        scan.nextLine();

        this.hora = new Hora(h, mi, s);
    }

    public void setNomePaciente(String p) {
        this.nomePaciente = p;
    }

    public void setNomePaciente() {
        System.out.print("Digite o nome do paciente: ");
        this.nomePaciente = scan.nextLine();
    }

    public void setNomeMedico(String m) {
        this.nomeMedico = m;
    }

    public void setNomeMedico() {
        System.out.print("Digite o nome do medico: ");
        this.nomeMedico = scan.nextLine();
    }

    public int getAmostra() {
        return quantidade;
    }

    public String getData() {
        return data.mostrarData();
    }

    public String getHora() {
        return hora.mostrarHora();
    }

    public String getNomePaciente() {
        return nomePaciente;
    }

    public String getNomeMedico() {
        return nomeMedico;
    }

    public String mostrarConsulta() {
        return "Data: " + getData() +
                "\nHora: " + getHora() +
                "\nPaciente: " + getNomePaciente() +
                "\nMedico: " + getNomeMedico();
    }
}