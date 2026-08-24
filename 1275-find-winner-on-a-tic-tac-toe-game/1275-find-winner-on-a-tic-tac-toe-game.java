class Solution {
    public String tictactoe(int[][] moves) {

        char[][] board = new char[3][3];

        // Place X and O
        for(int i = 0; i < moves.length; i++) {
            int r = moves[i][0];
            int c = moves[i][1];

            if(i % 2 == 0)
                board[r][c] = 'X';
            else
                board[r][c] = 'O';
        }

        // Check rows
        for(int i = 0; i < 3; i++) {
            if(board[i][0] != '\0' &&
               board[i][0] == board[i][1] &&
               board[i][1] == board[i][2]) {

                if(board[i][0] == 'X')
                    return "A";
                else
                    return "B";
            }
        }

        // Check columns
        for(int j = 0; j < 3; j++) {
            if(board[0][j] != '\0' &&
               board[0][j] == board[1][j] &&
               board[1][j] == board[2][j]) {

                if(board[0][j] == 'X')
                    return "A";
                else
                    return "B";
            }
        }

        // Main diagonal
        if(board[0][0] != '\0' &&
           board[0][0] == board[1][1] &&
           board[1][1] == board[2][2]) {

            if(board[0][0] == 'X')
                return "A";
            else
                return "B";
        }

        // Other diagonal
        if(board[0][2] != '\0' &&
           board[0][2] == board[1][1] &&
           board[1][1] == board[2][0]) {

            if(board[0][2] == 'X')
                return "A";
            else
                return "B";
        }

        // If all 9 positions are filled
        if(moves.length == 9)
            return "Draw";

        // Otherwise, game is not finished
        return "Pending";
    }
}