import java.io.*;
public class Inputs implements Serializable{
    private FileOutputStream file;
    private ObjectOutputStream output;
    public void open() throws IOException{
        file = new FileOutputStream("juans.bat");
        output = new ObjectOutputStream(file);
    }
    public void close() throws IOException{
        if(output!=null) file.close();
    }
    public void write(Product product) throws IOException{
        if (output!=null) {
            output.writeObject(product);    
        }
    }
}
