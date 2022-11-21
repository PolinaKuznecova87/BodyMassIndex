public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double m = 83; //Масса тела
        double h = 175; //Рост
        double index = service.calculate(m, h);

        System.out.println("Индекс массы тела" + index);

    }
}