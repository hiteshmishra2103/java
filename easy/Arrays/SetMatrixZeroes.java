public class SetMatrixZeroes {

        public void setZeroes(int[][] matrix) {  
            int m = matrix.length;
            int n = matrix[0].length;
            int[] marked_rows = new int[m];
            int[] marked_cols = new int[n];
            
            // Mark rows and columns with zeros
            for(int i = 0; i < m; i++) {
                for(int j = 0; j < n; j++) {
                    if(matrix[i][j] == 0) {
                        marked_rows[i]++;   
                        marked_cols[j]++;
                    }
                }
            }
            
            // Set rows and columns with zeros
            for(int i = 0; i < m; i++) {
                for(int j = 0; j < n; j++) {
                    if(marked_rows[i] > 0 || marked_cols[j] > 0) {
                        matrix[i][j] = 0;
                    }
                }
            }
        }
    }
    
