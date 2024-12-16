/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenut3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

/**
 *
 * @author alumno
 */
public class ExamenUT3Server {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        int port = 1234;
        
        try {
            ServerSocket server = new ServerSocket(port);
            System.out.println("Servidor iniciado en el puerto " + port + ".");

            
            // Aceptar una conexion
            Socket client = server.accept();
            System.out.println("Cliente conectado: " + client.getInetAddress());

            // Leer y responder al cliente
            BufferedReader input = new BufferedReader(new InputStreamReader(client.getInputStream()));
            PrintWriter output = new PrintWriter(client.getOutputStream(), true);
            
            
            String IPv41 = "192.168.1.8";
            String IPv42 = "192.168.1.15";
            int mask1 = 24; // Máscara /24


            IPv4Address ip1 = new IPv4Address(IPv41, mask1);
            IPv4Address ip2 = new IPv4Address(IPv42, mask1);


            if (ip1.Same(ip2)) {
                output.println("Las IPs " + IPv41 + " y " + IPv42 + " pertenecen a la misma red.");
            } else {
                output.println("Las IPs " + IPv41 + " y " + IPv42 + " no pertenecen a la misma red.");
            }
            
            String IPv43 = "169.255.1.2";
            String IPv44 = "169.255.1.23";
            int mask2 = 24; // Máscara /24


            IPv4Address ip3 = new IPv4Address(IPv43, mask2);
            IPv4Address ip4 = new IPv4Address(IPv44, mask2);


            if (ip3.Same(ip4)) {
                output.println("Las IPs " + IPv43 + " y " + IPv44 + " pertenecen a la misma red.");
            } else {
                output.println("Las IPs " + IPv43 + " y " + IPv44 + " no pertenecen a la misma red.");
            }
            
            String IPv45 = "142.232.4.7";
            String IPv46 = "153.23.1.23";
            int mask3 = 24; // Máscara /24


            IPv4Address ip5 = new IPv4Address(IPv45, mask3);
            IPv4Address ip6 = new IPv4Address(IPv46, mask3);

            if (ip5.Same(ip6)) {
                output.println("Las IPs " + IPv45 + " y " + IPv46 + " pertenecen a la misma red.");
            } else {
                output.println("Las IPs " + IPv45 + " y " + IPv46 + " no pertenecen a la misma red.");
            }
            
            String IPv47 = "0.0.0.0";
            String IPv48 = "153.23.1.23";
            int mask4 = 24; // Máscara /24


            IPv4Address ip7 = new IPv4Address(IPv47, mask4);
            IPv4Address ip8 = new IPv4Address(IPv48, mask4);


            if (!ip7.equals("0.0.0.0") && !ip8.equals("0.0.0.0")) {
                
                if (ip7.Same(ip8)) {
                    output.println("Las IPs " + IPv47 + " y " + IPv48 + " pertenecen a la misma red.");
                } else {
                    output.println("Las IPs " + IPv47 + " y " + IPv48 + " no pertenecen a la misma red.");
                }
            } else {
                output.print("Una de las IPs es 0.0.0.0 acabando");
                
            }
            
                
        }catch (IOException ex) {
        ex.printStackTrace();
        }
    
}
}
