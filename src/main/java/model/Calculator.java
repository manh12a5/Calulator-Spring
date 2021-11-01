package model;

public class Calculator {
    private double leftNumber;
    private double rightNumber;
    private String operator;

    public Calculator() {
    }

    public Calculator(double leftNumber, double rightNumber, String operator) {
        this.leftNumber = leftNumber;
        this.rightNumber = rightNumber;
        this.operator = operator;
    }

    public double getLeftNumber() {
        return leftNumber;
    }

    public void setLeftNumber(double leftNumber) {
        this.leftNumber = leftNumber;
    }

    public double getRightNumber() {
        return rightNumber;
    }

    public void setRightNumber(double rightNumber) {
        this.rightNumber = rightNumber;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

}
