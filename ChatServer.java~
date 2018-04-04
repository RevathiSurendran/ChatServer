import java.io.*;
import java.net.*;
 
class ChatServer
{
   public static void main(String args[]) throws Exception
      {
      		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         	DatagramSocket serverSocket = new DatagramSocket(9876);
           	byte[] receiveData = new byte[1024];
            	byte[] sendData = new byte[1024];
            
            while(true)
               {
               	  
                  DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
                  serverSocket.receive(receivePacket);
                  
                  String sentence = new String( receivePacket.getData(),0,receivePacket.getLength());
                  System.out.println("RECEIVED: " + sentence);
                  String st = br.readLine();
                  InetAddress IPAddress = receivePacket.getAddress();
                  int port = receivePacket.getPort();
                  //String capitalizedSentence = sentence.toUpperCase();
                 
                sendData = st.getBytes();
                  DatagramPacket sendPacket =
                 new DatagramPacket(sendData, sendData.length, IPAddress, port);
                  serverSocket.send(sendPacket);
               }
      }
}


