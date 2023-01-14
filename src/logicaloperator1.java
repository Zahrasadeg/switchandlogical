public class logicaloperator1 {
    public static void main(String[] args) {
        boolean boughtcho=true;
        boolean boughtflowers=true;
        System.out.println(true||true);
        System.out.println(true||false);
        System.out.println(false||false);
        System.out.println(false||true|false|false);
        if(boughtcho||boughtflowers){
            System.out.println("i am happy");
        }
        else{
            System.out.println("i am sad");
        }
        boolean wifi=true;
        boolean fiveG=false;
        if(wifi||fiveG){
            System.out.println("you are good");
        }else{
            System.out.println("connect to wifi or 5G");
        }



    }
}
