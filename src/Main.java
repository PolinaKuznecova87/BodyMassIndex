public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 83; //Масса тела
        double height = 175; //Рост
        double index = service.calculate(weight, height);

        System.out.println("Индекс массы тела   " + index);

    }
}