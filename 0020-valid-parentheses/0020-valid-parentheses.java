class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>(); //for opening brack
        HashMap<Character, Character> closeToOpen = new HashMap<>(); 
        //for close with its crsp opening
        closeToOpen.put(')', '(');
        closeToOpen.put(']','[');
        closeToOpen.put('}','{');

        for(char c : s.toCharArray()){
            if(closeToOpen.containsKey(c)){   // if c is closing
                if(!stack.isEmpty() && stack.peek()==closeToOpen.get(c)){
                    stack.pop();
                }
                else{
                    return false;
                }
            }
            else{ // if c is opening
                stack.push(c); 
            }
        }
        return stack.isEmpty();
    }
}