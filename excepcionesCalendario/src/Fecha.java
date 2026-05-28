import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Fecha {

    private int ano = 0;
    private int mes = 1;
    private int dia = 1;

    public static final int MESES_ANO = 12;

    public static boolean esBisiesto(int ano){
        if((ano % 4 == 0) && (ano % 100 != 0 || ano % 400 == 0)){
            return true;
        }else {
            return false;
        }
    }

    public boolean esBisiesto(){
        if((this.ano % 4 == 0) && (this.ano % 100 != 0 || this.ano % 400 == 0)){
            return true;
        }else {
            return false;
        }
    }

    public Fecha() throws FechaException{ }

    public Fecha(int ano, int mes, int dia) throws FechaException{
        this.ano = ano;
        setMes(mes);
        setDia(dia);

    }

    public Fecha(Fecha fecha){
        /*this.ano = fecha.ano;
        this.mes = fecha.mes;
        this.dia = fecha.dia;*/
        this(fecha.ano, fecha.mes, fecha.dia);
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) throws FechaException{
        if(esMesCorrecto(mes)){
            this.mes = mes;
        }else{
            throw new FechaException("El mes introducido es incorrecto");
        }
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) throws FechaException{
        if(esDiaCorrecto(dia)){
            this.dia = dia;
        }else{
            throw new FechaException("El dia introducido es incorrecto, NO puede ser " + dia + " para el mes " + this.mes + " y el año " + this.ano);
        }
    }

    public void set(int ano, int mes, int dia) throws FechaException{
        this.ano = ano;
        setMes(mes);
        setDia(dia);
    }

    public void set(Fecha fecha){
        set(fecha.ano,fecha.mes,fecha.dia);
    }

    @Override
    public String toString() {
        return this.dia + "/" + this.mes + "/" + this.ano;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Fecha){
            Fecha f = (Fecha) obj;

            if(this.ano == f.ano && this.mes == f.mes && this.dia == f.dia){
                return true;
            }else{
                return false;
            }

        }else{
            return false;
        }
    }

    private boolean esMesCorrecto(int mes){
        if(mes > 0 &&  mes <= 12){
            return true;
        }else{
            return false;
        }
    }

    private boolean esDiaCorrecto(int dia){
        switch (this.mes) {
            case 1, 3, 5, 7, 8, 10, 12:
                if (dia >= 1 && dia <= 31) {
                    return true;
                } else {
                    return false;
                }
            case 4, 6, 9, 11:
                if (dia >= 1 && dia <= 30) {
                    return true;
                } else {
                    return false;
                }
            case 2:
                if (esBisiesto()) {
                    if (dia >= 1 && dia <= 29) {
                        return true;
                    } else {
                        return false;
                    }
                } else {
                    if (dia >= 1 && dia <= 28) {
                        return true;
                    } else {
                        return false;
                    }
                }
            default:
                return false;
        }
    }
}
