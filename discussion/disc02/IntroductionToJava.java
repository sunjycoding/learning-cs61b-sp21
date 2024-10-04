package disc02;

/**
 * @author Created by sunjy on 10/3/24
 */
public class IntroductionToJava {

    public static void main(String[] args) {
        // 1. Our First Java Program
//        int size = 27;
//        String name = "Fido";
//        Dog myDog = new Dog(name, size);
//        Dog yourDog = new Dog("Scruffy", 1000);
//        Dog[] dogList = new Dog[3];
//        dogList[0] = myDog;
//        dogList[1] = yourDog;
//        dogList[2] = new Dog("Cutie", 8);
//        int x;
//        x = size - 5;
//        myDog.bark(8);

//        int[] inputArray = new int[]{3, 0, 4, 6, 3};
//        int k = 2;
//        System.out.println(mystery(inputArray, k));
//        mystery2(inputArray);
//        System.out.println(Arrays.toString(inputArray));

        System.out.println(fib(6));
    }

    // 2. Mystery
    public static int mystery(int[] inputArray, int k) {
        int x = inputArray[k];
        int answer = k;
        int index = k + 1;
        while (index < inputArray.length) {
            if (inputArray[index] < x) {
                x = inputArray[index];
                answer = index;
            }
            index = index + 1;
        }
        return answer;
    }

    public static void mystery2(int[] inputArray) {
        int index = 0;
        while (index < inputArray.length) {
            int targetIndex = mystery(inputArray, index);
            int temp = inputArray[targetIndex];
            inputArray[targetIndex] = inputArray[index];
            inputArray[index] = temp;
            index = index + 1;
        }
    }

    public static int fib(int n) {
        if (n == 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public static int fib2(int n, int k, int f0, int f1) {
        while (n > 0) {
            int temp = f1;
            f1 = f0 + f1;
            f0 = temp;
            n--;
        }
        return f0;
    }

}