import java.util.*;
public class Replace{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String str = s.nextLine();
        String r ="";
        for(char c : str.toCharArray()){
            if(c >='a' && c<='z'){
                int x = c;
                x = ((int)x+1)%128;
                if(x==0){
                    x=97;
                }  
                  char x1 = (char)x;
                    if(!(x1 == 'a' ||x1 == 'e' ||x1 == 'i' ||x1 == 'o' ||x1 == 'u')){
                        r+=x1;
                    }
            }else{
                r+=c;
            }
        }
        System.out.println(r);
        s.close();
    }
}