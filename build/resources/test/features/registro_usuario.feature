#Marilyn Tenorio Melenje
#language: es

Característica: Verificar que un usuario pueda registarse en el portal web
  Yo como usuario del portal web
  Necesito registarme en el portal
  Para realizar una reserva

  Antecedentes:
    Dado que el usuario "Cliente" ingresa al portal web

  @RegistroExitoso
  Esquema del escenario: Registar usuario en el portal web
    Cuando el cliente se registra en el portal web con los datos
      | firstName   | lastName   | phone   | email   | address   | city   | stateProvince   | postalCode   | country   | userName   | password   | confirmPassword   |
      | <firstName> | <lastName> | <phone> | <email> | <address> | <city> | <stateProvince> | <postalCode> | <country> | <userName> | <password> | <confirmPassword> |
    Entonces el usuario podra confirmar el registro exitoso
    Ejemplos:
      | firstName | lastName | phone  | email           | address         | city     | stateProvince | postalCode | country  | userName | password | confirmPassword |
      | Maria     | Paz      | 123123 | maria@gmail.com | calle 4 # 23-45 | Medellin | Antioquia     | 44         | Colombia | mariapaz | 123-abc  | 123-abc         |
   #   | Paola     | Torres   | 123123 | paola@gmail.com | calle 5 # 23-45 | Bogotan  | Cundinamarca  | 66         | Colombia | paolatorres | 123-abc  | 123-abc         |
