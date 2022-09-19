package co.com.evalart.certification.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class DatosRegistro {
    public static final Target MNU_REGISTRO = Target.the("Menu opcion registro").locatedBy("//a[contains(text(),'REGISTER')]");
    public static final Target TXT_FIRST_NAME = Target.the("Entrada de texto donde se ingresa el nombre").locatedBy("//*[contains(@name,'firstName')]");
    public static final Target TXT_LAST_NAME = Target.the("Entrada de texto donde se ingresa el apellido").locatedBy("//*[contains(@name,'lastName')]");
    public static final Target TXT_PHONE = Target.the("Entrada de texto donde se ingresa el telefono").locatedBy("//*[contains(@name,'phone')]");
    public static final Target TXT_EMAIL = Target.the("Entrada de texto donde se ingresa el email").locatedBy("//*[contains(@id,'userName')]");
    public static final Target TXT_ADDRESS = Target.the("Entrada de texto donde se ingresa el direccion").locatedBy("//*[contains(@name,'address1')]");
    public static final Target TXT_CITY = Target.the("Entrada de texto donde se ingresa la ciudad").locatedBy("//*[contains(@name,'city')]");
    public static final Target TXT_STATE = Target.the("Entrada de texto donde se ingresa el estado").locatedBy("//*[contains(@name,'state')]");
    public static final Target TXT_POSTAL_CODE = Target.the("Entrada de texto donde se ingresa el codigo postal").locatedBy("//*[contains(@name,'postalCode')]");
    public static final Target TXT_COUNTRY = Target.the("Entrada de texto donde se ingresa el pais").locatedBy("//*[contains(@name,'country')]");
    public static final Target TXT_COUNTRY_OPTION = Target.the("Entrada de texto donde se ingresa el pais").locatedBy("//*[@name='country']//descendant::option[52]");
    public static final Target TXT_USER_NAME = Target.the("Entrada de texto donde se ingresa el nombre del usuario").locatedBy("//*[contains(@id,'email')]");
    public static final Target TXT_PASSWORD = Target.the("Entrada de texto donde se ingresa la contraseña").locatedBy("//*[contains(@name,'password')]");
    public static final Target TXT_CONFIRM_PASSWORD = Target.the("Entrada de texto donde se ingresa la confirmacion de la contaseña").locatedBy("//*[contains(@name,'confirmPassword')]");
    public static final Target BTN_ENVIAR = Target.the("Boton enviar regidtro").locatedBy("//*[contains(@name,'submit')]");
    public static final Target LBL_CONFIRMACION = Target.the("Mensaje de confirmacion de registro").locatedBy("//*[contains(text(),'Thank you for registering')]");
    public static final Target LBL_CONFIRMACION_REGISTRO = Target.the("Mensaje de confirmacion de registro").locatedBy("//*[contains(@src,'images/mast_register.gif')]");


}
