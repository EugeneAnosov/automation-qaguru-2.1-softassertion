import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class SoftAssertionTest {

    @Test
    void checkCodeExampleTest() {

        open("https://github.com/selenide/selenide");
        $("[itemprop=name]").shouldHave(text("selenide"));

        $("[data-content=Wiki]").click();
        $("#wiki-pages-box").shouldHave(text("SoftAssertions"));

        $("#wiki-pages-box").$(byText("SoftAssertions")).click();
        $("#wiki-body").shouldHave(
                text("JUnit5"),
                text("@ExtendWith({SoftAssertsExtension.class})"));
    }
}
