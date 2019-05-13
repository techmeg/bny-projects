package tictactoeMeg;


import java.util.Scanner;

public class TicTacToe {
//	TODO Fix winner tests, handle Invalid entries

	static char[][]board = {{'1', '2', '3'},
							{'4', '5', '6'},
							{'7', '8', '9'}};
	
	static char player = '1';
	static boolean flag = true;
	
	public static void main(String[] args) {
		// print game board
		printBoard();

		//call player guesses
		for (int i=1; i<=9; i++) {
			//call winner test 
			winnerTest1();
			winnerTest2();
			winnerTest3();
			if (flag=true){
				getPlayer(player);
				printBoard();
			}else {
				break;
			}
		}
	}
	
	static void printBoard() {
		System.out.println("\t  \t|\t  \t|\t" );
		System.out.println("\t" + board[0][0] + "\t|\t" + board[0][1] + "\t|\t" + board[0][2]);
		System.out.println("\t  \t|\t  \t|\t" );
		System.out.println("  ______________________________________________");
		System.out.println("\t  \t|\t  \t|\t" );
		System.out.println("\t" + board[1][0] + "\t|\t" + board[1][1] + "\t|\t" + board[1][2]);
		System.out.println("\t  \t|\t  \t|\t" );
		System.out.println("  ______________________________________________");
		System.out.println("\t  \t|\t  \t|\t" );
		System.out.println("\t" + board[2][0] + "\t|\t" + board[2][1] + "\t|\t" + board[2][2]);
		System.out.println("\t  \t|\t  \t|\t" );
	}
	static void getPlayer(char x) {

		//get and store input from player x
		System.out.println("TIC TAC TOE!");
		System.out.println("Enter the digit where you wish to place X or O."
				+ "the digits 1,2,and 3 to play Tic-Tac-Toe.");
		Scanner scan = new Scanner(System.in);
		int guess = scan.nextInt();
	//	System.out.println(guess);
		for(int i=0; i<board.length; i++) {
			for(int j = 0; j<board.length; j++) {
				if ((char)guess+'0' == board[i][j]){
					if ((player == '1')){
					board[i][j] = 'X';
					player = '2';
					}else {
					board[i][j] = 'O';
					player = '1';
					}
				}
			}
		}
		
	}//this method is to determine horizontal winners
	static void winnerTest1() {
		int i = 0;
		while (flag=true && i<3) {
			if(board[i][0] == 'X' && board[i][1] == 'X' && board[i][2] == 'X') {
				System.out.println("The winner is " + "X");
				flag = false;
				}else if (board[i][0] == 'O' && board[i][1] =='O' && board[i][2] == 'O') {
				System.out.println("The winner is " + "O");
				flag = false;
				}else {
					i++;
				}
		}
	}
		//this method is to determine vertical column winners; flag to false should stop game
		static void winnerTest2() {
			int i = 0;
			while (flag==true && i<3) {
				if(board[0][i] == 'X' && board[1][i] == 'X' && board[2][i] == 'X') {
				System.out.println("The winner is " + "X");
				flag = false;
				}else if (board[0][i] == 'O'&& board[1][i] == 'O' && board[2][i] == 'O') {
					System.out.println("The winner is " + "O");
					flag = false;
				}else {
					i++;
				}
			}
		}
		
		static void winnerTest3() {
			if ((board[0][0] == 'X' && board[1][1]=='X' && board[2][2]=='X') || (board[2][0] == 'X' && board[1][1] == 'X' && board[0][2] == 'X')) {
				System.out.println("The winner is " + "X");
				flag = false;
			}else if ((board[0][0] == 'O' && board[1][1]=='O' && board[2][2]=='O') || (board[2][0] == 'O' && board[1][1] == 'O' && board[0][2] == 'O')) {
				System.out.println("The winner is " + "O");
				flag = false;
			}else {
			}
		}
}



