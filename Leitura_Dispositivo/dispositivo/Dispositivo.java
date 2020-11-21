package school.cesar.poo.av1.ex2.dispositivo;

public class Dispositivo {
String macadress;
double lat;
double lng;
String descriçao;

    public String getMacadress() {
        return macadress;
    }

    public void setMacadress(String macadress) {
        this.macadress = macadress;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLng() {
        return lng;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }

    public String getDescriçao() {
        return descriçao;
    }

    public void setDescriçao(String descriçao) {
        this.descriçao = descriçao;
    }
}
