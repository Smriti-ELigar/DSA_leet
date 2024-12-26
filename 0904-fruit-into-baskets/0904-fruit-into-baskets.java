class Solution {
    public int totalFruit(int[] fruits) {
       int l = 0, maxFruits = 0;
        HashMap<Integer, Integer> basket = new HashMap<>();

        for (int r = 0; r < fruits.length; r++) {
            // Add the current fruit to the basket
            basket.put(fruits[r], basket.getOrDefault(fruits[r], 0) + 1);

            // If the number of distinct fruits exceeds 2, adjust the window
            if (basket.size() > 2) {
                basket.put(fruits[l], basket.get(fruits[l]) - 1);
                if (basket.get(fruits[l]) == 0) {
                    basket.remove(fruits[l]);
                }
                l++; // Move the left pointer
            }

            // Calculate the maximum number of fruits in the current window
            maxFruits = Math.max(maxFruits, r - l + 1);
        }

        return maxFruits; 
    }
}