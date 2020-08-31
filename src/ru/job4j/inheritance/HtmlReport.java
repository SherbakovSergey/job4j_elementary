package ru.job4j.inheritance;

public class HtmlReport extends TextReport {
    @SuppressWarnings("checkstyle:OperatorWrap")
    public String generate(String name, String body) {
        return "<h1>" + name + "</h1>"
                + "<br/>"
                + "<span>" + body + "</span>";
    }
}
