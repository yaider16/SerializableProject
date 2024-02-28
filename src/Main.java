public class Main {
    public static void main(String[] args) {
        try {
            Product product1= new Product("Manzana", 3, "Rojo");
            Product product2 = new Product("Reloj", 10, "Gris");
            Product product3 = new Product("juans", 50, "amarillo");
            Inputs inputs= new Inputs();
            Outputs outputs = new Outputs();

            inputs.open();
            inputs.write(product1);
            inputs.write(product2);
            inputs.write(product3);
            inputs.close();

            outputs.open();
            Product product;
            do{
                product = outputs.read();
                System.out.println(product);
            }while(product!=null);
            outputs.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
