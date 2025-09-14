public class Main {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        // ========== PROTOTYPE ==========
        GraphicElement button1 = new GraphicElement("Rectangle", "Blue", 10, 20);
        GraphicElement button2 = button1.clone();
        button2.setX(40);
        button2.setY(60);

        System.out.println(button1);
        System.out.println(button2);

        long endTime = System.currentTimeMillis();
        System.out.println("Time taken: " + (endTime - startTime) + " ms");

        // ========== SINGLETON ==========
        AppConfig config1 = AppConfig.getInstance();
        AppConfig config2 = AppConfig.getInstance();

        System.out.println("Config1 theme: " + config1.getTheme());
        System.out.println("Config2 theme: " + config2.getTheme());

        // Cambiamos config1 y se refleja en config2
        config1.setTheme("Dark");

        System.out.println("Config1 theme after change: " + config1.getTheme());
        System.out.println("Config2 theme after change: " + config2.getTheme());

        // Verificar que son el mismo objeto
        System.out.println("config1 == config2 ? " + (config1 == config2));
    }
}
