package hbcu.stay.ready.mastering_loops;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        String str = "";
        for(int i = 1; i < numberOfRows; i++){
            for(int j = 0; j < i; j++){
                str += "*";
            }
            str += "\n";
        }
        return str;   
}
    public static String getRow(int numberOfStars) {
        String str = "";
        for(int i = 1; i <= numberOfStars; i++){
            str += "*";    
        }
        return str;
    }

    public static String getSmallTriangle() {
        String triangle = "";
        for(int row = 1; row <= 4; row++){
            for(int column = 0; column < row; column++){
                triangle += "*";
            }
            triangle += "\n";
        }
        return triangle;
    }

    public static String getLargeTriangle() {
        String triangle = "";
        for(int row = 1; row <= 9; row++){
            for(int column = 0; column < row; column++){
                triangle += "*";
            }
            triangle += "\n";
        }
        return triangle;
    }
}
