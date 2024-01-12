public class Mobsters {
    public static void main(String[] args){
        System.out.println(eerieMob(9));
    }

    public static String eerieMob(int n){
        String result = "";
        if(n >= 1 && n <= 255){
            for(int i = 0; i < n; i++){
                if(i == Math.round(n/2)){
                    result += "(-_-)";
                }
                else if(i == 0){
                    result += "(-";
                }
                else if(i == n - 1){
                    result += "-)";
                }
                else if( i < n/2 && ((Math.round(n/2) - i) % 3 == 0)){
                    result += "(-_-";
                }
                else if(i < n/2){
                    result += "(-_";
                }
                else if (i > n / 2 && ((Math.round(n/2) - i) % 3 == 0)){
                    result += "-_-)";
                }
                else if(i > n/2){
                    result += "_-)";
                }
            }
        }
        else{
            result = "(O_o)";
        }
        return result;
    }
}
