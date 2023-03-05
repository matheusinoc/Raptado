package personagem;

public class Protagonista {
    private boolean vivo, longe, stealth, policia;
    private String arma;

    public Protagonista() {
        vivo = true;
        longe = true;
        arma = "nada";
        stealth = true;
        policia = false;
    }

    public boolean isVivo() {
        return vivo;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }

    public boolean isLonge() {
        return longe;
    }

    public void setLonge(boolean longe) {
        this.longe = longe;
    }

    public boolean isStealth() {
        return stealth;
    }

    public void setStealth(boolean stealth) {
        this.stealth = stealth;
    }

    public boolean isPolicia() {
        return policia;
    }

    public void setPolicia(boolean policia) {
        this.policia = policia;
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }
}
