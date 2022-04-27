public class Main {
    public static void main(String[] args) {
        BmiService bmiCalculate = new BmiService();
        bmiCalculate.calculate(80, 140);
        bmiCalculate.calculate(60, 174);
    }

}
