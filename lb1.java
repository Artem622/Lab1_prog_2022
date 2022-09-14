import java.text.DecimalFormat;

public class lb1 {
    public static void main(String[] args) {

        int par = 6;
        int[] a = new int[7];

        for (int i = 0; i < a.length; i++) {
            a[i] = par;
            par += 2;
        }

        float[] x = new float[13];
        float max = 7.0F;
        float min = -3.0F;

        for (int i = 0; i < x.length; i++) {
            double random = min + Math.random() * (max - min);
            float randomius = (float) random;
            x[i] = randomius;
        }

        double[][] t = new double[7][13];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < x.length; j++) {
                double X = x[j];
                if (a[i] == 12) {
                    t[i][j] = Math.log(Math.pow(Math.sin(Math.tan(Math.pow(X,1./3.))),2));
                } else if (a[i] == 8 | a[i] == 14 | a[i] == 18) {
                    t[i][j] = Math.log(Math.pow(((Math.pow(Math.sin(X),2) + 1) / Math.pow((3 / Math.abs(X) ), 2)) , Math.pow((((0.5 / (X + 1) - 3 / 4)) / 0.5),2)));
                }else{
                    t[i][j] = 1/4 * (Math.pow((Math.tan((Math.pow(X, (1/3)/X)))), ((Math.pow(((1/4)/(X - 1)*(Math.pow(Math.E,X))),Math.sin(X))) / 2)));
                }
                DecimalFormat df = new DecimalFormat("#.##");
                System.out.print(df.format( t[i][j])+ "\t");
            }
            System.out.println();

        }
    }
}
