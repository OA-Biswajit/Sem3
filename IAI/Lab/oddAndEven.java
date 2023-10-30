// import java.util.*;
public class oddAndEven {
    public static void main(String[] args) {
        int array[][] = { { 1, 3, 4, 11 },
                { 2, 4, 4, 6 },
                { 3, 13, 23, 3 },
                { 1, 4, 3, 4 }

        };
          
    
int NewArray[][]=new int [4][2];
for (int i = 0; i < 4; i++) {
    int even = 0;
    int odd = 0;
    for (int j = 0; j < 4; j++) {
        if (array[i][j] % 2 == 0)
            even += array[i][j];
        else
            odd += array[i][j];

    }

    NewArray[i][0] = odd;
    NewArray[i][1] = even;

}
// System.out.println(Arrays.deepToString(NewArray));

for (int i = 0; i < 4; i++) {
    for (int j = 0; j < 2; j++) {
        System.out.print(NewArray[i][j] + " ");
        
    }
    System.out.println();
}
    }
}
