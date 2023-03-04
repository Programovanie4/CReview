import java.lang.Math;
public class Digits {


    public static boolean odlisneCifry(int c){
        if (c>0 && c<10){
            return true;
        }
        String str= Integer.toString(c);
        int flag=0;
        for(int i=0;i<str.length();i++)
        {
            for(int j=i+1;j<str.length();j++)
            {
                if(str.charAt(i)==str.charAt(j) || str.charAt(j)=='0')
                {
                    flag=1;
                    break;
                }
            }
        }
        if(flag==0){
            return true;
        }
        else{
            return false;
        }
    }

    public static boolean dobrySucet(String cislo, int sucet){
        StringBuffer cislo2=new StringBuffer();
        cislo2.append(cislo);

        while (Integer.parseInt(String.valueOf(cislo2))>sucet && cislo2.length()>1){
            int suc=0;
            for(int i =0; i<cislo2.length();i++){
                suc+=Integer.parseInt(String.valueOf(cislo2.charAt(i)));
            }
            cislo2=new StringBuffer();
            cislo2.append(suc);
        }
        if (Integer.parseInt(String.valueOf(cislo2))==sucet){
            return true;
        }
        return false;
    }



    public static int calculate(int k, int b) {
        if (k>9){
            return -1;
        }
        String cislo="";
        for (int i1=1; i1<10;i1++){
            cislo=String.valueOf(i1);
            if (k == 1){
                if(dobrySucet(cislo,b)){
                    return Integer.valueOf(cislo);
                }
            }else{
                for (int i2=i1+1; i2<10;i2++){
                        cislo=""+i1+i2;
                        if (k==2){
                            if(dobrySucet(cislo,b)){
                                return Integer.valueOf(cislo);
                            }
                        }else{
                            for (int i3=i2+1; i3<10;i3++){
                                    cislo=""+i1+i2+i3;
                                    if (k==3){
                                        if(dobrySucet(cislo,b)){
                                            return Integer.valueOf(cislo);
                                        }
                                    }else{
                                        for (int i4=i3+1; i4<10;i4++){
                                                cislo=""+i1+i2+i3+i4;
                                                if (k==4){
                                                    if(dobrySucet(cislo,b)){
                                                        return Integer.valueOf(cislo);
                                                    }
                                                }else{
                                                    for (int i5=i4+1; i5<10;i5++){
                                                            cislo=""+i1+i2+i3+i4+i5;
                                                            if (k==5){
                                                                if(dobrySucet(cislo,b)){
                                                                    return Integer.valueOf(cislo);
                                                                }
                                                            }else{
                                                                for (int i6=i5+1; i6<10;i6++){
                                                                        cislo=""+i1+i2+i3+i4+i5+i6;
                                                                        if (k==6){
                                                                            if(dobrySucet(cislo,b)){
                                                                                return Integer.valueOf(cislo);
                                                                            }
                                                                        }else{
                                                                            for (int i7=i6+1; i7<10;i7++){
                                                                                cislo=""+i1+i2+i3+i4+i5+i6+i7;
                                                                                    if (k==7){
                                                                                        if(dobrySucet(cislo,b)){
                                                                                            return Integer.valueOf(cislo);
                                                                                        }
                                                                                    }else{
                                                                                        for (int i8=i7+1; i8<10;i8++){
                                                                                                cislo=""+i1+i2+i3+i4+i5+i6+i7+i8;
                                                                                                if (k==8){
                                                                                                    if(dobrySucet(cislo,b)){
                                                                                                        return Integer.valueOf(cislo);
                                                                                                    }
                                                                                                }else{
                                                                                                    for (int i9=i8+1; i9<10;i9++){
                                                                                                            cislo=""+i1+i2+i3+i4+i5+i6+i7+i8+i9;
                                                                                                            if (k==9){
                                                                                                                if(dobrySucet(cislo,b)){
                                                                                                                    return Integer.valueOf(cislo);
                                                                                                                }
                                                                                                            }else return -1;

                                                                        }

                                                                    }
                                                                }
                                                            }

                                                        }
                                                    }
                                                }

                                            }
                                        }
                                    }

                                }
                            }
                        }

                    }
                }

            }
        }

        /*for (int i=(int)Math.pow(10,k-1);i<=(int)Math.pow(10,k);i++){
            if (odlisneCifry(i)){

            }
        }*/
        return -1;
    }

    public static void main(String[] args) {
        //calculate(9,9);
        System.out.println(calculate(1, 9));
        System.out.println(calculate(3, 5));
        System.out.println(calculate(3, 5));
        System.out.println(calculate(4, 3));
    }
}
