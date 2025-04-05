public class N_knight {
    public static void main(String[] args) {

    }

    static void knight(boolean[][] board, int row,int col,int knights) {
        if (col == board.length) {
            knight(board,row+1,0,knights);
            return ;
        }

    }

    private static boolean isSafe(boolean[][] board,int row,int col){
        // check vertical row
        for(int i=0;i<row;i++){
            if(board[i][col]){
                return false;
            }
        }
        //check diagonal
        int maxLeft = Math.min(row,col);
        for(int i=1;i<=maxLeft;i++){
            if(board[row-i][col-i]){
                return false;
            }
        }
        int maxRight = Math.min(row,board.length-col-1);
        for(int i=1;i<=maxRight;i++){
            if(board[row-i][col+i]){
                return false;
            }
        }
        return true;
    }



    private static void display(boolean[][] board){
        for(boolean[] row : board){
            for(boolean element:row){
                if(element){
                    System.out.print("K");
                }else{
                    System.out.print("X");
                }
            }
            System.out.println();
        }
    }

}

