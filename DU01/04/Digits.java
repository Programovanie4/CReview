
public class Digits {

    public static int calculate(int k, int b) {
        var numbers = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
        if (k > 9){
            return -1;
        }
        var min = new int[] {999999999};
        generatePermutations(numbers, 0, k, b, min);
        if (min[0] == 999999999){
            return -1;
        }
        return min[0];
    }
    // ChatGPT mi pomohol v generovani vsetkych permutacii. Ponukol mi takyto rekurzivny sposob utriedenia pola
    // s cislami od 1 po 9 kde sa pred kazdym rekurzivnym volanim swapnu dva prvky pola a potom funkcia zavola
    // samu seba s novym polom s tymito swapnutymi prvkami, po navrate z rekurzie sa vrati pole do stavu pred swapom.
    // https://chat.openai.com/chat/c46d1cd2-0c34-46ba-9060-737bc494a125
    public static void generatePermutations(int[] array, int index, int size, int lookingFor, int[] min) {
        if (min[0] != 999999999){
            return;
        }
        if (index == size || index == 8) {
            int number = 0;
            for (int i = 0; i < size; i++){
                number += array[size-1-i] * (Math.pow(10, i));
            }
            int theNumber = number;
            while ((number / 10 ) > 0){
                int copy = number;
                int helper = 0;
                while (copy > 0){
                    helper += copy % 10;
                    copy /= 10;
                }
                number = helper;
            }


            if (number == lookingFor){
                if (theNumber < min[0]){
                    min[0] = theNumber;
                    return;
                }
            }
        }
        for (int i = index; i < array.length; i++) {

            int temp = array[index];
            array[index] = array[i];
            array[i] = temp;

            generatePermutations(array, index + 1, size, lookingFor, min);

            temp = array[index];
            array[index] = array[i];
            array[i] = temp;
        }
    }

    public static void main(String[] args) {
        System.out.println(Digits.calculate(1, 9));
        System.out.println(Digits.calculate(2, 5));         // lebo 1+4=5
        System.out.println(Digits.calculate(3, 5));        // lebo 1+4+9=14 => 1+4 = 5
        System.out.println(Digits.calculate(4, 3));       // lebo 1+2+3+6 = 12 => 1+2 = 3
    }
}
