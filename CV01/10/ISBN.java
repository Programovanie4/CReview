 
 
public class ISBN {
    public static boolean isbn(String isbn){
        System.out.println(isbn);
        String fixed = "";
        boolean cisla_zacali = false;
        for(int i = 0;i<isbn.length();i++){
            if(isbn.charAt(i)=='i'){
                if ((isbn.charAt(i+1)!='s')||(isbn.charAt(i+2)!='b')||(isbn.charAt(i+3)!='n')){
                    return false;
                }
            }
            if(isbn.charAt(i)=='I'){
                if ((isbn.charAt(i+1)!='S')||(isbn.charAt(i+2)!='B')||(isbn.charAt(i+3)!='N')){
                    return false;
                }
                if(isbn.charAt(i+4)=='-'&&isbn.charAt(i+5)=='1'&&isbn.charAt(i+6)=='3'){
                    i = i+6;
                    continue;
                }
            }
            if((isbn.charAt(i)>=48 && isbn.charAt(i)<=57)||(isbn.charAt(i)=='X')||(isbn.charAt(i)=='x')){
                if(isbn.charAt(i)=='X'||isbn.charAt(i)=='x'){
                    fixed+='X';
                }else {
                    fixed+=isbn.charAt(i);
                    cisla_zacali = true;
                }
            }
            if(cisla_zacali && (isbn.charAt(i)<48 || isbn.charAt(i)>57) && isbn.charAt(i)!='-' && isbn.charAt(i)!=' ' &&isbn.charAt(i)!='X'&&isbn.charAt(i)!='x'){
                return false;
            }
        }
        if(fixed.length()<10){
            return false;
        }
        isbn = fixed;
        if(isbn==""){
            return false;
        }
        int sum = 0;
        if(fixed.length()>10){
            for(int i = 0;i<12;i++){
                if(i%2==0){
                    if(isbn.charAt(i)=='X'){
                        sum+=10;
                    }else {
                        sum+= (isbn.charAt(i)-'0');
                    }
 
                }else {
                    if(isbn.charAt(i)=='X'){
                        sum+=30;
                    }else {
                        sum+= (isbn.charAt(i)-'0')*3;
                    }
                }
            }
            int rem = sum%10;
            if(rem!=0){
                rem = 10 - rem;
            }
            if(rem==(isbn.charAt(12)-'0')){
                return true;
            }
            return false;
        }else {
            for(int i = 0;i<10;i++){
                if (isbn.charAt(i)=='X'){
                    sum+= (10)*(10-i);
                }else {
                    sum+= (isbn.charAt(i)-'0')*(10-i);
                }
            }
            if(sum%11==0){
                return true;
            }
            return false;
        }
    }
 
    public static void main(String[] args){
        System.out.println(isbn("ISBN: 1-61729-120-X"));
    }
}