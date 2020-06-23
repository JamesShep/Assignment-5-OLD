import java.io.IOException;
import java.util.List;


public class RunnableApplication {

    public static void main(String[] args) throws IOException {
        UserService userService = new UserService();

        List<SalesData> salesData3 = userService.loadData("model3.csv");
        List<SalesData> salesDataS = userService.loadData("modelS.csv");
        List<SalesData> salesDataX = userService.loadData("modelX.csv");

        userService.showReport(salesData3, "Model 3");
        userService.showReport(salesDataS, "Model S");
        userService.showReport(salesDataX, "Model X");
    }
}
