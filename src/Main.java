import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random ran = new Random();
        int[] arr = new int[100];
        int a = 0; //50 < summasy
        int  counta = 0;
        int b = 0; //50 > summasy
        int countb = 0;
        for (int i = 0; i < 100; i++) {
            int san = ran.nextInt(100);
            arr[i] = san;
            if (arr[i]>50){
                b+=arr[i];
                countb++;
            }else if (arr[i]<50){
                a+=arr[i];
                counta++;
            }
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println(b/countb);
        System.out.println(a/counta);

    }
}