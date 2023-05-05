public class Main {
    public static void main(String[] args) {
        double[][] values1 = {{1, 2}, {3, 4}};
        double[][] values2 = {{5, 6}, {7, 8}};

        Matrix matrix1 = new Matrix(values1);
        Matrix matrix2 = new Matrix(values2);

        Matrix sum = matrix1.add(matrix2);
        Matrix product1 = matrix1.multiply(2);
        Matrix product2 = matrix1.multiply(matrix2);

        System.out.println("Матрица 1:");
        matrix1.print();

        System.out.println("Матрица 2:");
        matrix2.print();

        System.out.println("Сумма матриц:");
        sum.print();

        System.out.println("Матрица 1, умноженная на 2:");
        product1.print();

        System.out.println("Матрица 1, умноженная на матрицу 2:");
        product2.print();
    }
}
