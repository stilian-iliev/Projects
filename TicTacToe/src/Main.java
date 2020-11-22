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
        boolean valid=false;

        int timer = 1;

        String symbol = "";

        while (true) {
            String input = scan.nextLine();

            if (timer % 2 == 1) {
                symbol = "X";
            } else {
                symbol = "O";
            }
            switch (input) {
                case "AA":
                    if (positionAA.equals(" ")) {
                        positionAA = symbol;
                        valid = true;
                    }
                    break;
                case "AB":
                    if (positionAB.equals(" ")) {
                        positionAB = symbol;
                        valid = true;
                    }
                    break;
                case "AC":
                    if (positionAC.equals(" ")) {
                        positionAC = symbol;
                        valid = true;
                    }
                    break;
                case "BA":
                    if (positionBA.equals(" ")) {
                        positionBA = symbol;
                        valid = true;
                    }
                    break;
                case "BB":
                    if (positionBB.equals(" ")) {
                        positionBB = symbol;
                        valid = true;
                    }
                    break;
                case "BC":
                    if (positionBC.equals(" ")) {
                        positionBC = symbol;
                        valid = true;
                    }
                    break;
                case "CA":
                    if (positionCA.equals(" ")) {
                        positionCA = symbol;
                        valid = true;
                    }
                    break;
                case "CB":
                    if (positionCB.equals(" ")) {
                        positionCB = symbol;
                        valid = true;
                    }
                    break;
                case "CC":
                    if (positionCC.equals(" ")) {
                        positionCC = symbol;
                        valid = true;
                    }
                    break;
            }
            if (valid){
                timer++;
            }
            valid = false;
            if (positionAA.equals(positionAB) && positionAB.equals(positionAC) && !positionAB.equals(" ")) {
                over = true;
            } else if (positionBA.equals(positionBB) && positionBB.equals(positionBC) && !positionBB.equals(" ")) {
                over = true;
            } else if (positionCA.equals(positionCB) && positionCB.equals(positionCC) && !positionCB.equals(" ")) {
                over = true;
            } else if (positionAA.equals(positionBA) && positionBA.equals(positionCA) && !positionBA.equals(" ")) {
                over = true;
            } else if (positionAB.equals(positionBB) && positionBB.equals(positionCB) && !positionBB.equals(" ")) {
                over = true;
            } else if (positionAC.equals(positionBC) && positionBC.equals(positionCC) && !positionBC.equals(" ")) {
                over = true;
            } else if (positionAA.equals(positionBB) && positionBB.equals(positionCC) && !positionBB.equals(" ")) {
                over = true;
            } else if (positionAC.equals(positionBB) && positionBB.equals(positionCA) && !positionBB.equals(" ")) {
                over = true;
            }
            System.out.printf("+-----------------+%n" +
                    "|  %s  |  %s  |  %s  |%n" +
                    "+-----------------+%n" +
                    "|  %s  |  %s  |  %s  |%n" +
                    "+-----------------+%n" +
                    "|  %s  |  %s  |  %s  |%n" +
                    "+-----------------+%n", positionAA, positionAB, positionAC, positionBA, positionBB, positionBC, positionCA, positionCB, positionCC);
            if (over) {
                System.out.printf("%s Won the game!", symbol);
                break;
            }
        }
    }
}
