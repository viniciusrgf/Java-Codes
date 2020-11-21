package school.cesar.poo.av1.ex2.leitura;

import java.util.Date;
import school.cesar.poo.av1.ex2.dispositivo.Dispositivo;

public class LeituraPressao extends Leitura {
public double valor;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Dispositivo getDispositivo() {
        return dispositivo;
    }

    public void setDispositivo(Dispositivo dispositivo) {
        this.dispositivo = dispositivo;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
}
