// // https://leetcode.com/problems/peak-index-in-a-mountain-array/submissions/

////------------------------Unoptimized solution-----------------//

// class Solution {
//     public int  peakIndexInMountainArray(int[] arr) {
//         boolean flag=false;
//         if(arr.length>=3){
//             for(int i=1; i<arr.length;i++){
//                 if(i==1){
//                     if(arr[1]<=arr[0]){
//                         return -1;
//                     }
//                     else{
//                         flag=true;
//                     }
//                 }
//                 if(arr[i]>arr[i-1]){
//                     if(!flag){
//                         return -1;
//                     }
//                 }
//                 else if(arr[i]<arr[i-1]){
//                     if(flag){
//                         return i-1;
//                     }
//                     flag=false;
//                 }
//                 else{
//                     return -1;
//                 }
//             }
//             if(flag){
//                 return -1;
//             }

//         }
//          else{
//             return -1;
//         }
//         return -1;
//     }

// }

//------------Optimised solution--------------------//

public class peakIndexInMountainArray {

  public static void main(String[] args) {}

  public int peakIndexInMountainArray(int[] arr) {
    int start = 0, end = arr.length - 1;
    while (start < end) {
      mid = start + (end - start) / 2;

      if (arr[mid] > arr[mid + 1]) {
        //you are in decreasing part of array
        //this maybe the answer, but look at the left
        end = mid;
      }
      if (arr[mid] < arr[mid + 1]) {
        //you are in asc part of array
        start = mid + 1; //because we know that mid+1 element is greater than middle element
      }
    }

    //in the end the start==end and pointing to the largest number bcz of the checks above
    //start and end are always trying to find max element, that is the max one because that is
    //what the check say
    //More Elaboration: at every point of time for start and end, they have the best possible answer till that time
    //and if we are saying that only one item is remaining, hence bcz of above line that is the best  possible answer
    
    return start; // or return end as both are equal
  }
}
