package Assignment1;
class Flower{
    String flower;
    int petals;
    float price;
    String getFlower() {
        return flower;
    }
    int getPetals() {
        return petals;
    }
    float getPrice(){
        return price;
    }
    void setFlower(String flower) {
        this.flower=flower;
    }
    void setPetals(int petals) {
        this.petals=petals;
    }
    void setPrice(float price) {
        this.price= price;
    }
}
public class Q12 {
    public static void main(String[] args) {
        Flower f1 = new Flower();
        Flower f2 = new Flower();
        f1.setFlower("lotus");
        f1.setPetals(30);
        f1.setPrice(120.0f);
        f2.setFlower("Rose");
        f2.setPetals(20);
        f2.setPrice(220.0f);
        System.out.println("name"+ "  "+ "petals"+ " "+ " price");
        System.out.println(f1.getFlower() + "  " + f1.getPetals() + "    " + f1.getPrice());
        System.out.println(f2.getFlower() + "   " + f2.getPetals() + "    " + f2.getPrice());

    }
}
