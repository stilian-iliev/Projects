import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String positionAA = " ";
        String positionAB = " ";
        String positionAC = " ";
        String positionBA = " ";
        String positionBB = " ";
        String positionBC = " ";
        String positionCA = " ";
        String positionCB = " ";
        String positionCC = " ";

        boolean over = false;

        int timer = 1;

        String symbol = "";

        String graph = "+-----------------+" +
                "|  %s  |  %s  |  %s  |" +
                "+-----------------+" +
                "|  %s  |  %s  |  %s  |" +
                "+-----------------+" +
                "|  %s  |  %s  |  %s  |" +
                "+-----------------+";

        while (true) {
            String input = scan.nextLine();

            if (timer % 2 == 1) {
                symbol = "X";
            } else {
                symbol = "O";
            }
            timer++;
            switch (input) {
                case "AA":
                    positionAA = symbol;
                    break;
                case "AB":
                    positionAB = symbol;
                    break;
                case "AC":
                    positionAC = symbol;
                    break;
                case "BA":
                    positionBA = symbol;
                    break;
                case "BB":
                    positionBB = symbol;
                    break;
                case "BC":
                    positionBC = symbol;
                    break;
                case "CA":
                    positionCA = symbol;
                    break;
                case "CB":
                    positionCB = symbol;
                    break;
                case "CC":
                    positionCC = symbol;
                    break;
            }
            if (positionAA.equals(positionAB) && positionAB.equals(positionAC) && !positionAB.equals(" ")) {
                over = true;
            } else if (positionBA.equals(positionBB) && positionBB.equals(positionBC)&& !positionBB.equals(" ")) {
                over = true;
            } else if (positionCA.equals(positionCB) && positionCB.equals(positionCC)&& !positionCB.equals(" ")) {
                over = true;
            } else if (positionAA.equals(positionBA) && positionBA.equals(positionCA)&& !positionBA.equals(" ")) {
                over = true;
            } else if (positionAB.equals(positionBB) && positionBB.equals(positionCB)&& !positionBB.equals(" ")) {
                over = true;
            } else if (positionAC.equals(positionBC) && positionBC.equals(positionCC)&& !positionBC.equals(" ")) {
                over = true;
            } else if (positionAA.equals(positionBB) && positionBB.equals(positionCC)&& !positionBB.equals(" ")) {
                over = true;
            } else if (positionAC.equals(positionBB) && positionBB.equals(positionCA)&& !positionBB.equals(" ")) {
                over = true;
            }
            System.out.printf("+-----------------+%n" +
                    "|  %s  |  %s  |  %s  |%n" +
                    "+-----------------+%n" +
                    "|  %s  |  %s  |  %s  |%n" +
                    "+-----------------+%n" +
                    "|  %s  |  %s  |  %s  |%n" +
                    "+-----------------+%n", positionAA, positionAB, positionAC, positionBA, positionBB, positionBC, positionCA, positionCB, positionCC);
            if (over){
                System.out.printf("%s Won the game!", symbol);
                break;
            }
        }
    }
}
