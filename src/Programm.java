public class Programm {
    public static void main(String[] args) {
        Cup<Tea> cup1 = new Cup<>(new Tea());
        Cup<Coffee> cup2 = new Cup<>(new Coffee());
        Cup<Cacao> cup3 = new Cup<>(new Cacao());

        cup1.napitok.typeText();
        cup2.napitok.typeText();
        cup3.napitok.typeText();


    }
}
