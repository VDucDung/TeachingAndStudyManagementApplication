package Actors;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DBEngine {

    //methods
    public static void writeObjectToFile(String fileName, Object obj) throws FileNotFoundException, IOException {
        FileOutputStream fout = new FileOutputStream(fileName);

        ObjectOutputStream oos = new ObjectOutputStream(fout);

        oos.writeObject(obj);

        fout.close();
        oos.close();
    }

    public static Object readObjectFromFile(String fileName) throws FileNotFoundException, IOException, ClassNotFoundException {
        FileInputStream fin = new FileInputStream(fileName);

        ObjectInputStream ois = new ObjectInputStream(fin);

        Object obj = ois.readObject();

        fin.close();
        ois.close();

        return obj;
    }
}
