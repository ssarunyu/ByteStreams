package bytestreams;

import javax.imageio.IIOException;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LAB3 {
    public static void main(String[] args) {
        try {
            FileOutputStream file = new FileOutputStream("data.dat");
            DataOutputStream output = new DataOutputStream(file);
            output.writeUTF("Jim Henry");
            output.writeInt(30);
            output.writeDouble(65.5);
            output.writeChar('A');

        } catch (FileNotFoundException ex) {
            Logger.getLogger(LAB3.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(LAB3.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            FileInputStream file = new FileInputStream("data.dat");
            DataInputStream input = new DataInputStream(file);

            // sol 1
           /* String name = input.readUTF();
            int age = input.readInt();
            double height = input.readDouble();
            char bood = input.readChar();

            System.out.println(name);n
            System.out.println(age);
            System.out.println(height);
            System.out.println(bood);*/

            // sol2
            System.out.println(input.readUTF());
            System.out.println(input.readInt());
            System.out.println(input.readDouble());
            System.out.println(input.readChar());

        } catch (FileNotFoundException ex) {
            Logger.getLogger(LAB3.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(LAB3.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
