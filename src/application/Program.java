package application;
import java.text.ParseException;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;

import entities.ContratoHora;
import entities.Departamento;
import entities.Trabalhador;
import workerLevel.Nivel;

public class Program {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat d1 = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter department name:");
        String nomeDepartamento = sc.nextLine();

        System.out.println("Enter worker data:");

        System.out.print("Name: ");
        String nomeTrabalhador = sc.nextLine();

        System.out.print("Level: ");
        String nivel = sc.nextLine();


        System.out.print("Base salary: ");
        double salarioBase = sc.nextDouble();



        Trabalhador trab1 = new Trabalhador(nomeTrabalhador, Nivel.valueOf(nivel),salarioBase, new Departamento(nomeDepartamento));

        System.out.print("How many contracts to this worker? ");
        int numContratos = sc.nextInt();

        for(int i = 1; i<=numContratos;i++){
            System.out.println("Enter the contract #" +  i + " data:");
            System.out.print("Date: (DD/MM/YYYY): ");
            Date dataContrato = d1.parse(sc.next());
            System.out.print("Value per hour: ");
            double valorPorHora = sc.nextDouble();
            System.out.print("Duration (hours): ");
            int horas = sc.nextInt();

            ContratoHora contrato = new ContratoHora(dataContrato,valorPorHora,horas);
            trab1.addContratos(contrato);

        }


        System.out.println();
        System.out.print("Enter month and year to calculate income(MM/YYYY): ");
        String anoEMes = sc.next();
        int mes = Integer.parseInt( anoEMes.substring(0,2));
        int ano = Integer.parseInt(anoEMes.substring(3));

        System.out.println("Name: " + trab1.getName());
        System.out.println("Departament: " + trab1.getDepartamento().getName());
        System.out.println("Income: " + anoEMes + String.format(" %.2f%n ",trab1.renda(mes,ano)));







    sc.close();
    }
}
