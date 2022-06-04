// Link
// https://leetcode.com/submissions/detail/714502432/
class Solution {
    public int minimumSum(int num) {
        char[] ch=(num+"").toCharArray();
        Arrays.sort(ch);
        int n=Integer.valueOf(""+ch[0]+ch[2]);
        int m=Integer.parseInt(""+ch[1]+ch[3]);
        return n+m;
    }
}
// Alternative
class Solution {
    public int minimumSum(int num) {
        int[] arr = new int[4];
        int i=0;
        while(num>0){
            arr[i++] = num%10;
            num = num/10;
        }
        Arrays.sort(arr);
        return (arr[0] + arr[1])*10 + (arr[2] + arr[3]);
    }
}