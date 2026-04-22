package javaCourse;

public class twoDarrays {
    public static void main(String[] args){

            // 2D array = An array where each element is an array
            //            Useful for storing matrix data

        String[] fruits =     {"apple", "orange", "banana"};
        String[] vegetables = {"potato", "onion", "carrot"};
        String[] meat =       {"chicken", "pork", "beef", "fish"};

        /*String[][] groceries = {{"apple", "orange", "banana"},
                                {"potato", "onion", "carrot"},
                                {"chicken", "pork", "beef", "fish"}} ;      */ // this method also would've worked

        String[][] groceries = {fruits, vegetables, meat};

        // to change anything we have to sue two brackets

        groceries[0][0] = "pineapple";
        groceries[1][0] = "celery";

        for (String[] foods: groceries){
            for (String food: foods){

                System.out.print(food + " ");
            }

            System.out.println();
        }
    }
}
