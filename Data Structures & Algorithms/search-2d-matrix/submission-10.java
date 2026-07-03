class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        //binary search in binary search

        int left = 0;
        int right = matrix.length * matrix[0].length -1 ;
        int cols = matrix[0].length;

        while(left <= right){
            int middle = left + (right - left)/2;
            
            //now lets calculate the position
            int row = Math.floorDiv(middle, cols);
            System.out.println("middle: " + middle + " row: " + row);
            // if(matrix.length == 1 && row == 1 ){
            //     row = 0;
            // }
            
            int col = middle % cols;
            System.out.println(middle + "row: " + row + " col: " + col + " right: " + right +  " left: "+ left);
            if(target == matrix[row][col]){
                return true;
            }
            else if(target < matrix[row][col]){
                right = middle -1;
            }
            else{
                left = middle + 1;
            }
            
        }


        return false;
    }
}
