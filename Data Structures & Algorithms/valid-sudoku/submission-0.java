class Solution {
    public boolean isValidSudoku(char[][] board) {
        // Brute Force
        // check for rows
        for(int i=0;i<9;i++){
            Set<Character> rowSet = new HashSet<>();
            for(int j=0;j<9;j++){
                if(board[i][j] == '.') continue;
                else if(rowSet.contains(board[i][j])) return false;
                else rowSet.add(board[i][j]);
            }
        }
        // check for columns
        for(int i=0;i<9;i++){
            Set<Character> colSet = new HashSet<>();
            for(int j=0;j<9;j++){
                if(board[j][i] == '.') continue;
                else if(colSet.contains(board[j][i])) return false;
                else colSet.add(board[j][i]);
            }
        }

        // check for boxes
        for(int row=0;row<9;row +=3){
            int endRow = row+2;
            for(int col=0;col<9;col +=3){
                int endCol = col+2;
                if(!boxTravelsal(row,endRow,col,endCol,board)) return false;
            }
        }
        return true;
    }

    public boolean boxTravelsal(int startRow, int endRow, int startCol, int endCol, char[][] board){
        Set<Character> boxSet = new HashSet<>();
        for(int i= startRow; i<=endRow;i++){
            for(int j=startCol;j<=endCol;j++){
                if(board[i][j] == '.') continue;
                else if(boxSet.contains(board[i][j])) return false;
                else boxSet.add(board[i][j]);
            }
        }
            return true;
    }
}
