import java.util.Scanner;

public class DiffBtwMaxOfEvenMinOfOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sizeOfArray = sc.nextInt();
        int[] arr = new int[sizeOfArray];
        int evenSize = 0, oddSize = 0;
        for(int i = 0; i<sizeOfArray;i++)
        {
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i<sizeOfArray;i++)
        {
            if(arr[i] % 2 == 0)
            {
                evenSize++;
            }
            else
            {
                oddSize++;
            }
        }
        int[] evenArr = new int[evenSize];
        int[] oddArr = new int[oddSize];
        int even = 0, odd = 0;
        for(int j = 0; j<arr.length;j++)
        {
            if(arr[j] % 2 == 0)
            {
                evenArr[even++] = arr[j];
            }
            else
            {
                oddArr[odd++] = arr[j];
            }
        }
        int minOfOdd = oddArr[0], maxOfEven = evenArr[0];
        for(int j = 1; j<=oddArr.length-1;j++)
        {
            if(minOfOdd > arr[j])
            {
                minOfOdd = arr[j];
            }
        }
        for(int j = 1; j<=evenArr.length-1;j++)
        {
                
            if (maxOfEven < arr[j])
            {
                maxOfEven = arr[j];
            }
        }
        sc.close();
    }
}
