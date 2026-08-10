class Solution {
    public String makeGood(String s) {
        StringBuilder st = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (st.length() > 0 && Math.abs(st.charAt(st.length() - 1) - ch) == 32)
                st.deleteCharAt(st.length() - 1);
            else
                st.append(ch);
        }
        return st.toString();
    }
}
// Use StringBuilder like a stack.
// If the last character and current character are the same letter with different cases, remove the last one.
// Otherwise, add the current character.

// class Solution {
//     public String makeGood(String s) {
//         Stack<Character> st = new Stack<>();
//         for (char ch : s.toCharArray()) {
//             // If top and current are same letter with different cases, remove top
//             if (!st.isEmpty() && Math.abs(st.peek() - ch) == 32) {
//                 st.pop();
//             } else {
//                 // Otherwise add the current character
//                 st.push(ch);
//             }
//         }
//         StringBuilder ans = new StringBuilder();
//         // Stack gives characters in reverse order, so build and reverse the answer
//         while (!st.isEmpty()) {
//             ans.append(st.pop());
//         }
//         return ans.reverse().toString();
//     }
// }
// Use a stack and compare each character with the top.
// If they are the same letter but different cases, remove the top.
// Otherwise, push the current character.