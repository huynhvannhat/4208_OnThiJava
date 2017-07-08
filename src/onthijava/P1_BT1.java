package onthijava;
public class P1_BT1 {
    
    // Câu a
    static boolean checkSNT(int a) {
        if(a<2) return false;
        for(int i=2; i<=Math.sqrt(a); i++){
            if(a%i==0) return false;
        }
        return true;
    }
    
    // Câu b
    public static void main(String[] args) {
        int i = 1000, cur = 1;
        System.out.println("DANH SACH 1000 SO NGUYEN TO DAU TIEN:");
        while(i!=0){
            if(checkSNT(cur)){
                System.out.println(cur);
                i--;
            }
            cur++;
        }
    }
}
