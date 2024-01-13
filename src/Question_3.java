public class Question_3 {
//    given n, how many perfect squares[1...n]
    public static void main(String[] args) {
        int n=25;
        int ans = 0;
        for(int i=1;i<n;i++){
            if(i*i==n){
                ans = i;
                break;
            }
        }
        System.out.println("Ans : "+ans);
    }
}
