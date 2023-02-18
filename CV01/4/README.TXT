1) toto je uz skoro kandidat na cyklus, lenze skoncilo to ako copy-paste
        number0 = number0.replaceFirst("1", ""); //replace 1. výskyt každej cifry
        number0 = number0.replaceFirst("2", "");
        number0 = number0.replaceFirst("3", "");
        number0 = number0.replaceFirst("4", "");
        number0 = number0.replaceFirst("5", "");
        number0 = number0.replaceFirst("6", "");
        number0 = number0.replaceFirst("7", "");
        number0 = number0.replaceFirst("8", "");
        number0 = number0.replaceFirst("9", "");

   for(ch = '1'; ch <= '9'; ch++)
        number0 = number0.replaceFirst(""+ch, "");
        
2) a ked uz to nie je cyklus, takto je to kusok elegantnejsie, maly kusok...        
        number0 = number0.replaceFirst("1", "") //replace 1. výskyt každej cifry
                         .replaceFirst("2", "")
                         .replaceFirst("3", "")
                         .replaceFirst("4", "")
                         .replaceFirst("5", "")
                         .replaceFirst("6", "")
                         .replaceFirst("7", "")
                         .replaceFirst("8", "")
                         .replaceFirst("9", "");

3) dalsia moznost je regexp, ale to sme este nemali...