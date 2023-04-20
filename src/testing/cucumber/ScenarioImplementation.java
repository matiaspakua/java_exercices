package testing.cucumber;

class ScenarioImplementation {

	@Given("^que el usuario está en la página de inicio$")
	public void que_el_usuario_está_en_la_página_de_inicio() {
		// Abre la página de inicio en el navegador
		driver.get("https://www.example.com/");
	}
}