import java.io.IOException;
import java.util.Scanner;

public class Main {
    static String input;
    private static Integer integer;


    public static void main(String[] args) throws Exception {
        int total;
        Scanner s = new Scanner(System.in);
        input = s.nextLine();
        calc(input);

    }
    public static String calc(String input) throws Exception {
        String input1 = input;
        String numberStr[] = input.replaceAll("[+*/-]", " ").split(" ");
        String operator[] = input.replaceAll("[0-9IVX]", "").split("");
        int arabCalc1 = 0;
        int arabCalc2 = 0;
        int romeCalc1 = 0;
        int romeCalc2 = 0;
        int total = 0;
        String result;

        try {
            arabCalc1 = integer.parseInt(numberStr[0]);

        } catch (Exception e){
            Rome rome1 = Rome.valueOf(numberStr[0]);
            romeCalc1 = rome1.getIndex();
            if (romeCalc1 > 10){
                throw new Exception();
            }
        }
        try {
            arabCalc2 = integer.parseInt(numberStr[1]);

        } catch (Exception e){
            Rome rome2 = Rome.valueOf(numberStr[1]);
            romeCalc2 = rome2.getIndex();
            if (romeCalc2 > 10){
                throw new Exception();
            }
        }
        if (arabCalc1>10 || arabCalc2>10){
            throw new Exception();
        }
        if (arabCalc1>0 && romeCalc2>0){
            throw new Exception();
        }
        if (arabCalc2>0 && romeCalc1>0){
            throw new Exception();
        }
        if (arabCalc1>0 && arabCalc2>0){
            switch (operator[0]){
                case "+":
                    total = arabCalc1+arabCalc2;
                    break;
                case "-":
                    total = arabCalc1-arabCalc2;
                    break;
                case "*":
                    total = arabCalc1*arabCalc2;
                    break;
                case "/":
                    total = arabCalc1/arabCalc2;
                    break;
            }
            result = integer.toString(total);
            System.out.println(result);
            return input;
        } else if (romeCalc1>0 && romeCalc2>0){
            switch (operator[0]){
                case "+":
                    total = romeCalc1+romeCalc2;
                    break;
                case "-":
                    total = romeCalc1-romeCalc2;
                    break;
                case "*":
                    total = romeCalc1*romeCalc2;
                    break;
                case "/":
                    total = romeCalc1/romeCalc2;
                    break;
            }
            if (total<0){
                throw new Exception();
            }
            if (total<=10){
                String str1 = String.valueOf(Rome.values()[total-1]);
                System.out.println(str1);
            }
            if (total>10){
                int x = total/10;
                int y = total%10;
                if (x==1 && y!=0){
                    String str1 = String.valueOf(Rome.values()[9]);
                    String str2 = String.valueOf(Rome.values()[y-1]);
                    System.out.println(str1+str2);
                    return input;
                }
                if (x==2 && y!=0){
                    String str1 = String.valueOf(Rome.values()[10]);
                    String str2 = String.valueOf(Rome.values()[y-1]);
                    System.out.println(str1+str2);
                    return input;
                }
                if (x==2){
                    String str1 = String.valueOf(Rome.values()[10]);
                    System.out.println(str1);
                    return input;
                }
                if (x==3 && y!=0){
                    String str1 = String.valueOf(Rome.values()[11]);
                    String str2 = String.valueOf(Rome.values()[y-1]);
                    System.out.println(str1+str2);
                    return input;
                }
                if (x==3){
                    String str1 = String.valueOf(Rome.values()[11]);
                    System.out.println(str1);
                    return input;
                }
                if (x==4 && y!=0){
                    String str1 = String.valueOf(Rome.values()[12]);
                    String str2 = String.valueOf(Rome.values()[y-1]);
                    System.out.println(str1+str2);
                    return input;
                }
                if (x==4){
                    String str1 = String.valueOf(Rome.values()[12]);
                    System.out.println(str1);
                    return input;
                }
                if (x==5 && y!=0){
                    String str1 = String.valueOf(Rome.values()[13]);
                    String str2 = String.valueOf(Rome.values()[y-1]);
                    System.out.println(str1+str2);
                    return input;
                }
                if (x==5){
                    String str1 = String.valueOf(Rome.values()[13]);
                    System.out.println(str1);
                    return input;
                }
                if (x==6 && y!=0){
                    String str1 = String.valueOf(Rome.values()[14]);
                    String str2 = String.valueOf(Rome.values()[y-1]);
                    System.out.println(str1+str2);
                    return input;
                }
                if (x==6){
                    String str1 = String.valueOf(Rome.values()[14]);
                    System.out.println(str1);
                    return input;
                }
                if (x==7 && y!=0){
                    String str1 = String.valueOf(Rome.values()[15]);
                    String str2 = String.valueOf(Rome.values()[y-1]);
                    System.out.println(str1+str2);
                    return input;
                }
                if (x==7){
                    String str1 = String.valueOf(Rome.values()[15]);
                    System.out.println(str1);
                    return input;
                }
                if (x==8 && y!=0){
                    String str1 = String.valueOf(Rome.values()[16]);
                    String str2 = String.valueOf(Rome.values()[y-1]);
                    System.out.println(str1+str2);
                    return input;
                }
                if (x==8){
                    String str1 = String.valueOf(Rome.values()[16]);
                    System.out.println(str1);
                    return input;
                }
                if (x==9 && y!=0){
                    String str1 = String.valueOf(Rome.values()[17]);
                    String str2 = String.valueOf(Rome.values()[y-1]);
                    System.out.println(str1+str2);
                    return input;
                }
                if (x==9){
                    String str1 = String.valueOf(Rome.values()[17]);
                    System.out.println(str1);
                    return input;
                }
                if (x==10){
                    String str1 = String.valueOf(Rome.values()[18]);
                    System.out.println(str1);
                    return input;
                }


            }


        }

        return input1;
    }

}
