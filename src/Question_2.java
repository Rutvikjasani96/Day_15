public class Question_2 {
//    given n elements, check if there exists majority element. an element with freq = n/3
    public static void main(String[] args) {
//        int[] array = {4,1,3,4,3,4,3,4,3};     // case 1 : both are mojority ele
        int[] array = {1,3,4,3,4,3,4,3,0};     // case 2 : ele2 is only majority ele
        int[] ans = majorityElenby3(array);
        System.out.println("ele1 : "+ans[0]);
        System.out.println("ele2 : "+ans[1]);
    }
    static int[] majorityElenby3(int[] array){
        int ele1 = array[0];
        int ele2 = array[0];
        int freq1 = 1;
        int freq2 = 1;
        int[] ans = {-1,-1};
        for(int i=1;i< array.length;i++){
            if(freq1==0){
                ele1 = array[i];
            }

            if(ele1==array[i]){
                freq1+=2;
            }

            if(ele1!=array[i]){
                freq1--;
            }
        }
        for(int i=1;i< array.length;i++){
            if(ele1!=array[i]){
                if(freq2==0){
                    ele2 = array[i];
                }
                if(ele2==array[i]){
                    freq2+=2;
                }
                if(ele2!=array[i]){
                    freq2--;
                }
            }
        }
        int cnt1=0;
        int cnt2=0;
        for(int i=0;i< array.length;i++){
            if(array[i]==ele1){
                cnt1++;
            }
            if(array[i]==ele2){
                cnt2++;
            }
        }
        if(cnt1 > array.length/3){
            ans[0] = ele1;
        }
        if(cnt2 > array.length/3){
            ans[1] = ele2;
        }
        return ans;
    }
}
