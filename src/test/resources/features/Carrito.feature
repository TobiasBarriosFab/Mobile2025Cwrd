@Carrito
  Feature: funcionalidades del carrito
    Background:
      Given el usuario se encuentra en la pagina de catalogo
      And el usuario hace click en el producto Sauce Labs Backpack (yellow)
      And el usuario visualiza la ventana del producto Sauce Labs Backpack (yellow)

    @AgregarProductoCarrito
    Scenario: el usuario agrega un producto al carrito
      When el usuario hace click en el boton AddToCart
      Then el usuario visualiza que el contador del carrito es 1

    @EliminarProductoCarrito
    Scenario: el usuario elimina un producto del carrito
      And el usuario hace click en el boton AddToCart
      And el usuario visualiza que el contador del carrito es 1
      And el usuario hace click en el carrito
      When el usuario hace click en el boton Remove
      Then el usuario verifica que el carrito esta vacio
