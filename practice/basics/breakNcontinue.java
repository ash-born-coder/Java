package javaCourse;

public class breakNcontinue {
    public static void main(String[] args){

        // break    = break out of the loop (STOP)
        // continue = skip current iteration of a loop (SKIP)

        for (int i = 0; i < 10; i++){

            System.out.print(i + " ");
        }

        System.out.println();

        for (int j = 0; j < 10; j++){

            if (j == 5){

                break;

            }

            System.out.print(j + " ");

        }
        System.out.println();

        for (int k = 0; k < 10; k++){

            if (k == 5){
                continue;
            }
            System.out.print(k + " ");
        }

    }

}
