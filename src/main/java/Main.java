/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Admin
 */
import model.*;

import java.io.*;
import java.net.Socket;

public class Main {
    public static void main(String[] args) {
        try {
            // Connect to the server
            String serverIP = "10.23.134.149";
            int serverPort = 11000;
            Socket socket = new Socket(serverIP, serverPort);

            ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
            DataInputStream is = new DataInputStream(socket.getInputStream());
            DataOutputStream os = new DataOutputStream(socket.getOutputStream());
            ObjectInputStream in = new ObjectInputStream(socket.getInputStream());

//            Step 1: Receive String from Server
            String strServer = is.readUTF();
//            Step 2: Send maSV to Server
            os.writeUTF("B20DCCN594");
            os.flush();

//            Step 3: Receive String-OK object from Server
            Object receivedObject = in.readObject();
//            if(receivedObject instanceof StringOK){
//                StringOK str = (StringOK) receivedObject;
//                str.setValue("B20DCVT185");
//                System.out.println("String-OK Object from server: "+str);
//            }
//            Step 4: Client send Student Object to Server

            Student st = new Student();
            st.setMaSV("B20DCCN594");
            st.setHovaten("Nguyen Dang Tien");
            st.setGroup(1);
            out.writeObject(st);
            os.flush();

//            Step 5: Receive Object-OK object from Server
            Object receivedObject2 = in.readObject();
            if (receivedObject2 instanceof ObjectOK){
                ObjectOK objectOk = (ObjectOK) receivedObject2;
            }

            // Step 6: Send hovaten-String from Client to Server
            os.writeUTF("Nguyen Dang Tien");
            os.flush();
            // Step 7: Receive StringOK-Object from Server
            Object receivedObject3 = in.readObject();
            if(receivedObject3 instanceof StringOK){
                StringOK str3 = (StringOK) receivedObject3;
                System.out.println("String-OK Object Ho Va Ten: " + str3);
                str3.setValue("Nguyen Dang Tien");
            }
            // Step 8: Send nhom-int from Client to Server
            os.writeInt(1);
            os.flush();
            // Step 9: Receive IntOK-Object from Server
            Object receivedObject4 = in.readObject();
            if(receivedObject4 instanceof IntOK){
                IntOK nhomObject = (IntOK) receivedObject4;
                nhomObject.setValue(2);
            }
            // Step 10: Receive Answer-Object from Server
            Object receivedObject5 = in.readObject();
            ObjectOK ok = new ObjectOK();
            if (receivedObject5 instanceof Answer){
                Answer ans = (Answer) receivedObject5;
                ok.setValue(ans);
            }
            // Step 11: Client send object-ok to Server
            out.writeObject(ok);
            out.flush();

            // Close the streams and socket when done
            os.close();
            is.close();
            out.close();
            in.close();
            socket.close();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}