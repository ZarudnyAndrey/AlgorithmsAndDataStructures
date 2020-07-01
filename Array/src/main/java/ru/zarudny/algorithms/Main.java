package ru.zarudny.algorithms;

import java.util.Random;
import ru.zarudny.algorithms.array.AbstractArray;
import ru.zarudny.algorithms.array.ArrayDisordered;
import ru.zarudny.algorithms.array.ArrayOrdered;

public class Main {

  private static final Random random = new Random();
  private static final int ARRAY_SIZE = 100;
  private static final int NUMBER_OF_ITEMS_TO_SEARCH = 10;
  private static final int NUMBER_OF_ITEMS_TO_DELETE = 10;

  public static void main(String[] args) {
    AbstractArray disorderedArray = new ArrayDisordered(ARRAY_SIZE);
    AbstractArray orderedArray = new ArrayOrdered(ARRAY_SIZE);
    //==============================================================================================
    System.out.println("\nInsert:");
    //==============================================================================================
    long startDisorderedInsert = System.nanoTime();

    for (int i = 0; i < ARRAY_SIZE; i++) {
      disorderedArray.insert(random.nextInt(ARRAY_SIZE));
    }

    long endDisorderedInsert = System.nanoTime();
    long durationDisorderedInsert = (endDisorderedInsert - startDisorderedInsert) / ARRAY_SIZE;

    System.out.println("\tAverage insertion time of one element in an disordered array: " +
        durationDisorderedInsert + " ns");
    //==============================================================================================
    long startOrderedInsert = System.nanoTime();

    for (int i = 0; i < ARRAY_SIZE; i++) {
      orderedArray.insert(random.nextInt(ARRAY_SIZE));
    }

    long endOrderedInsert = System.nanoTime();
    long durationOrderedInsert = (endOrderedInsert - startOrderedInsert) / ARRAY_SIZE;

    System.out.println("\tAverage insertion time of one element in an ordered array: " +
        durationOrderedInsert + " ns");
    //==============================================================================================
    System.out.println("\nSearch:");
    //==============================================================================================
    long startLinearSearch = System.nanoTime();

    for (int i = 0; i < NUMBER_OF_ITEMS_TO_SEARCH; i++) {
      disorderedArray.search(random.nextInt(ARRAY_SIZE));
    }

    long endLinearSearch = System.nanoTime();
    long durationLinearSearch = (endLinearSearch - startLinearSearch) / NUMBER_OF_ITEMS_TO_SEARCH;

    System.out.println("\tAverage linear search time: " + durationLinearSearch + " ns");
    //==============================================================================================
    long startBinarySearch = System.nanoTime();

    for (int i = 0; i < NUMBER_OF_ITEMS_TO_SEARCH; i++) {
      orderedArray.search(random.nextInt(ARRAY_SIZE));
    }

    long endBinarySearch = System.nanoTime();
    long durationBinarySearch = (endBinarySearch - startBinarySearch) / NUMBER_OF_ITEMS_TO_SEARCH;

    System.out.println("\tAverage binary search time: " + durationBinarySearch + " ns");
    //==============================================================================================
    System.out.println("\nDelete:");
    //==============================================================================================
    long startDisorderedDelete = System.nanoTime();

    for (int i = 0; i < NUMBER_OF_ITEMS_TO_DELETE; i++) {
      disorderedArray.delete(random.nextInt(ARRAY_SIZE));
    }

    long endDisorderedDelete = System.nanoTime();
    long durationDisorderedDelete =
        (endDisorderedDelete - startDisorderedDelete) / NUMBER_OF_ITEMS_TO_DELETE;

    System.out.println("\tAverage delete time of one element in an disordered array: " +
        durationDisorderedDelete + " ns");
    //==============================================================================================
    long startOrderedDelete = System.nanoTime();

    for (int i = 0; i < NUMBER_OF_ITEMS_TO_DELETE; i++) {
      orderedArray.delete(random.nextInt(ARRAY_SIZE));
    }

    long endOrderedDelete = System.nanoTime();
    long durationOrderedDelete =
        (endOrderedDelete - startOrderedDelete) / NUMBER_OF_ITEMS_TO_DELETE;

    System.out.println("\tAverage delete time of one element in an ordered array: " +
        durationOrderedDelete + " ns");
    //==============================================================================================
    ArrayDisordered arrayForBubbleSort = new ArrayDisordered(ARRAY_SIZE);
    ArrayDisordered arrayForSelectionSort = new ArrayDisordered(ARRAY_SIZE);
    ArrayDisordered arrayForInsertionSort = new ArrayDisordered(ARRAY_SIZE);

    for (int i = 0; i < ARRAY_SIZE; i++) {
      int number = random.nextInt(ARRAY_SIZE);
      arrayForBubbleSort.insert(number);
      arrayForSelectionSort.insert(number);
      arrayForInsertionSort.insert(number);
    }
    //==============================================================================================
    System.out.println("\nSorting:");
    //==============================================================================================
    long startBubbleSort = System.nanoTime();

    arrayForBubbleSort.bubbleSort();

    long endBubbleSort = System.nanoTime();
    long durationBubbleSort = endBubbleSort - startBubbleSort;
    System.out.println("\tDuration bubble sort: " + durationBubbleSort + " ns");
    //==============================================================================================
    long startSelectionSort = System.nanoTime();

    arrayForSelectionSort.selectionSort();

    long endSelectionSort = System.nanoTime();
    long durationSelectionSort = endSelectionSort - startSelectionSort;
    System.out.println("\tDuration selection sort: " + durationSelectionSort + " ns");
    //==============================================================================================
    long startInsertionSort = System.nanoTime();

    arrayForInsertionSort.insertionSort();

    long endInsertionSort = System.nanoTime();
    long durationInsertionSort = endInsertionSort - startInsertionSort;
    System.out.println("\tDuration insertion sort: " + durationInsertionSort + " ns");
    //==============================================================================================
  }
}
