import java.io.*;
import java.util.*;

public class Chess {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter printer = new PrintWriter(new BufferedOutputStream(System.out));

		int iterations = sc.nextInt();
		int[][] board = new int[8][8];
        for (int i = 0; i < 8; i += 2)
         {
            for (int j = 0; j < 8; j += 2)
             {
				board[i][j] = 1;
				board[i][j + 1] = 2;
				board[i + 1][j] = 2;
				board[i + 1][j + 1] = 1;
			}
		}

        while (iterations-- > 0)
         {
			int startCol = (int) sc.next().charAt(0) - 65;
			int startRow = 8 - sc.nextInt();
			int endCol = (int) sc.next().charAt(0) - 65;
			int endRow = 8 - sc.nextInt();

            if (board[startRow][startCol] != board[endRow][endCol]) 
            {
				printer.println("Impossible");
			} else {
                if (startRow == endRow && startCol == endCol) 
                {
					printer.println("0 " + (char) (startCol + 65) + " " + (8 - startRow));
				} else {
					int[][] board2 = new int[8][8];
					TrackMoves(board2, startRow, startCol);

                    if (board2[endRow][endCol] == 1) 
                    {
						printer.println("1 " + (char) (startCol + 65) + " " + (8 - startRow) + " " + (char) (endCol + 65)
								+ " " + (8 - endRow));
					} else {
						TrackMoves(board2, endRow, endCol);

						int row = -1, col = -1;
						for (int i = 0; i < 8; i++){
							for (int j = 0; j < 8; j++){
								if (board2[i][j] == 2) {
									row = i;
									col = j;
									break;
                                }
                            }        
                        }
						printer.println("2 " + (char) (startCol + 65) + " " + (8 - startRow) + " " + (char) (col + 65) + " "
								+ (8 - row) + " " + (char) (endCol + 65) + " " + (8 - endRow));
					}
				}
			}

		}

		printer.close();
	}

    static void TrackMoves(int[][] board, int rowPos, int colPos) 
    {
		int row = rowPos, col = colPos;
		while (true) {
			row = row - 1;
			col = col + 1;

			if (row == -1 || col == 8)
				break;

			board[row][col]++;
		}

		row = rowPos;
		col = colPos;
		while (row >= 0 && row < 8 && col >= 0 && col < 8) {
			row = row + 1;
			col = col + 1;

			if (row == 8 || col == 8)
				break;

			board[row][col]++;
		}

		row = rowPos;
		col = colPos;
		while (row >= 0 && row < 8 && col >= 0 && col < 8) {
			row = row - 1;
			col = col - 1;

			if (row == -1 || col == -1)
				break;

			board[row][col]++;
		}

		row = rowPos;
		col = colPos;
        while (row >= 0 && row < 8 && col >= 0 && col < 8) 
        {
			row = row + 1;
			col = col - 1;

			if (row == 8 || col == -1)
				break;

			board[row][col]++;
        }
        
    }

    
}