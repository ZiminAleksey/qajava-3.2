public class BmiService {
    public void calculate (int weight, int growth) {
        int bmi = (weight * 100 * 100 / (growth * growth));
        System.out.println("Индекс массы тела равен: " + bmi);
    }


}

// Пробовал через double, но не понял, как округлить до определенного знака после запятой. Через int индекс неточный