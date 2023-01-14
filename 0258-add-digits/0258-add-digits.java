class Solution {
    public int addDigits(int num) {
        int number =0;
        while(num>0){
            number+=num%10;
            num=num/10;
            if(num==0 && number>9){
                num=number;
                number=0;
            }
        }
        return number;
    }
}