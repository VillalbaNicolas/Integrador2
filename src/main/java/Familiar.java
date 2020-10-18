public class Familiar implements Autos{

    private final int basico = 245000;
    private Opcional Opcional;
    private static  final String TIPO = "Familiar";

    public Familiar (Opcional Opcional){
        this.Opcional = Opcional;
    }

    public String getTipo(){
        return TIPO;
    }

    public String mensaje() {
        String mensaje = "";
        mensaje = Opcional.mensaje();
        return mensaje;
    }

    public int pago_final() {
        int sumatoria = 0;
        sumatoria = this.basico + Opcional.getTotal_opcional();
        return sumatoria;
    }

}
