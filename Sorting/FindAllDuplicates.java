import java.util.ArrayList;
import java.util.List;

import javax.swing.event.SwingPropertyChangeSupport;

public class FindAllDuplicates {

  public List<Integer> findDuplicates(int[] arr) {
    int i=0;

    List<Integer> ans=new ArrayList<>(); 

    while(i<arr.length){
            int correct=arr[i]-1;
            if(arr[i]!=arr[correct]){
                swap(num, i,correct);
            }
            else{
                i++;
            }
        }
    
List<Integer> ans=new ArrayList<>();
for (int index = 0; index < arr.length; index++) {
    if(arr[index]!=index+1){
        ans.add(index+1);
    }
}
    return ans;
  }

  static void swap(int[] nums, first, second){
    int temp=nums[first];
    nums[first]=nums[second];
    nums[second]=temp;
  }
}
