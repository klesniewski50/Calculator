package com.example.calculator;

import java.math.BigDecimal;

public class Calculator {
    private boolean isFirstNumber = false;
    private boolean isFirstSign = false;
    private String numberOne = "";
    private boolean isSecondNumber = false;
    private boolean isSecondSign = false;
    private String numberTwo = "";
    private boolean isSign = false;
    private String sign = "";

    public String getData(){
        return numberOne + sign + numberTwo;
    }

    public boolean getIsSign(){
        return isSign;
    }

    public void handleNumber(String s){
        if(!isFirstNumber && !isSecondNumber){
            numberOne += s;
        }
        else{
            numberTwo += s;
        }
    }

    public String handleSign(String s){
        if(s.equals(".")){
            if(!isFirstSign && !isSign){
                if(numberOne.length() == 0 || (numberOne.length() == 1 && numberOne.charAt(0) == '-')){
                    numberOne += "0.";
                    isFirstSign = true;
                    return "0.";
                }
                numberOne += s;
                isFirstSign = true;
                return s;
            }else if(!isSecondSign && isFirstNumber && isSign){
                if(numberTwo.length() == 0 || (numberTwo.length() == 1 && numberTwo.charAt(0) == '-')){
                    numberTwo += "0.";
                    isSecondSign = true;
                    return "0.";
                }
                numberTwo += s;
                isSecondSign = true;
                return s;
            }
            else
                return "";
        }
        else if(s.equals("C")){
            isFirstNumber = false;
            isFirstSign = false;
            numberOne = "";
            isSecondNumber = false;
            isSecondSign = false;
            numberTwo = "";
            isSign = false;
            sign = "";
            return "";
        }
        else if(s.equals("^2") || s.equals("ln") || s.equals("cos") || s.equals("sin") || s.equals("tan") || s.equals("sqrt")){
            if((numberOne.length() > 0 && numberOne.charAt(0) != '-') || (numberOne.length() > 0)){
                sign = s;
                isSign = true;
                isFirstNumber = true;
                return eval();
            }
            else
                return "";
        }
        else if(s.equals("=")){
            if(isSign && ((numberTwo.length() > 0 && numberTwo.charAt(0) != '-') || (numberTwo.length() > 1)))
                return eval();
            else return "e";
            //else return numberOne + " " + sign + " " + numberTwo;
        }
        else{
                if(numberOne.length() == 0 && s.equals("-")){
                    numberOne += s;
                }
                else if(!isSign && (numberOne.length() > 1 || (numberOne.length() > 0 && numberOne.charAt(0) != '-'))){
                    sign = s;
                    isSign = true;
                    isFirstNumber = true;
                }
                else if(numberTwo.length() == 0 && s.equals("-") && isSign)
                    numberTwo += s;
                else{
                    return "";
                }
        }
        return s;
    }

    private void setVariablesInEval(){
        numberTwo = "";
        sign = "";
        isFirstNumber = false;
        isSign = false;
        isSecondSign = false;
        isSecondNumber = false;
    }

    public String eval(){
        BigDecimal bigOne = new BigDecimal(numberOne);
        if(sign.equals("^2")){
            bigOne = bigOne.pow(2);
            numberOne = bigOne.toString();
            setVariablesInEval();
            return numberOne;
        }
        if(sign.equals("ln")){
            bigOne = BigDecimal.valueOf(Math.log(bigOne.doubleValue()));
            numberOne = bigOne.toString();
            setVariablesInEval();
            return numberOne;
        }
        if(sign.equals("cos")){
            bigOne = BigDecimal.valueOf(Math.cos(bigOne.doubleValue()));
            numberOne = bigOne.toString();
            setVariablesInEval();
            return numberOne;
        }
        if(sign.equals("sin")){
            bigOne = BigDecimal.valueOf(Math.sin(bigOne.doubleValue()));
            numberOne = bigOne.toString();
            setVariablesInEval();
            return numberOne;
        }
        if(sign.equals("tan")){
            bigOne = BigDecimal.valueOf(Math.tan(bigOne.doubleValue()));
            numberOne = bigOne.toString();
            setVariablesInEval();
            return numberOne;
        }
        if(sign.equals("sqrt")){
            bigOne = BigDecimal.valueOf(Math.sqrt(bigOne.doubleValue()));
            numberOne = bigOne.toString();
            setVariablesInEval();
            return numberOne;
        }
        BigDecimal bigTwo = new BigDecimal(numberTwo);
        if(sign.equals("+")){
            bigOne = bigOne.add(bigTwo);
            numberOne = bigOne.toString();
            setVariablesInEval();
            return numberOne;
        }
        if(sign.equals("-")){
            bigOne = bigOne.subtract(bigTwo);
            numberOne = bigOne.toString();
            setVariablesInEval();
            return numberOne;
        }
        if(sign.equals("*")){
            bigOne = bigOne.multiply(bigTwo);
            numberOne = bigOne.toString();
            setVariablesInEval();
            return numberOne;
        }
        if(sign.equals("/")){
            if(bigTwo.doubleValue() != 0){
                bigOne = BigDecimal.valueOf(bigOne.doubleValue() / bigTwo.doubleValue());
                numberOne = bigOne.toString();
            }
            else{
                isFirstSign = false;
                numberOne = "";
            }
            setVariablesInEval();
            return numberOne;
        }
        if(sign.equals("%")){
            if(bigTwo.doubleValue() != 0){
                bigOne = BigDecimal.valueOf((bigOne.doubleValue() / bigTwo.doubleValue()) * 100);
                numberOne = bigOne.toString();
            }
            else{
                isFirstSign = false;
                numberOne = "";
            }
            setVariablesInEval();
            return numberOne;
        }
        if(sign.equals("^")){
            if(bigTwo.intValue() > -1){
                bigOne = bigOne.pow(bigTwo.intValue());
                numberOne = bigOne.toString();
                setVariablesInEval();
                return numberOne;
            }
            numberOne = bigOne.toString();
            setVariablesInEval();
            return numberOne;
        }
        return numberOne + sign + numberTwo;
    }

}
