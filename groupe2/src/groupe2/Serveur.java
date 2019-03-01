package groupe2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.io.PrintWriter;

public class Serveur{salut
    
    public static void main(String[] zero) {
        
        ServerSocket socketserver = null  ;
        Socket socketduserveur ;
        BufferedReader in;
        PrintWriter out;
        
        try {
        
            socketserver = new ServerSocket(socketserver.getLocalPort());
            socketduserveur = socketserver.accept(); 
                System.out.println("connexion");
            in = new BufferedReader (new InputStreamReader (socketduserveur.getInputStream()));
            out = new PrintWriter(socketduserveur.getOutputStream());
            String message_distant = in.readLine();
            System.out.println(message_distant);
                out.println(message);
                out.flush();
               
               
                        
                socketduserveur.close();
                socketserver.close();
                
        }catch (IOException e) {
            
            e.printStackTrace();
        }
    }

}
/*import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.io.PrintWriter;

public class Serveur {
	
	public static void main(String[] zero) {
		
		ServerSocket socketserver  ;
		Socket socketduserveur ;
		BufferedReader in;
		PrintWriter out;
		
		try {
		
			socketserver = new ServerSocket(2009);
			System.out.println("Le serveur est à l'écoute du port "+socketserver.getLocalPort());
			socketduserveur = socketserver.accept(); 
		        System.out.println("Un zéro s'est connecté");
			out = new PrintWriter(socketduserveur.getOutputStream());
		        out.println("Vous êtes connecté zéro !");
		        out.flush();
		                
		        socketduserveur.close();
		        socketserver.close();
		        
		}catch (IOException e) {
			
			e.printStackTrace();
		}
	}

}

*/
