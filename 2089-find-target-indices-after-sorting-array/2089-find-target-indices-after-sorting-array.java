class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> ans=new ArrayList<>();
        int small=0;
        int count=0;
        for (int i=0; i<nums.length;i++){
            if(nums[i]<target)small++;
            else if(nums[i]==target)count++;
        }
        if(count==0)return ans;
        for(int i=1;i<=count;i++){
            ans.add(small++);
        }
        return ans;
    }
}
/*
    basically i created a result arraylist and two integer variables count and small
    here count is used to count how many target elments are present in the array
    and small is use to count then an element is smaller than target 
    after that if count is 0 simply return empty arraylist 
    if not then traverse the loop till count and add small++ in the list 

 */
// class Solution {
//     public List<Integer> targetIndices(int[] nums, int target) {
//         List<Integer> ans=new ArrayList<>();
//         Arrays.sort(nums);
//         for(int i=0;i<nums.length;i++){
//             if(nums[i]==target)ans.add(i);
//         }
//         return ans;
//     }
// }
/*
sort the array first
then put index of those elements that maches the target in to list and return
 */