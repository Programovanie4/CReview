1) pri vsetkej ucte, pri tomto kode si nemozete byt ista, ci ste nezabudla nejaku podmienku,
   ak je v tomto kode chyba, velmi tazko ho najdete
   
2) COPY-PASTE je smrt programatora, vzdy ked vas laka Ctrl-V/Ctrl-C, zamyslite sa, ci inak by to neslo.
   obycajte to trcho boli, lebo casto je tam "abstrakcia", a tu ste napriklad mohli prist na to, ze miesto
   copy-paste, by tam mohla byt rekurzia, ktora by to poriesila.
   
3) toto je tiez velmi tricky, 
    if (a==5 || b==5 || c==5 || d==5 || e==5 || f==5 || g==5)
    vlastne ste chceli zistit, ci sa tam 5ka nachadza...
    co tak if ((""+a+b+c+d+e+f+g).contains('5')) ...
    kratsie, mozno prehladnejsie..
    
4) co by ste robili, keby cifier bolo 8, 9 ? viac vnorenych cyklov ?
   lenze pocet podmienok cifra1 == cifra2 rastie kvadraticky...
   tada pre 7 ich je 7 nad 2=21. ale pre 9 ich je 9 nad 2=36 
   viac kodu, viacsia sanca na chybu.
   a ked kod rastie exponencialne, je to exponencialna katastrofa.
   