public class Main {
    public static void main(String[] args) {
        byte length = 5;
        byte width = 3;
        float heigth = 2.5F;
        byte roll = 1;
        byte rollLength = 10;
        int perimetr = (length + width) * 2;
        int sum = perimetr / roll;
        float quantity = rollLength / heigth;
        float total = 1 + sum / quantity;
        System.out.println(total);

    }
}
