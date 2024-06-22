import java.io.*;
import java.net.Socket;
import java.util.Base64;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

public class EmailSender {
    public static void main(String[] args) {
        // Email details
        String to = "recipient@example.com";
        String from = "your-email@gmail.com";
        String host = "smtp.gmail.com"; // Using Gmail's SMTP server
        int port = 587; // Port for TLS
        String username = "your-email@gmail.com";
        String password = "your-email-password";

        try {
            // Connect to the SMTP server
            Socket socket = new Socket(host, port);
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

            // Read the server's initial response
            System.out.println("Response: " + reader.readLine());

            // Say hello to the server
            writer.write("EHLO " + host + "\r\n");
            writer.flush();
            readResponse(reader);

            // Request to start TLS
            writer.write("STARTTLS\r\n");
            writer.flush();
            readResponse(reader);

            // Upgrade the socket to TLS
            SSLSocketFactory sslSocketFactory = (SSLSocketFactory) SSLSocketFactory.getDefault();
            SSLSocket sslSocket = (SSLSocket) sslSocketFactory.createSocket(socket, host, port, true);
            sslSocket.startHandshake();

            reader = new BufferedReader(new InputStreamReader(sslSocket.getInputStream()));
            writer = new BufferedWriter(new OutputStreamWriter(sslSocket.getOutputStream()));

            // Say hello again after starting TLS
            writer.write("EHLO " + host + "\r\n");
            writer.flush();
            readResponse(reader);

            // Authenticate
            writer.write("AUTH LOGIN\r\n");
            writer.flush();
            readResponse(reader);

            // Send the encoded username
            writer.write(Base64.getEncoder().encodeToString(username.getBytes()) + "\r\n");
            writer.flush();
            readResponse(reader);

            // Send the encoded password
            writer.write(Base64.getEncoder().encodeToString(password.getBytes()) + "\r\n");
            writer.flush();
            readResponse(reader);

            // Set the sender
            writer.write("MAIL FROM:<" + from + ">\r\n");
            writer.flush();
            readResponse(reader);

            // Set the recipient
            writer.write("RCPT TO:<" + to + ">\r\n");
            writer.flush();
            readResponse(reader);

            // Send the email data
            writer.write("DATA\r\n");
            writer.flush();
            readResponse(reader);

            // Email content
            writer.write("Subject: Test Email\r\n");
            writer.write("From: " + from + "\r\n");
            writer.write("To: " + to + "\r\n");
            writer.write("\r\n");
            writer.write("This is a test email sent from a Java program without using any external libraries.\r\n");
            writer.write(".\r\n");
            writer.flush();
            readResponse(reader);

            // Quit the session
            writer.write("QUIT\r\n");
            writer.flush();
            readResponse(reader);

            // Close the socket
            sslSocket.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error in sending email: " + e.getMessage());
        }
    }

    private static void readResponse(BufferedReader reader) throws IOException {
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println("Response: " + line);
            if (line.startsWith("220 ") || line.startsWith("250 ") || line.startsWith("235 ") || line.startsWith("354 ") || line.startsWith("221 ")) {
                break;
            }
        }
    }
}
