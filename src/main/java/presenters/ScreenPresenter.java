package presenters;

import controller.FinancialReportPresenter;
import interactor.FinancialReportResponse;
import models.ScreenViewModel;
import views.WebView;

public class ScreenPresenter implements FinancialReportPresenter {

    ScreenView view = new WebView();

    @Override
    public void present(FinancialReportResponse response) {
        System.out.println("\n--------------------");
        System.out.println("--------------------");
        System.out.println(view.render(new ScreenViewModel()));
        System.out.println("--------------------");
        System.out.println("--------------------");
    }
}
