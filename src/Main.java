public class Main {
    public static void main(String[] args) {
        int[] number = new int[3];
        number[0] = 1;
        number[1] = 2;
        number[2] = 3;
        for (int i = 0; i < number.length; i++) {
            if (i != 2) {
                System.out.print(number[i] + ",");
            } else {
                System.out.print(number[i]);
            }
        }
        System.out.println("");
        for (int b = 2; b >= 0; b--) {
            if (b != 0) {
                System.out.print(number[b] + ",");
            } else {
                System.out.println(number[b]);
            }
        }

        System.out.println();
        double[] fractional = {1.57, 7.654, 9.986};
        for (int i = 0; i < fractional.length; i++) {
            if (i != 2) {
                    System.out.print(fractional[i] + ",");
            } else {
                    System.out.print(fractional[i]);
            }
        }
        System.out.println("");
        for (int b = 2; b >= 0; b--) {
            if (b != 0) {
                System.out.print(fractional[b] + ",");
            } else {
                System.out.println(fractional[b]);
            }
        }

        System.out.println();
        int[] arbitrary = new int[3];
        arbitrary[0] = 10;
        arbitrary[1] = 20;
        arbitrary[2] = 30;
        for (int b = 0; b < arbitrary.length; b++) {
            if (b != 2) {
                System.out.print(arbitrary[b] + ",");
            } else {
                System.out.print(arbitrary[b]);
            }
        }
        System.out.println("");
        for (int b = 2; b >= 0; b--) {
            if (b != 0) {
                System.out.print(arbitrary[b] + ",");
            } else {
                System.out.println(arbitrary[b]);
            }
        }

        //Задча 4
        System.out.println();
        int[] numberNumber = new int[3];
        numberNumber[0] = 1;
        numberNumber[1] = 2;
        numberNumber[2] = 3;
        for (int i = 0; i < numberNumber.length; i++) {
            if (i != 2) {
                if(numberNumber[i] % 2 == 0){
                    System.out.print(numberNumber[i] + ",");
                } else {
                    System.out.print(numberNumber[i]+1 + ",");
                }
            } else {
                if(numberNumber[i] % 2 == 0){
                    System.out.print(numberNumber[i] + ",");
                } else {
                    System.out.print(numberNumber[i]+1);
                }
            }
        }
        System.out.println("");
        for (int b = 2; b >= 0; b--) {
            if (b != 0) {
                if (numberNumber[b] % 2 == 0) {
                    System.out.print(numberNumber[b] + ",");
                }else {
                    System.out.print(numberNumber[b]+1 + ",");
                }
            } else {
                if(numberNumber[b] % 2 == 0) {
                    System.out.print(numberNumber[b] + ",");
                } else{
                    System.out.print(numberNumber[b]+1);
                }
            }
        }

    }
}