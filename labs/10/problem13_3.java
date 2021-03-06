// JA: Where is the Kit class defined?

import java.util.ArrayList;
import java.util.Collections;


public class problem13_3 {

    public static void main(String[] args) {

        ArrayList<Number> numbers = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            numbers.add(i);
        }

        Collections.shuffle(numbers);
        System.out.println("Shuffled: ");
        Kit.display(numbers.toArray());
        System.out.println("Sorted: ");
        sort(numbers);
        Kit.display(numbers.toArray());
    }

    public static void sort(ArrayList<Number> list) {

        for (int i = 0; i < list.size() - 1; i++) {
            Number currentMin = list.get(i);
            int currentIndex = i;

            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j).doubleValue() < currentMin.doubleValue()) {
                    currentMin = list.get(j);
                    currentIndex = j;
                }
            }

            if (currentIndex != i) {
                list.set(currentIndex, list.get(i));
                list.set(i, currentMin);
            }
        }

    }

}