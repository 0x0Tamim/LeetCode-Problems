import java.util.*;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Test cases
        int[] nums1 = {1, 2, 2, 3, 3, 3};
        int k1 = 2;
        System.out.println(Arrays.toString(sol.topKFrequent(nums1, k1))); // [2, 3] (order may vary)

        int[] nums2 = {7, 7};
        int k2 = 1;
        System.out.println(Arrays.toString(sol.topKFrequent(nums2, k2))); // [7]
    }
}

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
         HashMap<Integer,Integer>map = new HashMap<>();
         for(int i = 0;i< nums.length;i++){
             map.put(nums[i],map.getOrDefault(nums[i],0)+1 );
         }

        PriorityQueue<Integer>pq=new PriorityQueue<>(
               // (a,b) ->map.get(b) - map.get(a)
                (a, b) -> Integer.compare(map.get(b), map.get(a))

        );

        for(int key: map.keySet()){
            pq.add(key);
        }
       int arr[]=new int[k];
         for(int i = 0;i<k;i++){
             arr[i]=pq.poll();
         }

        return arr;
    }
}
