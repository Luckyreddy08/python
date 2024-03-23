public class Hi1 {  
    public static void main(String[] args) {  
        int[] ar1 = {1, 2, 3};  
        int[] ar2 = {4, 5, 6};  
        int[] ar3 = new int[3];  
        for (int i = 0; i < 3; i++) {  
            ar3[i] = ar1[i] * ar2[i];  
        }    
        System.out.print("Sum Array: ");  
        for (int i=0;i<3;i++) {  
            System.out.print(ar3[i] + " ");  
        }  
    }  
}  