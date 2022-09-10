package server;

public class Methods {

    //EJercicio 2
    public String calcular(double preace1, double preace2, double preace3, double preace4) {
        double producto = preace1 * preace2 * preace3 * preace4;
        double suma = preace1 + preace2 + preace3 + preace4;
        double promedio = suma / 4;

        return "Producto: " + producto + "\n" + "Suma Total: " + suma + "\n" + "El Promedio es: " + promedio;
    }


    //EJercicio 3
    public String suma(int num1, int num2) {
        if (num1 > num2) {
            int x = num1;
            num1 = num2;
            num2 = x;
        } else {

        }
        int sumtotal = 0;
        for (int i = num1; i < num2; i++) {

            sumtotal = sumtotal + i;
        }
        sumtotal = sumtotal - num1;
        return "Suma Total: " + sumtotal;

    }


    //EJercicio 4
    public String acomodar(int cant, int num1, int num2, int num3, int num4, int num5) {

        int array[] = new int[cant];
        array[0] = num1;
        array[1] = num2;
        array[2] = num3;
        array[3] = num4;
        array[4] = num5;

        int aux = 0;
        for (int i = 0; i < 5; i++) {

            for (int x = 0; x < cant - 1; x++) {

                if (array[x] > array[x + 1]) {
                    aux = array[x];
                    array[x] = array[x + 1];
                    array[x + 1] = aux;
                }
            }
        }
        return "Ordenados de menor a mañor: " + array[0] + ", " + array[1] + ", " + array[2] + ", " + array[3] + ", " + array[4];
    }
}
