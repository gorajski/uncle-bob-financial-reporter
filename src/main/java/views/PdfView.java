package views;

import presenters.PrintView;

public class PdfView implements PrintView {

    @Override
    public String render() {
        return "PdfView rendered";
    }
}
