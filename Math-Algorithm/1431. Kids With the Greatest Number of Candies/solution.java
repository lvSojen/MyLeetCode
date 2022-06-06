// Link
// https://leetcode.com/submissions/detail/715811318/
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max =0;
        for(int element : candies) {
            if(element >max) {
                max = element;
            }
        }
        List<Boolean> list = new ArrayList<>();
        for(int element : candies) {
            if(element+extraCandies >= max) {
                list.add(true);
            } else {
                list.add(false);
            }
        }
        return list;
    }
}
// Alternative
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandies = candies[0];
        List<Boolean> ans = new ArrayList<>(candies.length);
        
        for(int i = 1; i < candies.length; i++) {
            if(candies[i] > maxCandies)
                maxCandies = candies[i];
        }
        
        for(int i = 0; i < candies.length; i++) {
            ans.add(candies[i] + extraCandies >= maxCandies);
        }
        
        return ans;
    }
}