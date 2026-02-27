/*
Problem: Largest Element in Array
Platform: geeksforgeeks
Difficulty: Basic

Approach:
- Use Array

Time Complexity: O(n)
Space Complexity: O(1)
*/



package Arrays;
class Largest{
    public static int largest(int[] arr) {
        int max= arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max)
                max=arr[i];
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {10, 5, 20, 15, 30};
        System.out.println("Largest element: " + largest(arr));
    }
}
