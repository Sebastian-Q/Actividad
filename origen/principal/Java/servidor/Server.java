package server;
//Sebastian Quintero Martinez
import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.server.PropertyHandlerMapping;
import org.apache.xmlrpc.webserver.WebServer;

import java.io.IOException;


public class Server {
    public static void main(String[] args)throws XmlRpcException, IOException{
        System.out.println("Iniciando servidor");
        PropertyHandlerMapping mapping = new PropertyHandlerMapping();
        mapping.addHandler("Methods",Methods.class);
        WebServer server = new WebServer(1300);
        server.getXmlRpcServer().setHandlerMapping(mapping);
        server.start();
        System.out.println("Esperando Instrucciones");
    }
}
