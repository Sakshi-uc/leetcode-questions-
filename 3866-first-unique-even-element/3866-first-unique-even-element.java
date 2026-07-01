class Solution {
    public int firstUniqueEven(int[] nums) {
        HashMap<Integer, Integer> mpp = new HashMap<>();

        for (int num : nums) {
            mpp.put(num, mpp.getOrDefault(num, 0) + 1);
        }

        for (int num : nums) {
            if (num % 2 == 0 && mpp.get(num) == 1) {
                return num;
            }
        }

        return -1;
    }
}