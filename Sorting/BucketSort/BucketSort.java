package BucketSort;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import javax.swing.text.FlowView.FlowStrategy;

public class BucketSort {

  static void bucketSort(float[] arr) {
    int n = arr.length;

    ArrayList<Float>[] buckets = new ArrayList[n];

    for (int i = 0; i < n; i++) {
      int bucketIndex = (int) arr[i] * n;
      buckets[bucketIndex].add(arr[i]);
    }

    //Sort each bucket individually
    for (int i = 0; i < buckets.length; i++) {
      Collections.sort(buckets[i]);
    }

    //Merge all buckets to get final sorted array
    int index = 0;
    for (int i = 0; i < buckets.length; i++) {
      ArrayList<Float> currBucket = buckets[i];
      for (int j = 0; j < currBucket.size(); j++) {
        arr[index++] = currBucket.get(j);
      }
    }
  }

  public static void main(String[] args) {
    float[] arr = { 0.5f, 0.4f, 0.3f, 0.2f, 0.1f };
    bucketSort(arr);
    for (float val : arr) {
      System.out.println(val + "");
    }
  }
}
