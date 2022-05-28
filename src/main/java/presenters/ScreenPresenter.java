package presenters;

import controller.FinancialReportPresenter;
import interactor.FinancialReportResponse;
import views.WebView;

public class ScreenPresenter implements FinancialReportPresenter {

    ScreenView view = new WebView();

    @Override
    public void present(FinancialReportResponse response) {
        System.out.println("\n--------------------");
        System.out.println("--------------------");
        System.out.println(view.render());
        System.out.println("--------------------");
        System.out.println("--------------------");
    }
}
