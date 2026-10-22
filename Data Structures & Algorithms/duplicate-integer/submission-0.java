class Solution {
    // hashSet, store if it exists, else return false; return true
    HashSet<Integer> tempSet = new HashSet<>();
    public void print(Object s)
    {
        System.out.println(s);
    }
    public boolean hasDuplicate(int[] nums) {
        int result = 0;
        for(int i = 0 ; i<nums.length; i++)
        {
            tempSet.add(nums[i]);
        }
        return tempSet.size() == nums.length ? false : true;
    }
}