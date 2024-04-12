public class Main {
    public static void main(String[] args) {
        String[] array = {"Bicycle", "Car", "Mobile phone"};
        String[] type = {"BMX", "Renault 4", "I-Phone"};
        Double[] price = {150.55, 100.0, 500.0};
        for (int j = 0; j < type.length; j++) {
            System.out.println(type[j] + " is type " + array[j] + " and it costs " + price[j]);
        }
    }
}