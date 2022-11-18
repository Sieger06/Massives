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
        int[] numberMain = new int[3];
        numberMain[0] = 1;
        numberMain[1] = 2;
        numberMain[2] = 3;
        for (int i = 0; i < numberMain.length; i++) {
            if (i != 2) {
                if(numberMain[i] % 2 == 0){
                    System.out.print(numberMain[i] + ",");
                } else {
                    System.out.print(numberMain[i]+1 + ",");
                }
            } else {
                if(numberMain[i] % 2 == 0){
                    System.out.print(numberMain[i] + ",");
                } else {
                    System.out.print(numberMain[i]+1);
                }
            }
        }
        System.out.println("");
        for (int b = 2; b >= 0; b--) {
            if (b != 0) {
                if (numberMain[b] % 2 == 0) {
                    System.out.print(numberMain[b] + ",");
                }else {
                    System.out.print(numberMain[b]+1 + ",");
                }
            } else {
                if(numberMain[b] % 2 == 0) {
                    System.out.print(numberMain[b] + ",");
                } else{
                    System.out.print(numberMain[b]+1);
                }
            }
        }

    }
}