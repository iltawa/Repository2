public class Cerchio extends Forma {

    private double raggio;
    
    public Cerchio(double raggio) {
        this.raggio = raggio;
    }

    @Override
    public double area() {
        return raggio * raggio * Math.PI;  // ciao ciao ciao !!s
    }

    public double getRaggio() {
        return raggio;
    }

    @Override
    public String toString() {
        return "Cerchio [raggio=" + raggio + "]"; ///eccoci    // modifica, fai il merge tu !!
    }

    @Override
    public double perimetro() {
        return extracted();
    }

    public void setRaggio(double raggio) {
        this.raggio = raggio;
    }

    private double extracted() {
        return 2*raggio*Math.PI;
    }
}
