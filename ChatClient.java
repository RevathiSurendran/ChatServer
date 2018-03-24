import java.io.*;
import java.net.*;

class ChatClient
{

	 public static void main(String args[]) throws Exception
  	 {
     		 BufferedReader inFromUser =
        	 new BufferedReader(new InputStreamReader(System.in));
     		 DatagramSocket clientSocket = new DatagramSocket();
     		 InetAddress IPAddress = InetAddress.getByName("localhost");
     		 byte[] sendData = new byte[1024];

