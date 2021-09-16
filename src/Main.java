public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double bodyMassIndex = service.calculate(100.0,1.75);
        System.out.println("Индекс массы тела:" + bodyMassIndex);
    }
}