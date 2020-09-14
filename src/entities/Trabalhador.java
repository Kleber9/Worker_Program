package entities;

import workerLevel.Nivel;
import java.util.List;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;
public class Trabalhador {
    private String name;
    private Nivel nivel;
    private Double salarioBase;


    private Departamento departamento;
    private List<ContratoHora> contrato = new ArrayList<>();

    public Trabalhador(){

    }
    public Trabalhador(String name, Nivel nivel, Double salarioBase, Departamento departamento ){
        this.name = name;
        this.nivel = nivel;
        this.salarioBase = salarioBase;

        this.departamento = departamento;

    }


    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }


    public Nivel getNivel(){
        return nivel;
    }
    public void setNivel(Nivel nivel){
        this.nivel = nivel;
    }

    public Double getSalarioBase(){
        return salarioBase;
    }
    public void setSalarioBase(Double salarioBase){
        this.salarioBase = salarioBase;
    }



    public Departamento getDepartamento(){
        return departamento;
    }
    public void setDepartamento(Departamento departamento){
        this.departamento = departamento;
    }

    public List<ContratoHora> getContrato(){
        return contrato;
    }


    //Implementando funções

    public void addContratos(ContratoHora contratos){
        contrato.add(contratos);
    }

    public void removeContratos(ContratoHora contratos){
        contrato.remove(contratos);
    }

    public double renda(int mes,int ano){
        double sum = salarioBase;
        Calendar calendario = Calendar.getInstance();

        for(ContratoHora x : contrato){
            calendario.setTime(x.getDate());
            int x_mes = calendario.get(Calendar.MONTH);
            int x_ano = 1 + calendario.get(Calendar.YEAR);
            if(mes == x_mes && ano == x_ano){
                sum += x.valorTotal();

            }

        }

        return sum;
    }



    }





