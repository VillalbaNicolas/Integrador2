public class Opcional  implements Autos{

    /*****************************************************************************************
     * Decidi hacer todos en la misma clase ya que no tenian muchos atributos por separado
     **************************************************************************************/
    private boolean frenos;
    private boolean techo;
    private boolean aire;
    private boolean airbag;
    private boolean ruedas;


    public Opcional(){

    }

    public boolean getFrenos() { return this.frenos; }
    public boolean getTecho() { return this.techo; }
    public boolean getAirbag() { return this.airbag; }
    public boolean getRuedas() { return this.ruedas; }


    public void add_Frenos(String Freno) {

        if (Freno == "si")
            this.frenos=true;
        else
            this.frenos=false;

    }

    public void add_Techo(String Techo) {
        if (Techo == "si")
            this.techo=true;
        else
            this.techo=false;
    }

    public void add_Aire(String Aire) {
        if (Aire == "si")
            this.aire = true;
        else
            this.aire = false;
    }

    public void add_Airbag(String Airbag) {
        if (Airbag == "si")
            this.airbag = true;
        else
            this.airbag =false;
    }

    public void add_Ruedas(String Ruedas) {
        if (Ruedas == "si")
            this.ruedas = true;
        else
            this.ruedas = false;
    }


    public int getTotal_opcional() {
        int sumatoria = 0;
        if (this.ruedas)
            sumatoria += 12000;
        else {}
        if (this.frenos)
            sumatoria += 14000;
        else{}
        if (this.airbag)
            sumatoria += 7000;
        else{}
        if (this.aire)
            sumatoria += 20000;
        else{}
        if (this.techo)
            sumatoria += 12000;
        else{}

        return sumatoria;
    }


    public int pago_final() {
        return 0;
    }

    public String getTipo() {
        return null;
    }

    public String mensaje() {
        String mensaje = "";
        if (this.ruedas)
            mensaje += "\nLL ";
        else {}
        if (this.airbag)
            mensaje += "\nAB";
        else{}
        if (this.aire)
            mensaje += "\nAA";
        else{}
        if (this.techo)
            mensaje += "\nTC";
        else{}
        if(this.frenos)
            mensaje += "\nABS";

        return mensaje;

    }
}
