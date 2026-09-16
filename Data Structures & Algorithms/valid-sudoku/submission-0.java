class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        for (int r = 0; r < 9; r++) {
            Set<Character> row = new HashSet<>();
            for (int i = 0; i < 9; i++) {
                if (board[r][i] == '.') continue;
                if (row.contains(board[r][i])) return false;
                row.add(board[r][i]);
            }
        }

        for (int c = 0; c < 9; c++) {
            Set<Character> col = new HashSet<>();
            for (int i = 0; i < 9; i++) {
                if (board[i][c] == '.') continue;
                if (col.contains(board[i][c])) return false;
                col.add(board[i][c]);
            }
        }

        for (int s = 0; s < 9; s++){
            Set<Character> square = new HashSet<>();
            for (int i = 0; i < 3; i++){
                for (int j = 0; j < 3; j++) {
                    int row = (s / 3) * 3 + i;
                    int col = (s % 3) * 3 + j;
                    if (board[row][col] == '.') continue;
                    if (square.contains(board[row][col])) return false;
                    square.add(board[row][col]);
                }
            }
        }

        return true;
    }
}
