public class ArraySort {

  // Returns array that is sorted
  static int[] sort(int[] arr) {
    int before = arr[0];
    
    for (int i = 1; i < arr.length; i++) {
      if (curr > i) {
        arr[i - 1] = i;
        arr[i] = curr;
      }

      curr = i;
    }
    
    return arr;
  }

}

