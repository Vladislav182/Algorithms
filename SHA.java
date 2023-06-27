package Algoritmi;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SHA {

	public static char[] CurrBinaryString;
    public static char[] PrevBinaryString;
    public static char[] nameToCharArr;
    public static int currentDEC;
    public static char currentASCII;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String Name = scan.nextLine();
        nameToCharArr = Name.toCharArray();
        int lengthOfArr = nameToCharArr.length;
        int index = 0;
        for (int i = 0; i < lengthOfArr; i++) {
            int ascII = nameToCharArr[i];
            PrevBinaryString = new char[lengthOfArr];
            CurrBinaryString = new char[lengthOfArr];
            CurrBinaryString = Integer.toBinaryString(ascII).toCharArray();
            PrevBinaryString = Arrays.copyOf(CurrBinaryString, lengthOfArr);
            if (CurrBinaryString.length < 8) {
                while (CurrBinaryString.length < 8) {
                    addBytes();
                }
            }
            int rotations = 13;
            PrevBinaryString = Arrays.copyOf(CurrBinaryString, CurrBinaryString.length);
            rORANDShr(false, rotations);
            XOR();
            PrevBinaryString = Arrays.copyOf(CurrBinaryString, CurrBinaryString.length);
            rotations = 7;
            rORANDShr(false, rotations);
            XOR();
            int shifts = 3;
            rORANDShr(true, shifts);
            binToDec();
            decToASCII();
            asciiToNameCharArr(index);
            index++;
            System.out.println(Arrays.toString(CurrBinaryString));
            System.out.println(currentASCII);
            System.out.println("-----------------------");
            // System.out.println(Arrays.toString(nameToCharArr));
        }
        System.out.println(Arrays.toString(nameToCharArr));
    }

    public static void binToDec() {
        String currentBIN = String.valueOf(CurrBinaryString);

        currentDEC = Integer.parseInt(currentBIN, 2);
        if (currentDEC < 33 || currentDEC > 126) {
            Random random = new Random();
            int min = 33;
            int max = 127;
            currentDEC = random.nextInt(max - min + 1) + min;
        }
        System.out.println(currentDEC);
    }

    public static void decToASCII() {

        currentASCII = (char) currentDEC;
    }

    public static void asciiToNameCharArr(int index) {
        nameToCharArr[index] = currentASCII;
    }

    public static void XOR() {
        for (int i = 0; i < CurrBinaryString.length; i++) {
            if (CurrBinaryString[i] == PrevBinaryString[i]) {
                CurrBinaryString[i] = '0';
            } else {
                CurrBinaryString[i] = '1';
            }
        }
    }


    public static void rORANDShr(boolean rorOrSHR, int rotations) {
        if (!rorOrSHR) {

            for (int i = rotations; i > 0; i--) {
                char last = CurrBinaryString[CurrBinaryString.length - 1];
                for (int j = CurrBinaryString.length - 1; j > 0; j--) {
                    CurrBinaryString[j] = CurrBinaryString[j - 1];
                }
                CurrBinaryString[0] = last;
            }
        } else {
            for (int i = rotations; i > 0; i--) {
                for (int j = CurrBinaryString.length - 1; j > 0; j--) {
                    CurrBinaryString[j] = CurrBinaryString[j - 1];
                }
                CurrBinaryString[0] = '0';
            }

        }
    }

    public static void addBytes() {
        char ele = '0';
        int index = 0;
        char[] tempArray = new char[CurrBinaryString.length + 1];
        int j = 0;
        for (int i = 0; i < tempArray.length; i++) {
            if (i == index) {
                tempArray[i] = ele;
            } else {
                tempArray[i] = CurrBinaryString[j];
                j++;
            }
        }
        CurrBinaryString = tempArray;
    }

}
