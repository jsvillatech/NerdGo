package apps.practico.nerdgo;

import java.util.Random;

public class Operation {


    private String operation;
    private char[] operands;


    private char operand;
    private int numA;
    private int numB;
    private int points;


    public Operation() {

        operands = new char[4];
        operands[0] = '+';
        operands[1] = '-';
        operands[2] = '*';
        operands[3] = '/';
        points = 0;
        operation = "";
        numA = 0;
        numB = 0;
        operand = ' ';


    }


    public String generateOperation() {

        Random rand = new Random();

        numA = rand.nextInt(101);
        numB = rand.nextInt(101);
        operand = operands[rand.nextInt(4)];

        if (operand == '/') {

            while (numA % numB != 0) {

                numA = rand.nextInt(101);
                numB = rand.nextInt(101);


            }

            operation = "" + numA + operand + numB;

        }

        if (operand != '/') {


            operation = "" + numA + operand + numB;


        }

        return operation;
    }


    public boolean verifyDivision(int a, int b) {

        boolean puedo = false;
        if (a % b == 0) {
            puedo = true;
        }
        return puedo;
    }


    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public char[] getOperands() {
        return operands;
    }

    public void setOperands(char[] operands) {
        this.operands = operands;
    }

    public int getNumA() {
        return numA;
    }

    public void setNumA(int numA) {
        this.numA = numA;
    }

    public int getNumB() {
        return numB;
    }

    public void setNumB(int numB) {
        this.numB = numB;
    }

    public char getOperand() {
        return operand;
    }

    public void setOperand(char operand) {
        this.operand = operand;
    }


    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }



}
