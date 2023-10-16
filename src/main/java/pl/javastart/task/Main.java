package pl.javastart.task;

public class Main {

    public static void main(String[] args) {

        ArrayUtils arrayUtils = new ArrayUtils();
        double[] array1 = arrayUtils.arrayBuild();
        double squareSum = arrayUtils.sumSquare(array1);
        System.out.printf("Suma kwadratów wprowadzonych liczb to %.0f ", squareSum);

    }
}
