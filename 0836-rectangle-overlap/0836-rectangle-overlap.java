class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        // Check if rec1 is completely to the left of rec2
        if (rec1[2] <= rec2[0]) {
            return false;
        }
        // Check if rec1 is completely to the right of rec2
        if (rec1[0] >= rec2[2]) {
            return false;
        }
        // Check if rec1 is completely below rec2
        if (rec1[3] <= rec2[1]) {
            return false;
        }
        // Check if rec1 is completely above rec2
        if (rec1[1] >= rec2[3]) {
            return false;
        }
        // If none of the above conditions are true,
        // the rectangles have a positive overlapping area
        return true;
    }
}


// class Solution {
//     public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
//         int width=Math.min(rec1[2],rec2[2])-Math.max(rec1[0],rec2[0]);
//         int height=Math.min(rec1[3],rec2[3])-Math.max(rec1[1],rec2[1]);
//         return width>0 && height>0;
//     }
// }
/*
First, I find the overlapping width by taking the smaller of the two right boundaries and subtracting the larger of the two left boundaries. Similarly, I find the overlapping height by taking the smaller of the two top boundaries and subtracting the larger of the two bottom boundaries. If both the width and height are greater than 0, it means the rectangles have some common area, so I return true; otherwise, they are either separate or just touching, so I return false.
*/
