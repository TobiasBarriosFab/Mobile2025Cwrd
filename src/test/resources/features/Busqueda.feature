@Busqueda
Feature: Busqueda de un producto
  Background:
    Given el usuario se loguea en la app MYDEMOAPP con el usuario bod@example.com y la contraseña 10203040
    And el usuario se encuentra en la pagina de catalogo

  @BusquedaExitosa
  Scenario: El usuario busca un producto en la app MYDEMOAPP
    When el usuario hace click en el producto Sauce Labs Backpack (yellow)
    Then el usuario visualiza la ventana del producto Sauce Labs Backpack (yellow)




