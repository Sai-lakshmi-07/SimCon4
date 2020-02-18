public class Construction {
    String std;
    boolean automated;
    double tot_area;
    double h_c_cst;
    Construction(String x,double y,boolean z)
    {
        std=x;
        tot_area=y;
        automated=z;
    }
    double calculate()
    {
        if(!automated) {
            if (std == "Normal") {
                h_c_cst = tot_area * 1200;
            } else if (std == "Above") {
                h_c_cst = tot_area * 1500;
            } else if (std == "High") {
                h_c_cst = tot_area * 1800;
            }
        }
        else {
            h_c_cst = tot_area * 2500;
        }
        return h_c_cst;
    }



}
