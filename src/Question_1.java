public class Question_1 {
//    given n positive elements, find majority element
    public static void main(String[] args) {
        int[] array = {1, 2, 1, 6, 1, 1};    // case 1 : ans = 1
//        int[] array = {4,6,5,3,4,5,6,4,4,4};     // case 2 : ans = -1
        int ans = majorityEle(array);
        System.out.println("Ans : "+ans);
    }
    static int majorityEle(int[] array){
        int ele=array[0];
        int freq=1;
        int ans=-1;
        for(int i=1;i< array.length;i++){
            if(freq==0){
                ele = array[i];
                freq=1;
            }
            if(array[i]==ele){
                freq++;
            }
            if(array[i]!=ele){
                freq--;
            }
        }
        int cnt=0;
        for(int i=0;i< array.length;i++){
            if(ele == array[i]){
                cnt++;
            }
        }
        if(cnt> array.length/2){
            ans = ele;
        }
        return ans;
    }
}
