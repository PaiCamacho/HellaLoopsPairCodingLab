package hbcu.stay.ready.mastering_loops;

public class TableUtilities {
    public static String getLargeMultiplicationTable() {
       String result = "";

        for(int row = 1; row <= 10; ++row){
            for(int column = 1; column <= 10; ++column){
              if((row*column) <= 9){
                result += "  " + row*column + " |";
                }
                else if((row*column) >= 10 && (row*column) <= 99){
                    result += " " + row*column + " |";
                } 
                else if((row*column) >= 100){
                    result += row*column + " |";
                }
            }
            result += "\n";
        }
        return result;
    }
    public static String getSmallMultiplicationTable() {
        String str = "";
        for(int row = 1; row <= 5; row++){
            for(int column = 1; column <= 5; column++){
                if((row*column) <= 9){
                str += "  " + row*column + " |";
                }
                else if((row*column) >= 10){
                    str += " " + row*column + " |";
                }
            }
            str += "\n";
        }
        return str;
    }

    public static String getMultiplicationTable(int tableSize) {
        String str = "";
        for(int row = 1; row <= 20; row++){
            for(int column = 1; column <= 20; column++){
                if((row*column) <= 9){
                str += "  " + row*column + " |";
                }
                else if((row*column) >= 10 && (row*column) <= 99){
                    str += " " + row*column + " |";
                }
                else if((row*column) >= 100){
                    str += row*column + " |";
                }
            }
            str += "\n";
        }
        return str;
    }
}
