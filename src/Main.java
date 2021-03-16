public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float weight = 60;
        float growth = 1.70f;
        float index = service.calculate (weight ,growth);
        System.out.println("Ваш индекс массы тела (ИМТ) равен: " + index);
    }
}
