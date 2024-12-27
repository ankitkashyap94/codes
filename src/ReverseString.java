public class ReverseString {
    public static void main(String[] args) {

        String name = "Ankit";
//        System.out.println(reverseStr(name));

        revStr(name);

    }

    public static StringBuilder reverseStr(String name) {
       String lowName = name.toLowerCase();
       StringBuilder rev = new StringBuilder(lowName);
       rev.reverse().toString();
       return rev;
    }

    public static void revStr(String name){

        char[] nameArr = name.toCharArray();
        for(int i=nameArr.length-1; i>=0; i--){
            System.out.print(nameArr[i]);
        }
    }

    public static void revStrUsingVar(String name){

        int lenStr = name.length();

        char[] nameArr = name.toCharArray();

        char ch;

        for(int i = 0; i<=lenStr; i++){

            

        }

    }
}