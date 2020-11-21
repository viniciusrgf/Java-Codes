package school.cesar.poo.av1.ex2.leitura;

import java.util.Date;
import school.cesar.poo.av1.ex2.dispositivo.Dispositivo;

public abstract class Leitura {
	private Dispositivo dispositivo;

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
	public Date timestamp;
}
