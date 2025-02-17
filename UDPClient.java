import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPClient {
    public static void main(String[] args) {
        String serverIP = "localhost"; // Change to server IP if needed
        int serverPort = 9876; // Must match server's port

        try (DatagramSocket clientSocket = new DatagramSocket()) {
            // Prepare data
            String message = "Hello from UDP Client";
            byte[] sendData = message.getBytes();
            InetAddress serverAddress = InetAddress.getByName(serverIP);

            // Send packet
            DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, serverAddress, serverPort);
            clientSocket.send(sendPacket);
            System.out.println("Message sent: " + message);

            // Receive response
            byte[] receiveBuffer = new byte[1024];
            DatagramPacket receivePacket = new DatagramPacket(receiveBuffer, receiveBuffer.length);
            clientSocket.receive(receivePacket);

            String response = new String(receivePacket.getData(), 0, receivePacket.getLength());
            System.out.println("Response from server: " + response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
