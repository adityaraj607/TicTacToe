public class TicTacToe {

    static boolean isHumanTurn = true;
    static boolean gameOver = false;

    public static void main(String[] args) {

        while (!gameOver) {

            if (isHumanTurn) {
                System.out.println("Human turn");
            } else {
                System.out.println("Computer turn");
            }

            if (checkWin() || checkDraw()) {
                gameOver = true;
                break;
            }

            isHumanTurn = !isHumanTurn;
        }

        System.out.println("Game Over");
    }

    static boolean checkWin() {
        return false;
    }

    static boolean checkDraw() {
        return false;
    }
}
