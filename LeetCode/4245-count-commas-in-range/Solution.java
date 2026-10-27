class Solution {
    public int countCommas(int n) {
        int count=0;
        for(int i =0; i<n+1;i++){
            if (i>999)
                count+=1;
        }
        return count;
    }
}