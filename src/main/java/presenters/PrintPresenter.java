package presenters;

import controller.FinancialReportPresenter;
import interactor.FinancialReportResponse;
import views.PdfView;
import models.PrintViewModel;

public class PrintPresenter implements FinancialReportPresenter {

    PrintView view = new PdfView();

    @Override
    public void present(FinancialReportResponse response) {
        System.out.println("\n-------------------");
        System.out.println("-------------------");
        System.out.println(view.render(new PrintViewModel()));
        System.out.println("-------------------");
        System.out.println("-------------------");
    }
}
