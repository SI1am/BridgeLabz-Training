// LeetCode : 64 Minimum Path Sum
class Solution {
    public int minPathSum(int[][] grid) {

        //solution for the question starts here
        int n=grid.length , m=grid[0].length;// extract n,m for the grid
        int mins= Integer.MAX_VALUE;
        int[][] ar= new int[n][m]; // defines new dp Array "ar" here

        for(int i=0 ; i<n; i++){
            int sum=0;
            for(int j=0; j<m;j++){
                if(i==0 && j==0){
                    ar[i][j]=grid[i][j];//update the dp array once reach the end
                }
                else{
                    int up=grid[i][j]; 
                    int left=grid[i][j];
                    if(i>0 ) up+=ar[i-1][j];
                    else up=Integer.MAX_VALUE;
                    if(j>0) left+=ar[i][j-1];
                    else left=Integer.MAX_VALUE;

                    ar[i][j]=Math.min(up,left);//update the moment in the grid to the dp array
                }

            }
        }
        return ar[n-1][m-1];// returnn the solution
        
    }
}