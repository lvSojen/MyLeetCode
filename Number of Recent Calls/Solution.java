// Link:
// https://leetcode.com/submissions/detail/694549616/
class RecentCounter {
    ArrayList<Integer> req;
    public RecentCounter() {
        req= new ArrayList<>();
    }
    
    public int ping(int t) {
        req.add(t);
        while(req.get(0)<t-3000){
            req.remove(0);
        }
        return req.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */
