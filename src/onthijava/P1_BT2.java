package onthijava;
public class P1_BT2 {
    
    // Câu a
    static boolean checkN(int n) {
        return (n%2==0 && n%3==0);
    }
    
    // Câu b
    public static void main(String[] args) {
        int i = 1000, cur = 1;
        System.out.println("DANH SACH 1000 SO CHAN CHIA HET CHO 3:");
        while(i!=0){
            if(checkN(cur)){
                System.out.println(cur);
                i--;
            }
            cur++;
        }
    }
}
