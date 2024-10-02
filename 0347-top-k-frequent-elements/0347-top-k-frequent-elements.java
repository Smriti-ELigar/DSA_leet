class Solution {
    public int[] topKFrequent(int[] nums, int k) {
/*
Approach
The approach is to implement the following steps:

1.Create a HashMap(Frequencymap) to store the frequency of each element.
2.Create a PriorityQueue to sort the elements based on their frequencies.
3.Add all elements to the PriorityQueue.
4.Create a list to store the top k frequent elements.
5.Iterate over the PriorityQueue and add the top k elements to the list.

Complexity
Time complexity: O(n log n). This is because we need to sort the elements in the priority queue, which takes O(n log n) time.
Space complexity: O(n). This is because we need to store the hashmap and the priority queue, which can take up to O(n) space.
*/
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
           if (map.containsKey(num)){
              map.put(num, map.getOrDefault(num,0)+1);
           }
           else{
              map.put(num,1);
           }
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));

        //by using keyset we can add all elements without for loop
        pq.addAll(map.keySet());

        // Create a list to store the top k(length) frequent elements
        int[] topKFrequentElements = new int[k];

        int m=0;// m is index for the list
        while (k > 0) {
            topKFrequentElements[m++]=pq.poll();
            k--;
        }
        return topKFrequentElements;
    }
    /*
    Here, the element with the highest priority (most frequent) is retrieved from the priority queue (pq.poll()) and stored in the topKFrequentElements array at index m. The m++ ensures that after the insertion, the index is incremented for the next element. pq.poll() removes and returns the top element from the queue.
    */

}