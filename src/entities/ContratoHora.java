package entities;

import java.util.Date;
import java.util.Calendar;
public class ContratoHora {
    private Date date;
    private Double valorPorHora;
    private Integer hora;

    public ContratoHora(){

    }

    public ContratoHora(Date date, Double valorPorHora, Integer hora){
        this.date = date;
        this.valorPorHora = valorPorHora;
        this.hora = hora;
    }

    public Date getDate(){
        return date;
    }

    public void setDate(Date data){
        this.date = data;
    }


    public Double getValorPorHora(){
        return valorPorHora;
    }

    public void setValorPorHora(Double valorPorHora){
        this.valorPorHora = valorPorHora;
    }

    public Integer getHora(){
        return hora;
    }


    public void setHora(Integer hora){
        this.hora = hora;
    }


    public Double valorTotal(){
        return valorPorHora *= hora;
    }


}
