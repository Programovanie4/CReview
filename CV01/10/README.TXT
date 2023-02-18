toto je kod velmi nachylny na tazko odhalitelnu chybu
nepouzivate znaky, ale ich ascii kody,
nebezpecna manipulacia s indexami
velmi malo a zle citatelny kod

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