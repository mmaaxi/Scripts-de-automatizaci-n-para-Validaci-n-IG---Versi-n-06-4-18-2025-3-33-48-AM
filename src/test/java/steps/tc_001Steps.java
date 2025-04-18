import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import io.cucumber.java.en.*;

public class tc_001Steps {

    private WebDriver driver;
    private tc_001Page loginPage;

    public tc_001Steps() {
        // Aquí inicializarías el driver, por ejemplo usando WebDriverManager
        this.driver = /* inicialización del driver */;
        loginPage = PageFactory.initElements(driver, tc_001Page.class);
    }

    @Given("^el usuario está en la página de inicio de sesión$")
    public void el_usuario_está_en_la_página_de_inicio_de_sesión() {
        driver.get("URL_DE_LA_PAGINA_DE_INICIO_SESION");
    }

    @When("^el usuario ingresa \"([^\"]*)\" en el campo de usuario$")
    public void el_usuario_ingresa_en_el_campo_de_usuario(String username) {
        loginPage.enterUsername(username);
    }

    @And("^el usuario ingresa \"([^\"]*)\" en el campo de contraseña$")
    public void el_usuario_ingresa_en_el_campo_de_contraseña(String password) {
        loginPage.enterPassword(password);
    }

    @And("^el usuario hace clic en el botón 'Iniciar sesión'$")
    public void el_usuario_hace_clic_en_el_botón_Iniciar_sesión() {
        loginPage.clickLoginButton();
    }

    @Then("^el usuario es redirigido al panel principal$")
    public void el_usuario_es_redirigido_al_panel_principal() {
        // Assert para verificar que el usuario ha sido redirigido al dashboard
    }
}