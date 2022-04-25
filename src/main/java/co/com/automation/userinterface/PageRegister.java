package co.com.automation.userinterface;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PageRegister {

    public static final Target NOMBRE = Target.the("Nombre del usuario")
            .located(By.xpath("/html/body/section/div/div/div[2]/form/div[1]/div[1]/input"));
    public static final Target APELLIDO = Target.the("Apellido del usuario")
            .located(By.xpath("/html/body/section/div/div/div[2]/form/div[1]/div[2]/input"));
    public static final Target DIRECCION = Target.the("Dirección del usuario")
            .located(By.xpath("/html/body/section/div/div/div[2]/form/div[2]/div/textarea"));
    public static final Target CORREO = Target.the("Correo del usuario")
            .located(By.xpath("/html/body/section/div/div/div[2]/form/div[3]/div[1]/input"));
    public static final Target TELEFONO = Target.the("Telefono del usuario")
            .located(By.xpath("/html/body/section/div/div/div[2]/form/div[4]/div/input"));
    public static final Target CHECK_BOX_GENERO = Target.the("Check Genero del usuario")
            .located(By.xpath("/html/body/section/div/div/div[2]/form/div[5]/div/label[1]/input"));
    public static final Target CHECK_BOX_AFICION = Target.the("Check Apellido del usuario")
            .located(By.xpath("/html/body/section/div/div/div[2]/form/div[6]/div/div[2]/input"));
    public static final Target CONTENEDOR_IDIOMA = Target.the("Contenedor Idioma del usuario")
            .located(By.xpath("/html/body/section/div/div/div[2]/form/div[7]/div/multi-select/div[1]"));
    public static final Target IDIOMA = Target.the("Idioma del usuario")
            .located(By.xpath("/html/body/section/div/div/div[2]/form/div[7]/div/multi-select/div[2]/ul/li[1]"));
    public static final Target HABILIDADES = Target.the("Habilidiades del usuario")
            .located(By.xpath("/html/body/section/div/div/div[2]/form/div[8]/div/select"));
    public static final Target CONTENEDOR_PAIS = Target.the("Pais del usuario")
            .located(By.xpath("/html/body/section/div/div/div[2]/form/div[10]/div/span/span[1]/span"));
    public static final Target PAIS = Target.the("Pais del usuario")
            .located(By.xpath("/html/body/span/span/span[1]/input"));
    public static final Target ANO = Target.the("Ano del usuario")
            .located(By.xpath("/html/body/section/div/div/div[2]/form/div[11]/div[1]/select"));
    public static final Target MES = Target.the("Mes del usuario")
            .located(By.xpath("/html/body/section/div/div/div[2]/form/div[11]/div[2]/select"));
    public static final Target DIA = Target.the("Dia del usuario")
            .located(By.xpath("/html/body/section/div/div/div[2]/form/div[11]/div[3]/select"));
    public static final Target CLAVE1 = Target.the("Clave1 del usuario")
            .located(By.xpath("/html/body/section/div/div/div[2]/form/div[12]/div/input"));
    public static final Target CLAVE2 = Target.the("Clave2 del usuario")
            .located(By.xpath("/html/body/section/div/div/div[2]/form/div[13]/div/input"));
    public static final Target BUTTON_SUMIT = Target.the("Boton registrar datos")
            .located(By.xpath("/html/body/section/div/div/div[2]/form/div[14]/div/button[1]"));


}
