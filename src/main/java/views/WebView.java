package views;

import models.ScreenViewModel;
import presenters.ScreenView;

public class WebView implements ScreenView {

    @Override
    public String render(ScreenViewModel model) {
        return "<h1>Report Contents</h1>\n" +
                "<div>" + model.toString() + "</div>\n" +
                "<footer>Report End<footer>";
    }
}
