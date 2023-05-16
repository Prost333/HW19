public class Main  {
    public static void main(String[] args) {
//task1.1
        Str str=getSTR1->{
            return getSTR1.toUpperCase();
        };
        System.out.println(str.getSTR("хочу спать"));


        Str str1= turn->{
            if (turn.length()>5){
                turn=new  StringBuilder(turn.substring(4)).reverse().toString();
            } else if (turn.length()<5) {
                turn=new StringBuilder(turn).reverse().toString();
            }
            return turn;
        };
        System.out.println(str1.getSTR("helloWorld"));

    }



}