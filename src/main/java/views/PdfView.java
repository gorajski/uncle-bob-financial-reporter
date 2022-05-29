package views;

import models.PrintViewModel;
import presenters.PrintView;

public class PdfView implements PrintView {

    @Override
    public String render(PrintViewModel model) {
        return "This is the model contents" + model.toString();
    }
}
