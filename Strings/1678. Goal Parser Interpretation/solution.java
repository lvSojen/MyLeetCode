// Link:
// https://leetcode.com/submissions/detail/710157924/
class Solution {
    public String interpret(String command) {
        command = command.replace("()","o");
        command = command.replace("(al)","al");
        return command;
    }
}

// Alternative
class Solution {
    public String interpret(String command) {
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < command.length(); i++)
        {
            if (command.charAt(i) == 'G')
                temp.append('G');
            else if (command.charAt(i) == '(')
            {
                if (command.charAt(i+1) == ')')
                {
                    temp.append('o');
                    i+=1;
                }
                else
                {
                    temp.append("al");
                    i+=2;
                }
            }
        }
        return temp.toString();
}
}