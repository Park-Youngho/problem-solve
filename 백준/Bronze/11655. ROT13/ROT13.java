import java.util.*;


class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'){
                char c = (char)((s.charAt(i) - 'A' + 13) % 26 + 'A');
                System.out.print(c);
            }
            else if(s.charAt(i) >='a' & s.charAt(i) <='z'){
                char c = (char)((s.charAt(i) - 'a' + 13) % 26 + 'a');
                System.out.print(c);
            }
            else System.out.print(s.charAt(i));
        }
    }
}