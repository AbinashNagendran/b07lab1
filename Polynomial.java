public class Polynomial {
    double [] coefficients; 

    public Polynomial(double[] coefficients) {
        this.coefficients = coefficients;
    }
    public Polynomial() {
        coefficients = new double[1];
    }
    public Polynomial add(Polynomial poly) {
        double [] new_poly = new double[Math.max(coefficients.length, poly.coefficients.length)];
        for (int i = 0; i < new_poly.length; i++) {
            if (i < coefficients.length)
            {
                new_poly[i] = coefficients[i];

            }
            if (i < poly.coefficients.length)
            {
                new_poly[i] = new_poly[i] + poly.coefficients[i];
            }

        }
        return new Polynomial(new_poly); 
    }
    public double evaluate(double x){
        double sum = 0;
        for (int i = 0; i < coefficients.length; i++) {
            sum = sum + coefficients[i] * Math.pow(x, i); 
        }
        return sum; 
    }
    public boolean hasRoot(double x){
         double sum = this.evaluate(x);
         if (sum == 0){
            return true;
         }
         return false;
    }

    
    

}