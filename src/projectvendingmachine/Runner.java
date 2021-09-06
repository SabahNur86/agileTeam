package projectvendingmachine;

public class Runner {
    public static void main(String[] args) {

        Products product=new Products();
        System.out.println(product.toString());
        Methods method=new Methods();
        method.select(product);

    }
}
