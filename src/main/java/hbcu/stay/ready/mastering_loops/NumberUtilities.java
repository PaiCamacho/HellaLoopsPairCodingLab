package hbcu.stay.ready.mastering_loops;


public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
        String str = "";
        for(int i = start; i < stop; i++){
            if(i % 2 == 0){
                str += i;
            }
        }
        return str;
    }


    public static String getOddNumbers(int start, int stop) {
        String str = "";
        for(int i = start; i < stop; i++){
            if(i % 2 != 0)
            {
                str += i;
            }
        }
        return str;
        
    }
    


    public static String getSquareNumbers(int start, int stop, int step) {
        String str = "";
        for(int i = start; i < stop; i++){
            if(i % 5 == 0){
                str += i*i;
            }
        }
        return str;
    }

    public static String getRange(int start) {
        String str = "";
        for(int i = 0; i < start; i++){
            str += i;
        }
        return str;
    }

    public static String getRange(int start, int stop) {
        String str = "";
        for(int i = start; i < stop; i++){
            str += i;
        }
        return str;
    }


    public static String getRange(int start, int stop, int step) {
        String str = "";
        for(int i = start; i < stop; i++){
            if(i % step == 0){
            str += i;
            }
        }
        return str;
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        String str = "";
        for(int i = start; i < stop; i++){
            if(i % step == 0){
                str += (int) Math.pow(i, exponent);
            }
        }
        return str;
    }
}
