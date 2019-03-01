package groupe2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;


public class Client {
    
    public static void main(String[] zero) {
        
        int a;
        Socket socket;
        BufferedReader in;
        PrintWriter out;

        try {
        
            socket = new Socket(InetAddress.getLocalHost(),2018);   
                System.out.println("Demande de connexion");
                out = new PrintWriter(socket.getOutputStream());
                in = new BufferedReader (new InputStreamReader (socket.getInputStream()));
                
                String message_distant = in.readLine();
                out.println("Bonjour");
                System.out.println(message_distant);
                
                String message_distant1 = in.readLine();
                System.out.println(message_distant1);
                
                Scanner sc = new Scanner(System.in);
                String message = sc.next();
                out = new PrintWriter(socket.getOutputStream());
                out.println(message);
                out.flush();
                
                
                socket.close();
          
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
        }catch (UnknownHostException e) {
            
            e.printStackTrace();
        }catch (IOException e) {
            
            e.printStackTrace();
        }
    }

}
/* import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;


public class Client {
	
	public static void main(String[] zero) {
		
		
		Socket socket;
		BufferedReader in;
		PrintWriter out;

		try {
		
			socket = new Socket(InetAddress.getLocalHost(),2009);	
		        System.out.println("Demande de connexion");

		        in = new BufferedReader (new InputStreamReader (socket.getInputStream()));
		        String message_distant = in.readLine();
		        System.out.println(message_distant);
		        
		        socket.close();
		       
		}catch (UnknownHostException e) {
			
			e.printStackTrace();
		}catch (IOException e) {
			
			e.printStackTrace();
		}
	}

}

*/