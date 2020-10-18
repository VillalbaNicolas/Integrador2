/*
Una fábrica de automóviles produce uno de sus modelos en tres variantes, llamadas sedán, coupé y familiar.
Cada una tiene un precio de venta básico sin opcionales. A su vez, a cada variante se le pueden agregar opciones como techo corredizo,
aire acondicionado, sistema de frenos ABS, airbag y llantas de aleación. Cada uno de estos opcionales tiene un precio que suma al básico.
En este caso, cada auto vendrá caracterizado por su variante y podrá tener ninguno, uno o más opcionales.

Asumiendo los siguientes costos:

•          Básico sedán          230.000

•          Básico familiar        245.000

•          Básico coupé          270.000

•          Techo corredizo (TC)        12.000

•          Aire acondicionado (AA)  20.000

•          Sistemas de frenos ABS (ABS)    14.000

•          Airbag (AB)   7.000

•          Llantas de aleación (LL)   12.000

1)Diseñar una solución que permita calcular el costo final de un automóvil.

2) Realizar un diseño de base de datos en MySql para almacenar los datos de la solución


 */

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Opcional opc = new Opcional();
        opc.add_Ruedas("si");
        opc.add_Aire("si");
        opc.add_Frenos("si");
        opc.add_Airbag("si");
        opc.add_Techo("si");

        Opcional opc2 = new Opcional();
        opc2.add_Airbag("si");
        opc2.add_Frenos("si");
        opc2.add_Techo("si");


        Opcional opc3 = new Opcional();
        opc3.add_Frenos("si");
        opc3.add_Airbag("si");

        Sedan sed1 = new Sedan(opc);
        Familiar fam1 = new Familiar(opc2);
        Coupe cou1 = new Coupe(opc3);

        ArrayList<Autos> vendidos = new ArrayList<Autos>();
        vendidos.add(sed1);
        vendidos.add(fam1);
        vendidos.add(cou1);

        for (int i = 0; i < vendidos.size();i++){


            System.out.println(vendidos.get(i).pago_final() + "  " + vendidos.get(i).getTipo() + "  " + vendidos.get(i).mensaje());
        }

    }

}


