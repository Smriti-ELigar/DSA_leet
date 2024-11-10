class Solution {
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        int ind = 0;

        //search for first char
        for(int i = 0;i<m;i++){
            for(int j =0;j<n;j++){
                if(board[i][j]==word.charAt(ind)){
                    if(searchNext(board,word,i,j,ind,m,n)){
                        return true;
                    }
                }
            }
        }
                    return false;

    }
    private boolean searchNext(char[][]board, String word,int row, int col,int ind, int m, int n){
        if(ind== word.length()){
            return true;
        }
if(row < 0 || col < 0 || row == m || col == n || board[row][col] != 
        word.charAt(ind) || board[row][col] == '!'  )          return false;

        char c = board[row][col];
        board[row][col] = '!';

        boolean top = searchNext(board, word, row-1,col,ind+1,m,n);
        boolean bottom = searchNext(board, word, row+1,col,ind+1,m,n);
        boolean left = searchNext(board, word, row,col-1,ind+1,m,n);
        boolean right = searchNext(board, word, row,col+1,ind+1,m,n);

        board[row][col]=c;

        return top||bottom||right||left;
    }
}
