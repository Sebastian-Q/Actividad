package client;

import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class ProdcClient {
    public static void main(String[] args ) throws MalformedURLException, XmlRpcException{
        XmlRpcClientConfigImpl config = new XmlRpcClientConfigImpl();
        config.setServerURL(new URL("http://localhost:1300"));
        XmlRpcClient client = new XmlRpcClient();
        client.setConfig(config);

        Scanner scaner= new Scanner(System.in);

        int respuesta;
        double preace1, preace2, preace3, preace4;
        int num1, num2, num3, num4, num5;


        do{
            System.out.println("Seleccionar una Opción");
            System.out.println("1.-Ejercicio 02 \n2.-Ejercicio 03 \n3.-Ejercico 04");
            int caso= scaner.nextInt();
            switch (caso){
                case 1:
                    System.out.println("Introducir Costos");
                    System.out.println("Costo 1");
                    preace1 = scaner.nextDouble();
                    System.out.println("Costo 2");
                    preace2 = scaner.nextDouble();
                    System.out.println("Costo 3");
                    preace3 = scaner.nextDouble();
                    System.out.println("Costo 4");
                    preace4 = scaner.nextDouble();

                    Object[] info2 ={preace1, preace2, preace3, preace4};
                    String response2 = (String) client.execute("Methods.calcular", info2);
                    System.out.println(response2);
                    break;
                case 2:
                    System.out.println("Introducir 1er numero");
                    num1 =scaner.nextInt();
                    System.out.println("Introducir 2do numero");
                    num2 =scaner.nextInt();

                    Object[] info3 ={num1, num2};
                    String response3 = (String) client.execute("Methods.suma", info3);
                    System.out.println(response3);
                    break;
                case 3:
                    int cant=5;
                    System.out.println("Introducir el 1er Numero");
                    num1 = scaner.nextInt();
                    System.out.println("Introducir el 2do Numero");
                    num2 = scaner.nextInt();
                    System.out.println("Introducir el 3er Numero");
                    num3 = scaner.nextInt();
                    System.out.println("Introducir el 4arto Numero");
                    num4 = scaner.nextInt();
                    System.out.println("Introducir el 5nto Numero");
                    num5 = scaner.nextInt();

                    Object[] info ={cant, num1, num2, num3, num4, num5};
                    String response = (String) client.execute("Methods.acomodar", info);
                    System.out.println(response);
                    break;
                default:
                    System.out.println("No selecciono ninguna opcion");
            }
            System.out.println("¿Desea ejecutar otra opcion? \n1.-Si \n2.-No");
            respuesta=scaner.nextInt();

        }while(respuesta==1);

    }

}
