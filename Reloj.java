public class Reloj {
    private int horas;
    private int minutos;
    private int segundos;
    public Reloj() {
        this.horas = 12;
        this.minutos = 0;
        this.segundos = 0;
    }
    public Reloj(int horas, int minutos, int segundos) {
        setHoras(horas);
        setMinutos(minutos);
        setSegundos(segundos);
    }
    public Reloj(int segundosDesdeMedianoche) {
        setReloj(segundosDesdeMedianoche);
    }
    public void setReloj(int segundosDesdeMedianoche) {
        segundosDesdeMedianoche = ((segundosDesdeMedianoche % 86400) + 86400) % 86400;
        this.horas = segundosDesdeMedianoche / 3600;
        this.minutos = (segundosDesdeMedianoche % 3600) / 60;
        this.segundos = segundosDesdeMedianoche % 60;
    }
    public int getHoras() {
        return horas;
    }
    public int getMinutos() {
        return minutos;
    }
    public int getSegundos() {
        return segundos;
    }
    public void setHoras(int horas) {
        if (horas >= 0 && horas <= 23) {
            this.horas = horas;
        } 
    }
    public void setMinutos(int minutos) {
        if (minutos >= 0 && minutos <= 59) {
            this.minutos = minutos;
        }
    }
     public void setSegundos(int segundos) {
        if (segundos >= 0 && segundos <= 59) {
            this.segundos = segundos;
        }
    }
    public void tick() {
        segundos++;
        if (segundos > 59) {
            segundos = 0;
            minutos++;
            if (minutos > 59) {
                minutos = 0;
                horas++;
                if (horas > 23) {
                    horas = 0;
                }
            }
        }
    }
    public void tickDecrement() {
        segundos--;
        if (segundos < 0) {
            segundos = 59;
            minutos--;
            if (minutos < 0){
                minutos = 59;
                horas--;
                if (horas < 0){
                    horas = 23;
                }
            }
        }
    }
    public void addReloj(Reloj ot) {
        int totalSegundos = this.toSegundos() + ot.toSegundos();
        setReloj(totalSegundos);
    }
    public int restaReloj(Reloj ot) {
        return this.toSegundos() - ot.toSegundos();
    }
    private int toSegundos() {
        return horas * 3600 + minutos * 60 + segundos;
    }
    @Override
    public String toString() {
        return String.format("[%02d:%02d:%02d]", horas, minutos, segundos);
    }
}
