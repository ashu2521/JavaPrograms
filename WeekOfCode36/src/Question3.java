import java.util.Arrays;
import java.util.Scanner;

public class Question3 {
	static int rook(int i, char[][] board, int[] king) {
		int check = 0;
		for (int j = king[1]+1; j < 8; j++)
			if (board[king[0]][j] == 'X') {
				check = 1;
				break;
			} else if (board[king[0]][j] != '#' && board[king[0]][j] != 'X')
				break;
		for (int j = king[1]-1; j >= 0; j--)
			if (board[king[0]][j] == 'X') {
				check = 1;
				break;
			} else if (board[king[0]][j] != '#' && board[king[0]][j] != 'X')
				break;
		if (king[1] == i) {
			for (int j = king[0]-1; j >= 0; j++) {
				if (board[j][i] == 'X') {
					check = 1;
					break;
				} else if (board[j][i] != 'X' && board[j][i] != '#')
					break;
			}
		}
		return check;
	}

	static int knight(int i, char[][] board, int[] king) {
		int check = 0;
		int[][] knight_moves = new int[2][4];
		knight_moves[0][0] = 1;
		knight_moves[1][0] = i - 2;
		knight_moves[0][1] = 1;
		knight_moves[1][1] = i + 2;
		knight_moves[0][2] = i - 1;
		knight_moves[1][2] = 2;
		knight_moves[0][3] = 1 + 1;
		knight_moves[1][3] = 2;
		for (int j = 0; j < 4; j++)
			if (knight_moves[0][j] >= 0 && knight_moves[0][j] < 8 && knight_moves[1][j] >= 0 && knight_moves[1][j] < 8
					&& board[knight_moves[0][j]][knight_moves[1][j]] == 'k')
				check = 1;
		return check;
	}

	static int bishop(int i, char[][] board, int[] king) {
		int check = 0;
		for (int j = king[0] - 1, k = king[1] + 1; j >= 0 && k < 8; j--, k++) {
			if (board[j][k] == 'X') {
				check = 1;
				break;
			} else if (board[j][k] != '#' && board[j][k] != 'X') {
				break;
			}
		}
		for (int j = king[0] - 1, k = king[1] - 1; j >= 0 && k >= 0; j--, k--)
			if (board[j][k] == 'X') {
				check = 1;
				break;
			} else if (board[j][k] != '#' && board[j][k] != 'X')
				break;

		return check;
	}

	static int discoveredCheck(char[][] board, int[] king) {
		int check = 0;
		if (king[0] == 1) {
			for (int j = king[1] + 1; j < 8; j++)
				if (board[king[0]][j] == 'R' || board[king[0]][j] == 'Q') {
					check = 1;
					break;
				} else if (board[king[0]][j] != '#' && board[king[0]][j] != 'R' || board[king[0]][j] == 'Q')
					break;
			for (int j = king[1] - 1; j >= 0; j--)
				if (board[king[0]][j] == 'R' || board[king[0]][j] == 'Q') {
					check = 1;
					break;
				} else if (board[king[0]][j] != '#' && board[king[0]][j] != 'R' || board[king[0]][j] == 'Q')
					break;
		}
		for (int j = king[0] - 1, k = king[1] + 1; j >= 0 && k < 8; j--, k++) {
			if (board[j][k] == 'Q' || board[j][k] == 'B') {
				check = 1;
				break;
			} else if (board[j][k] != '#' && board[j][k] != 'Q' && board[j][k] != 'B') {
				break;
			}
		}
		for (int j = king[0] - 1, k = king[1] - 1; j >= 0 && k >= 0; j--, k--)
			if (board[j][k] == 'Q' || board[j][k] == 'B') {
				check = 1;
				break;
			} else if (board[j][k] != '#' && board[j][k] != 'Q' || board[j][k] != 'B')
				break;

		return check;
	}

	static int pin(char[][] board, int[] king) {
		int pin = 0;
		//rook
		for (int j = king[1]+1; j < 8; j++)
			if (board[king[0]][j] == 'q' || board[king[0]][j] == 'r') {
				pin = 1;
				break;
			} else if (board[king[0]][j] != '#')
				break;
		for (int j = king[1]-1; j >= 0; j--)
			if (board[king[0]][j] == 'q' || board[king[0]][j] == 'r') {
				pin = 1;
				break;
			} else if (board[king[0]][j] != '#')
				break;

		//bishop
		for (int j = king[0] - 1, k = king[1] + 1; j >= 0 && k < 8; j--, k++) {
			if (board[j][k] == 'b') {
				pin = 1;
				break;
			} else if (board[j][k] != '#') {
				break;
			}
		}
		for (int j = king[0] - 1, k = king[1] - 1; j >= 0 && k >= 0; j--, k--)
			if (board[j][k] == 'b') {
				pin = 1;
				break;
			} else if (board[j][k] != '#' )
				break;
		for (int j = king[0] + 1, k = king[1] + 1; j < 8 && k < 8; j++, k++)
			if (board[j][k] == 'b' || board[j][j] == 'q') {
				pin = 1;
				break;
			} else if (board[j][k] != '#')
				break;
		for (int j = king[0] + 1, k = king[1] - 1; j < 8 && k >= 0; j++, k--)
			if (board[j][k] == 'b' || board[j][k] == 'q') {
				pin = 1;
				break;
			} else if (board[j][k] != '#')
				break;
		
		return pin;
	}

	static int waysToGiveACheck(char[][] board) {
		// Complete this function
		int count = 0;
		int[] king = new int[2];
		int[] kingW = new int[2];
		kingW[0] = -1;
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if (board[i][j] == 'k') {
					king[0] = i;
					king[1] = j;
				}
				if (board[i][j] == 'K') {
					kingW[0] = i;
					kingW[1] = j;
				}
			}
		}

		int pinStat = pin(board, kingW);
		if(pinStat == 1)
			return 0;
		
		for (int i = 0; i < 8; i++) {
			
			if (board[1][i] == 'P' && board[0][i] == '#') {
				char[][] boardClone = board.clone();
				boardClone[1][i] = '#';
				boardClone[0][i] = 'X';
				pinStat = 0;
				
				if (kingW[0] != -1)
					pinStat = pin(boardClone, kingW);

				if (pinStat == 1)
					continue;

				int dis = discoveredCheck(boardClone, king);
				if (dis > 0) {
					count += 4;
					continue;
				}
				int r = rook(i, boardClone, king);
				int b = bishop(i, boardClone, king);
				int k = knight(i, boardClone, king);
				int q = (r > 0 || b > 0 ? 1 : 0);
				count += (r + b + k + q);
			}
		}
		return count;

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			char[][] board = new char[8][8];
			for (int board_i = 0; board_i < 8; board_i++) {
				String s = in.next();
				board[board_i] = s.toCharArray();
				// System.out.println("HEllo");
			}
			int result = waysToGiveACheck(board);
			System.out.println(result);
		}
		in.close();
	}
}
