public class RockPaperScissors {
    //A-Kameň, B-Papier, C-Nožnice
    //X-Kameň, Y-Papier, Z-Nožnice
    public static int tournamentA(String input) {
        String[] games = input.split(";");
        int sum = 0;
        for (String g : games) {
            String[] parts = g.split(",");
            String first = parts[0];
            String second = parts[1];
            //kamen
            if(first.equals("A") &&second.equals("X")){
                sum += 4;
            }
            if((first.equals("A") &&second.equals("Y"))){
                sum += 8;
            }
            if(first.equals("A") &&second.equals("Z")){
                sum += 3;
            }
            //papier
            if(first.equals("B") &&second.equals("Z")){
                sum+=9;
            }
            if(first.equals("B") &&second.equals("Y")){
                sum += 5;
            }
            if(first.equals("B") &&second.equals("X")){
                sum += 1;
            }
            //noznice
            if(first.equals("C") &&second.equals("Z")){
                sum += 6;
            }
            if(first.equals("C") &&second.equals("Y")){
                sum += 2;
            }
            if(first.equals("C") &&second.equals("X")){
                sum += 7;
            }
        }
        return sum;
    }
    //A-Kameň, B-Papier, C-Nožnice
    //X-Kameň, Y-Papier, Z-Nožnice
    public static int tournamentB(String input){
        String[] games = input.split(";");
        int sum = 0;
        for (String g : games) {
            String[] parts = g.split(",");
            String first = parts[0];
            String second = parts[1];
            //prehra
            switch (second) {
                case "X" -> {
                    if (first.equals("A"))
                        sum += 3;
                    if (first.equals("C"))
                        sum += 2;
                    if (first.equals("B"))
                        sum += 1;
                }
                //remiza
                case "Y" -> {
                    if (first.equals("A"))
                        sum += 4;
                    if (first.equals("B"))
                        sum += 5;
                    if (first.equals("C"))
                        sum += 6;
                }
                //vyhra
                case "Z" -> {
                    if (first.equals("A"))
                        sum += 8;
                    if (first.equals("B"))
                        sum += 9;
                    if (first.equals("C"))
                        sum += 7;
                }
            }
    }
        return sum;
}
}
