package projectvendingmachine;

public class Products {

    private double snicker = 2.5;
    private double chipsAhoy = 2.2;
    private double pringles = 12.99;
    private double milano =14.3;
    private double reeses = 3.9;
    private double cocaCola = 2.2;
    private double fanta = 2.0;
    private double water = 1.0;
    private double arizona = 1.5;
    private double skittles = 1.99;

    private int productNum;// scan objesiyle aldıgımız secimi atıcaz

    private double price;//scan objesi ile sectigi urunun fiyatini saklamak icin

    public void setSnicker(double snicker) {
        this.snicker = snicker;
    }

    @Override
    public String toString() {
        return "Products : "+
                "\n1. Snicker = $" + snicker +
                "\n2. ChipsAhoy = $" + chipsAhoy +
                "\n3. Pringles = $" + pringles +
                "\n4. Milano = $" + milano +
                "\n5. Reeses = $" + reeses +
                "\n6. CocaCola = $" + cocaCola +
                "\n7. Fanta = $" + fanta +
                "\n8. Water = $" + water +
                "\n9. Arizona = $" + arizona +
                "\n10. Skittles = $" + skittles;
    }

    public void setChipsAhoy(double chipsAhoy) {
        this.chipsAhoy = chipsAhoy;
    }

    public void setPringles(double pringles) {
        this.pringles = pringles;
    }

    public void setMilano(double milano) {
        this.milano = milano;
    }

    public void setReeses(double reeses) {
        this.reeses = reeses;
    }

    public void setCocaCola(double cocaCola) {
        this.cocaCola = cocaCola;
    }

    public void setFanta(double fanta) {
        this.fanta = fanta;
    }

    public void setWater(double water) {
        this.water = water;
    }

    public void setArizona(double arizona) {
        this.arizona = arizona;
    }

    public void setSkittles(double skittles) {
        this.skittles = skittles;
    }

    public void setProductNum(int productNum) {
        this.productNum = productNum;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getSnicker() {
        return snicker;
    }

    public double getChipsAhoy() {
        return chipsAhoy;
    }

    public double getPringles() {
        return pringles;
    }

    public double getMilano() {
        return milano;
    }

    public double getReeses() {
        return reeses;
    }

    public double getCocaCola() {
        return cocaCola;
    }

    public double getFanta() {
        return fanta;
    }

    public double getWater() {
        return water;
    }

    public double getArizona() {
        return arizona;
    }

    public double getSkittles() {
        return skittles;
    }

    public int getProductNum() {
        return productNum;
    }

    public double getPrice() {
        return price;
    }
}
