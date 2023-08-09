

public class searchingin2darray {
//Finding too in 2d array return start index of too and end index of too
    public static void main(String []args) {
        int[][] matrix = {
                {'w', 'e', 'l', 'c', 'o'},
                {'m', 'e', 't', 'o', 'z'},
                {'o', 'h', 'o', 'c', 'o'},
                {'r', 'p', 'o', 'r', 'a'},
                {'t', 'i', 'o', 'n'}

        };

        String s="too";
        int len=s.length();
        for (int i = 0; i < matrix.length-1; i++) {
            for (int j = 0; j < matrix.length - 1; j++) {
                if (matrix[i][j] == 't') {
                    System.out.println("START INDEX= "+ i + "," + j);
                    len=len-1;
                    check(matrix,i,j,len);



                }
            }
        }

    }


    public static void check(int[][] mat,int i,int j,int l) {
        for (int p = 0; p < l; p++) {

            if (mat[i - 1][j] == 'o') {
                i = i - 1;
                System.out.println("INDEX "+ i + "," + j);



            }
            if (mat[i + 1][j] == 'o') {
                i = i + 1;

                System.out.println("INDEX "+ i + "," + j);



            }
            if (mat[i][j - 1] == 'o') {
                j = j - 1;

                System.out.println(" INDEX "+ i + "," + j);

            }

            if (mat[i][j + 1] == 'o') {
                j = j + 1;

                System.out.println(" INDEX "+ i + "," + j);



            }



        }
        System.out.println("END INDEX ="+ i + "," + j);
    }



    }







