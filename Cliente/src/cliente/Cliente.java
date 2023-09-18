/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cliente;

import java.io.BufferedReader;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class Cliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        String textoEnviado;
        int port = 55660;
        
        do {
            try {
                
                System.out.println("Digite uma mensagem: ");
                
                Socket client = new Socket("localhost",port);
                
                BufferedReader inFromUser = new BufferedReader(new InputStreamReader(System.in));
                
                DataOutputStream outFromClient = new DataOutputStream(client.getOutputStream());
                
                
                textoEnviado = inFromUser.readLine();
                outFromClient.writeBytes(textoEnviado);
                
                client.close(); 
                
                
            } catch (Exception e) {
            }
 
        } while (true);
    }
    
}
