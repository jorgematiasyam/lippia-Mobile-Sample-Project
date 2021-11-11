Feature: Como cliente quiero hacer un login en clockify

  @jmy
  Scenario Outline: el usuario hace un login en la aplicacion
    Given el usuario esta en la pagina de login
    When el usuario completa su <email> y <password>
    And el usuario presiona el boton Login
    Then el usuario es redirigido a la pagina principal
    Examples:
      | email                    | password |
      | jorgematiasyam@gmail.com | Muri1009 |

  @jmy
  Scenario: desactivar notificaciones
    Given el usuario esta en la pagina principal
    When el usuario entra al menu settings
    And el usuario desactiva la opcion show notifications
    Then no se muestran las notificaciones




