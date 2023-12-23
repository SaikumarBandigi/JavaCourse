package practise_stream;

public class Practise {

    public static void main(String[] args) {

    }
    public boolean searchMatrix(int[][] matrix, int target) {

        for (int[] ints : matrix) {
            for (int anInt : ints) {
                if (anInt == target) {
                    return true;
                }
            }
        }
        return false;

    }}
