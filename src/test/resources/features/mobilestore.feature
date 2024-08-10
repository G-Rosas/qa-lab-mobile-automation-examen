@teststore
Feature: Validación de actualización del carrito de compra en SauceLabs

  Scenario Outline: Agregar productos y validar actualización del carrito
    Given estoy en la aplicación de SauceLabs
    And valido que carguen correctamente los productos en la galería
    When agrego <UNIDADES> del siguiente producto "<PRODUCTO>"
    Then valido que el carrito de compra se actualice correctamente con <UNIDADES> unidades del producto "<PRODUCTO>"

    Examples:
      | PRODUCTO                | UNIDADES |
      | Sauce Labs Backpack     | 1        |
      | Sauce Labs Bolt T-Shirt | 1        |
      | Sauce Labs Bike Light   | 2        |
