
package kata3;

public class Kata3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Histogram<String>histDisplay=new Histogram();
        histDisplay.increment("ulpgc.es");
        histDisplay.increment("ull.es");
        histDisplay.increment("ulpgc.es");
        histDisplay.increment("ulpgc.es");
        histDisplay.increment("ull.es");
        histDisplay.increment("gmail.com");
        
        HistogramDisplay histogram= new HistogramDisplay("PRUEBA",histDisplay);
        histogram.execute();
        // TODO code application logic here
    }
    
}
