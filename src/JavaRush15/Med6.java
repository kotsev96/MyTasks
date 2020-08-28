package JavaRush15;

public class Med6 {
    public static void main(String[] args) {
        printMatrix(2, 3, "8");
    }

    public static void printMatrix(int m, int n, String value) {
        System.out.println("Заполняем объектами String");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, int n, Object value) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }
    public static void printMatrix(int m, int n, Object value, int s){

    }
    public static void printMatrix(int m, int n, Object value, int s, int q){

    }
    public static void printMatrix(int m, int n, Object value, int s, int q, int a){

    }
    public static void printMatrix(int m, int n, Object value, int s, int q, int a, int r){

    }
    public static void printMatrix(int m, int n, Object value, int s, int q, int a, int r, double w){

    }
    public static void printMatrix(int m, int n, Object value, int s, int q, int a, int r, double w, double p){

    }
    public static void printMatrix(int m, int n, Object value, int s, int q, int a, int r, double w, double p, double g){

    }
    public static void printMatrix(int m, int n, Object value, int s, int q, int a, int r, double w, double p, double g, long l){

    }
}
