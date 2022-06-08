// Link
// https://leetcode.com/submissions/detail/717449120/
class Solution {
    public int findCenter(int[][] edges) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int[] edge : edges){
            map.put(edge[0], map.getOrDefault(edge[0], 0)+ 1);
            map.put(edge[1], map.getOrDefault(edge[1], 0)+ 1);
        }
        int max = 0, res = 0;
        for(int key : map.keySet()){
            if(map.get(key) > max){
                max = map.get(key);
                res = key;
            }
        }
        return res;
    }
}
// Alternative
class Solution {
    public int findCenter(int[][] edges) {
        int x = edges[0][0];
        int y = edges[0][1];
        int a = edges[1][0];
        int b = edges[1][1];
        int ans=0;
        if(x==a || y==a)
            ans = a;
        if(x==b || y==b)
            ans = b;
        
        return ans;
    }
}