package controller;

//import interactor.FinancialReportRequest;
import interactor.FinancialReportRequester;
import interactor.FinancialReportResponse;
//import interactor.FinancialReportResponse;

public class FinancialReportController {
    private FinancialReportPresenter presenter;
    private FinancialReportRequester requester;

    public FinancialReportController(FinancialReportPresenter presenter, FinancialReportRequester requester) {
        this.presenter = presenter;
        this.requester = requester;
    }

    public void run(String view) {
        FinancialReportResponse response = requester.request();
        presenter.present(response);
    }
}
