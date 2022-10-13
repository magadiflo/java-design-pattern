package app.behavioral.javatechonline.strategy;

public class InsertionSort implements Strategy {

    @Override
    public void sort(int[] numbers) {
        System.out.println("Sorting array using insertion sort strategy");
    }

}
