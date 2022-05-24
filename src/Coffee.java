public class Coffee implements Napitki {
    Types type;

    public Coffee(Types type) {
        this.type = type;
    }

    @Override
    public void typeText() {
        System.out.println(" Кофе ");
    }
}
