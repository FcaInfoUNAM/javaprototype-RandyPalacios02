
public class AppConfig {
    // Instancia única creada al cargar la clase
    private static final AppConfig instance = new AppConfig();

    private String theme;
    private String language;

    // Constructor privado → nadie puede hacer new AppConfig()
    private AppConfig() {
        this.theme = "Light";
        this.language = "ES";
    }

    // Método estático para obtener la instancia
    public static AppConfig getInstance() {
        return instance;
    }

    // Getters y Setters
    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
