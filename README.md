# UDP Socket Communication in Java

This project demonstrates how to implement a **Datagram Socket API** using **Java UDP (User Datagram Protocol)**. It includes both a **UDP server** and a **UDP client**, allowing communication over a network.

## Features
- Lightweight, connectionless communication using UDP.
- Server listens for incoming messages and responds.
- Client sends a message to the server and waits for a response.
- Uses Java's `DatagramSocket` and `DatagramPacket` for data transmission.

## Requirements
- Java 8 or later
- Any Java IDE (e.g., IntelliJ, Eclipse, or VS Code) or a terminal with `javac`

## Setup & Usage

### 1. Compile the Files
```sh
javac UDPServer.java UDPClient.java
```

### 2. Run the UDP Server
```sh
java UDPServer
```

### 3. Run the UDP Client
```sh
java UDPClient
```

## Code Structure

### UDP Server (`UDPServer.java`)
- Listens on port `9876` for incoming packets.
- Reads the data and prints the received message.
- Sends a response back to the client.

### UDP Client (`UDPClient.java`)
- Sends a message to `localhost:9876`.
- Waits for the response from the server.
- Prints the received response.

## Example Output
### **Server Output**
```sh
UDP Server is running on port 9876
Received: Hello from UDP Client
```

### **Client Output**
```sh
Message sent: Hello from UDP Client
Response from server: Server received: Hello from UDP Client
```

## Notes
- Ensure that the **server is started before the client**.
- The IP address in `UDPClient.java` can be changed from `localhost` to a remote server IP.
- This program demonstrates **basic UDP communication**; for a real-world application, consider **error handling, packet loss recovery, and security measures**.

## Author
[Ryan Habis]

