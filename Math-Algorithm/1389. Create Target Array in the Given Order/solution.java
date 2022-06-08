// Link
// https://leetcode.com/submissions/detail/716942578/
class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> a = new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++) {
            a.add(index[i],nums[i]);
        }
        int target[] = new int[nums.length];
        for(int i=0;i<nums.length;i++) {
            target[i] = a.get(i);
        }
        return target;
    }
}
// Alternative
class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int len=nums.length;
        int[] target= new int[len];
        for(int i=0;i<len;i++){
            int b=index[i];
            if(b<i){
                int a=i;
                while(a>b){
                    target[a]=target[a-1];
                    a--;
                }
            }
        
                target[index[i]]=nums[i];
            
        }
        return target;
          
    }
}