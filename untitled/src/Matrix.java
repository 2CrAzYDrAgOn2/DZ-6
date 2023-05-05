public class Matrix {
    private double[][] values;
    private int rows;
    private int cols;

    public Matrix(double[][] values) {
        this.values = values;
        this.rows = values.length;
        this.cols = values[0].length;
    }

    public void print() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(values[i][j] + " ");
            }
            System.out.println();
        }
    }

    public Matrix add(Matrix other) {
        if (rows != other.rows || cols != other.cols) {
            throw new IllegalArgumentException("Матрицы должны иметь одинаковые размеры");
        }

        double[][] result = new double[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = values[i][j] + other.values[i][j];
            }
        }

        return new Matrix(result);
    }

    public Matrix multiply(double scalar) {
        double[][] result = new double[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = values[i][j] * scalar;
            }
        }

        return new Matrix(result);
    }

    public Matrix multiply(Matrix other) {
        if (cols != other.rows) {
            throw new IllegalArgumentException("Количество столбцов первой матрицы должно равняться количеству строк второй матрицы");
        }

        double[][] result = new double[rows][other.cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < other.cols; j++) {
                double sum = 0.0;
                for (int k = 0; k < cols; k++) {
                    sum += values[i][k] * other.values[k][j];
                }
                result[i][j] = sum;
            }
        }

        return new Matrix(result);
    }
}
