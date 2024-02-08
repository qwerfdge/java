package main.java.ua.brekher.hw14;

public class HtmlTasks {
    public static void main(String[] args) {

        String title = "<title>Вивчаємо HTML</title>\n";


        String headings = "<h1>Головний заголовок</h1>\n" +
                "<p>Параграф, який розповідає про основну ідею сайту чи програми</p>\n" +
                "<p>Параграф, який розповідає про основну ідею сайту чи програми</p>\n" +
                "<p>Параграф, який розповідає про основну ідею сайту чи програми</p>\n" +
                "<h2>Підзаголовок</h2>\n" +
                "<p>Параграф, який відноситься до підзаголовка</p>\n" +
                "<p>Параграф, який відноситься до підзаголовка</p>\n" +
                "<p>Параграф, який відноситься до підзаголовка</p>\n" +
                "<h3>Другий підзаголовок</h3>\n" +
                "<p>Параграф, який відноситься до другого підзаголовка</p>\n" +
                "<p>Параграф, який відноситься до другого підзаголовка</p>\n" +
                "<p>Параграф, який відноситься до другого підзаголовка</p>\n" +
                "<h3>Третій підзаголовок</h3>\n" +
                "<p>Параграф, який відноситься до підзаголовка</p>\n" +
                "<p>Параграф, який відноситься до підзаголовка</p>\n" +
                "<p>Параграф, який відноситься до підзаголовка</p>\n";


        String numberedList = "<ol>\n" +
                "<li>Елемент 1</li>\n" +
                "<li>Елемент 2</li>\n" +
                "<li>Елемент 3</li>\n" +
                "</ol>\n";


        String bulletedList = "<ul>\n" +
                "<li>Елемент 1</li>\n" +
                "<li>Елемент 2</li>\n" +
                "<li>Елемент 3</li>\n" +
                "</ul>\n";


        String nestedList = "<ol>\n" +
                "<li>Нумерований елемент 1\n" +
                "<ul>\n" +
                "<li>Маркований елемент 1</li>\n" +
                "<li>Маркований елемент 2</li>\n" +
                "<li>Маркований елемент 3</li>\n" +
                "</ul>\n" +
                "</li>\n" +
                "<li>Нумерований елемент 2</li>\n" +
                "<li>Нумерований елемент 3</li>\n" +
                "</ol>\n";


        String form = "<form>\n" +
                "<input type=\"text\" placeholder=\"Login\">\n" +
                "<input type=\"password\" placeholder=\"Password\">\n" +
                "<textarea placeholder=\"Your message\"></textarea>\n" +
                "<input type=\"submit\" value=\"Send\">\n" +
                "</form>\n";


        String table = "<table>\n" +
                "<caption>Основна інформація</caption>\n" +
                "<thead>\n" +
                "<tr>\n" +
                "<th>Заголовок 1</th>\n" +
                "<th>Заголовок 2</th>\n" +
                "<th>Заголовок 3</th>\n" +
                "<th>Заголовок 4</th>\n" +
                "</tr>\n" +
                "</thead>\n" +
                "<tbody>\n" +
                "<tr>\n" +
                "<td>Дані 1</td>\n" +
                "<td>Дані 2</td>\n" +
                "<td>Дані 3</td>\n" +
                "<td>Дані 4</td>\n" +
                "</tr>\n" +
                "</tbody>\n" +
                "</table>\n";


        String indentedText = "<pre>\n" +
                "function toCelsius(fahrenheit) {\n" +
                "    return (5/9) * (fahrenheit-32);\n" +
                "}\n" +
                "document.getElementById(\"demo\").innerHTML = toCelsius;\n" +
                "</pre>\n";


        String favoriteQuote = "<blockquote>Цитата</blockquote>\n";
    }
}
 // Вив

