class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int[] ans = new int[seq.length()];
        int depth = 0;
        for (int i = 0; i < seq.length(); i++) {
            if (seq.charAt(i) == '(') {
                depth++;
                ans[i] = depth % 2;
            } 
            else {
                ans[i] = depth % 2;
                depth--;
            }
        }
        return ans;
    }
}
/*
Keep track of the current nesting depth using a variable.
For every (, increase the depth first.
Use depth % 2 to decide which group the bracket belongs to.
For every ), use the current depth first, then decrease it.
This alternates the brackets between group 0 and group 1.
By splitting based on odd/even depth, the nesting is balanced between the two groups.
This gives the minimum possible maximum depth.
 */