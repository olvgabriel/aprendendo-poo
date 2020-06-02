package project;

public class Principal {
    public static void main(final String[] args) {
        Paciente p1 = new Paciente(66, 1.74);
        Paciente p2 = new Paciente(78, 1.92);
        Paciente p3 = new Paciente(104, 1.54);
        System.out.println("--------------------------");
        System.out.println("IMC do Paciente 1: "+p1.calcularIMC()+" Diagnóstico do Paciente 1: ");
        p1.diagnostico();
        System.out.println("--------------------------");
        System.out.println("IMC do Paciente 2: "+p2.calcularIMC()+" Diagnóstico do Paciente 2: ");
        p2.diagnostico();
        System.out.println("--------------------------");
        System.out.println("IMC do Paciente 3: "+p3.calcularIMC()+" Diagnóstico do Paciente 3: ");
        p3.diagnostico();
    }
}