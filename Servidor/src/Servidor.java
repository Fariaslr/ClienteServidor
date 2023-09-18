
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Lucas
 */
public class Servidor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        String mensagemCliente;
        int port = 55660;
        String localHost = "127.0.0.1";
        
        System.out.println("Endereço: "+ localHost + ":" + port);
        
        try {
            ServerSocket socket = new ServerSocket(port);
            
            while (true) {       
                
                Socket connection = socket.accept();
                
                
                BufferedReader inFromClient = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                
                mensagemCliente = inFromClient.readLine();
                
                System.out.println("Mensagem recebida: "+ mensagemCliente);
            }
        } catch (Exception e) {
        }
        
    }
    
}
