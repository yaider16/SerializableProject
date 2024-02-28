import java.io.*;

public class Outputs{
    private FileInputStream file;
    private ObjectInputStream input;

    public void open() throws IOException{
        file = new FileInputStream("juans.bat");
        input = new ObjectInputStream(file);
    }

    public void close() throws IOException{
        if(file!=null) file.close();
    }

    public Product read() throws IOException, ClassNotFoundException{
        Product product = null;
        if (input!=null) {
            try {
                product = (Product) input.readObject();
            } catch (EOFException e) {
                
            }
        }
        return product;
    }
}

