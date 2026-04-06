package practice4.problem3;

public class Main {
    public static void main(String[] args) {
        App app = new App();

        System.out.println("=== LogicGame ===");
        app.getStatistics(new LogicGame());

        System.out.println("=== MemoryGame ===");
        app.getStatistics(new MemoryGame());

        IGame igame = new LogicGame();
        igame.d();

        System.out.println("=== iPhone ===");
        IPhone phone = new IPhone();
        phone.sell();
        phone.plug();

        Sellable s = phone;
        s.sell();

        Pluggable p = phone;
        p.plug();
    }
}
