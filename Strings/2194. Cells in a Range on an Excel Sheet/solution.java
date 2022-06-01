// Link
// https://leetcode.com/submissions/detail/712136610/
class Solution {
        public List<String> cellsInRange(String s) {
            char startingLetter = s.charAt(0);
            char endingLetter = s.charAt(3);
            int startingSpot = Character.getNumericValue(s.charAt(1));
            int endSpot = Character.getNumericValue(s.charAt(s.length()-1));
            List <String> ans = new ArrayList<>();


            if(startingSpot == endSpot) {
                StringBuilder stringBuilder = new StringBuilder();

                while(startingLetter <= endingLetter) {
                    stringBuilder.append(startingLetter);
                    stringBuilder.append(startingSpot);
                    startingLetter +=1;
                    ans.add(stringBuilder.toString());
                    stringBuilder.setLength(0);
                }

            } else {
                String endPace = "";
                endPace += endingLetter;
                endPace += endSpot;
                StringBuilder stringBuilder = new StringBuilder();
                int nonChangingStart = startingSpot;
                int nonChangingEnd = endSpot;
                while(true) {
                    if(startingSpot>nonChangingEnd) {
                        startingSpot=nonChangingStart;
                        startingLetter +=1;
                    }
                    stringBuilder.append(startingLetter);
                    stringBuilder.append(startingSpot);
                    
                    startingSpot +=1;
                    ans.add(stringBuilder.toString());
                    if(stringBuilder.toString().equals(endPace)){
                        break;
                    }
                    stringBuilder.setLength(0);

                }
            }
            return ans;
        }
}