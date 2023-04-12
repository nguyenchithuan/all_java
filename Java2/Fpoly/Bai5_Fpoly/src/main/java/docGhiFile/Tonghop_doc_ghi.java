package docGhiFile;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Tonghop_doc_ghi {

    public static void main(String[] args) {

        try {
            
            // doc dhi file nhi phan: tu dia ra ngoai
            FileInputStream fi = new FileInputStream("duong dan file");
            // ghi file nhi phan ra o dia
            FileOutputStream fo = new FileOutputStream("duong dan file");
            
            // doc/ ghi Object
            ObjectInputStream ofi = new ObjectInputStream(fi);
            ObjectOutputStream ofo = new ObjectOutputStream(fo);
            
            // doc/ghi gia tri nguyen thuy
            DataInputStream dif = new DataInputStream(fi);
            DataOutputStream dof = new DataOutputStream(fo);
            
            // do ghi file van ban
            FileReader fr = new FileReader("ten file");
            FileWriter fw = new FileWriter("ten file");
            
        } catch (Exception e) {
            System.out.println("Loi doc ghi file");
        }
    }
}
