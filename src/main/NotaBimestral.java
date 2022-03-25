package main;

public class NotaBimestral{

    int nota;

    public NotaBimestral(){
    }

    public String nota(int nota){
        if(nota < 0 || nota > 10) {
            return "Nota Inválida";
        }
        this.nota = nota;
        return "Nota Válida";
    }
}
