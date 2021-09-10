package projectvendingmachine;

public class Runner {
    public static void main(String[] args) {

        Products product=new Products();

        Methods method=new Methods();

        System.out.println("Merhaba, alisverise hosgeldiniz...");

        double money= method.money();
        System.out.println("Hesabinizda "+money+" dolar var");
        product.setPrice(method.select(product));
        money= method.balance(product.getPrice(),money, product);
        method.purchase(product.getPrice(),money,product);
    }
}
