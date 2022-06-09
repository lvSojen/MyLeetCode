// Link
// https://leetcode.com/submissions/detail/718291777/
class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int count =0;
        int total =0;
        while(count <students.length) {
            total += Math.abs(students[count]-seats[count++]);
        }
        return total;
    }
}
// Alternative
class Solution {
    int moves = 0;
    public int minMovesToSeat(int[] seats, int[] students) {
        int[] freqSeats = new int[101];
        for(int i=0;i<seats.length;i++){
            freqSeats[seats[i]]++;
        }
        
        int[] freqStuds = new int[101];
        for(int i=0;i<students.length;i++){
            freqStuds[students[i]]++;
        }
        int counter = 0;
        for(int i=0;i<freqStuds.length;i++){
            while(freqStuds[i] > 0){
                students[counter++] = i;
                freqStuds[i]--;
            }
        }
        
        counter = 0;
        for(int i=0;i<freqSeats.length;i++){
            while(freqSeats[i] > 0){
                seats[counter++] = i;
                freqSeats[i]--;
            }
        }      

        for(int i=0;i<seats.length;i++){
            moves += Math.abs(seats[i] - students[i]);
        }
        return moves;
    }
}