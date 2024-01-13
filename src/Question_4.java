public class Question_4 {
//    intially, n people are in circle, person 1 has knife he kills the adjacent person,
//    and pass on the knife to next adjacent clockwise person
    public static void main(String[] args) {
        int n= 11;
        int ans = alive(n);
        System.out.println("Ans : "+ans);
    }
    static int alive(int n){
        int nearesPowerof2 = nearestPowerof2(n);
        int kills = n - nearesPowerof2;
        int ans = kills*2+1;
        return ans;
    }
    static int nearestPowerof2(int n){
        int powerof2=1;
        for(int i=0;i<n;i++){
            if(n >= 1<<i) {
                powerof2 = 1 << i;
            }else {
                break;
            }
        }
        return powerof2;
    }
}
