package onthijava;
public class P1_BT3 {
    
    // Câu a
    static boolean checkN(int n) {
        return (n%2==0 && n%3==0);
    }
    
    // Câu b
    public static void main(String[] args) {
        
        int[] a = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        System.out.println("DANH SACH SO CHAN CHIA HET CHO 3 TRONG DAY:");
        for(int i=0; i<a.length;i++){
            if(checkN(a[i])){
                System.out.println(a[i]);
            }
        }
    } 
}
