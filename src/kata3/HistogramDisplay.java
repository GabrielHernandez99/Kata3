package kata3;

//paquetes
import java.awt.Container;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;
//Clase principal
public class HistogramDisplay extends ApplicationFrame {
    //constructor con una String t
    public HistogramDisplay(String t){
    super(t);
    this.setContentPane(createPanel());
    this.pack();
    }

    private JPanel createPanel() {
       ChartPanel chartPanel= new ChartPanel(createChart(createDataset()));
       return chartPanel;
    }
    private JFreeChart createChart(DefaultCategoryDataset dataSet){
        JFreeChart chart=ChartFactory.createBarChart("JFree Histogram", "email domain","nºemails", dataSet, PlotOrientation.VERTICAL, false, false, rootPaneCheckingEnabled);
        return chart;
    }
    private DefaultCategoryDataset createDataset(){
        DefaultCategoryDataset dataSet =new DefaultCategoryDataset();
         dataSet.addValue(15,"","ull.es");
         dataSet.addValue(43,"","ulpgc.es");
         dataSet.addValue(21,"","gmail.com");
        return dataSet;
    }
    //execute para hacerlo visible
    public void execute(){
        this.setVisible(true);
    }
}
