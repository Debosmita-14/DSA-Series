class Solution {
    public int majorityElement(int[] nums) {
        int vote=0;
        int majority=0;
        for(int num:nums){
            if(vote==0){
                majority=num;
            }
            if(num==majority){
                vote++;
            }
            else{
                vote--;
            }
        }
        return majority;
    }
}