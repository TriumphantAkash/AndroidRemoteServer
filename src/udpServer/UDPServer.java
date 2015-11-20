package udpServer;

import java.net.DatagramPacket;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPServer {

	public static void main(String args[]) throws Exception
    {
            DatagramSocket serverSocket = new DatagramSocket(53359);
            byte[] receiveData = new byte[1024];
            byte[] sendData = new byte[1024];
            while(true)
            {
            	System.out.println("1");
                    DatagramPacket receivePacket = new DatagramPacket(receiveData,receiveData.length);
                    System.out.println("2");
                    serverSocket.receive(receivePacket);
                    Runtime.getRuntime().exec("cmd /c start \"%programfiles%\\Windows Media Player\\wmplayer.exe\" \"c:\\song.mp3\"");
                    System.out.println("3");
                    String sentence = new String(receivePacket.getData(),0,receivePacket.getLength());
                    InetAddress IPAddress = receivePacket.getAddress();
                    int port = receivePacket.getPort();
                    System.out.println("4");
                    System.out.println("MESSAGE RECEIVED  "+sentence+"  "+IPAddress+"         "+port);
            }
     }
}
