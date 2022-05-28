import controller.FinancialReportController;
import controller.FinancialReportPresenter;
import interactor.FinancialReportGenerator;
import interactor.FinancialReportRequester;
import presenters.PrintPresenter;
import presenters.ScreenPresenter;

public class Application {

    public static void main(String[] args) throws Exception {
        FinancialReportPresenter presenter;
        FinancialReportRequester requester = new FinancialReportGenerator();

        if (args[0].equals("screenview")) {
            presenter = new ScreenPresenter();
        } else if (args[0].equals("printview")) {
            presenter = new PrintPresenter();
        } else {
            throw new Exception();
        }

        FinancialReportController controller = new FinancialReportController(presenter, requester);

        controller.run(args[0]);
    }
}

