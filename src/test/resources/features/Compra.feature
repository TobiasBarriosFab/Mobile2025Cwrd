@Compra
  Feature: El usuario realiza una compra completa
    Background: 
      Given el usuario se loguea en la app MYDEMOAPP con el usuario bod@example.com y la contraseña 10203040
      And el usuario se encuentra en la pagina de catalogo
      And el usuario hace click en el producto Sauce Labs Backpack (yellow)
      And el usuario visualiza la ventana del producto Sauce Labs Backpack (yellow)
      And el usuario hace click en el boton AddToCart
      And el usuario hace click en el carrito

    @CompraCheckoutCompletarDatos
    Scenario Outline: el usuario completa los datos en la pagina del checkout
      When el usuario hace click en el boton Proceed To Checkout
      And el usuario visualiza la ventana del checkout
      And el usuario completa el campo Full Name con <Nombre>
      And el usuario completa el campo Adress Line 1 con <Direccion>
      And el usuario completa el campo City con <Ciudad>
      And el usuario completa el campo State Region con <Region>
      And el usuario completa el campo Zip code con <Codigo Postal>
      And el usuario completa el campo Country con <Pais>
      And el usuario hace click en el boton To Payment
      Then el usuario visualiza la ventana de Pago

      Examples:
        |Nombre         |Direccion    |Ciudad|Region  |Codigo Postal|Pais          |
        |Rebecca Winter |Mandorley 112|Truro |Cornwall|89750        |United Kingdom|

    @CompraCompletarDatosPago
      Scenario Outline: el usuario completa los datos de medio de pago
      And el usuario hace click en el boton Proceed To Checkout
      And el usuario visualiza la ventana del checkout
      And el usuario completa el campo Full Name con <Nombre>
      And el usuario completa el campo Adress Line 1 con <Direccion>
      And el usuario completa el campo City con <Ciudad>
      And el usuario completa el campo State Region con <Region>
      And el usuario completa el campo Zip code con <Codigo Postal>
      And el usuario completa el campo Country con <Pais>
      When el usuario hace click en el boton To Payment
      And el usuario visualiza la ventana de Pago
      And el usuario completa el campo Nombre completo con <Nombre>
      And el usuario completa el campo Card number con <TarjetaNum>
      And el usuario completa el campo Expiration Date con <Expiracion>
      And el usuario completa el campo Security code con <CodSeguridad>
      And el usuario hace click en el boton Review Order
      Then el usuario visualiza la ventana de Review Order

      Examples:
        |Nombre         |Direccion    |Ciudad|Region  |Codigo Postal|Pais          |TarjetaNum      |Expiracion|CodSeguridad|
        |Rebecca Winter |Mandorley 112|Truro |Cornwall|89750        |United Kingdom|3258125675687891|0325      |123         |

    @CompraCompleta
    Scenario Outline: el usuario finaliza la compra
      And el usuario hace click en el boton Proceed To Checkout
      And el usuario visualiza la ventana del checkout
      And el usuario completa el campo Full Name con <Nombre>
      And el usuario completa el campo Adress Line 1 con <Direccion>
      And el usuario completa el campo City con <Ciudad>
      And el usuario completa el campo State Region con <Region>
      And el usuario completa el campo Zip code con <Codigo Postal>
      And el usuario completa el campo Country con <Pais>
      And el usuario hace click en el boton To Payment
      And el usuario visualiza la ventana de Pago
      And el usuario completa el campo Nombre completo con <Nombre>
      And el usuario completa el campo Card number con <TarjetaNum>
      And el usuario completa el campo Expiration Date con <Expiracion>
      And el usuario completa el campo Security code con <CodSeguridad>
      And el usuario hace click en el boton Review Order
      And el usuario visualiza la ventana de Review Order
      When el usuario hace click en el boton Place Order
      Then el usuario compra exitosamente el producto
      Examples:
        |Nombre         |Direccion    |Ciudad|Region  |Codigo Postal|Pais          |TarjetaNum      |Expiracion|CodSeguridad|
        |Rebecca Winter |Mandorley 112|Truro |Cornwall|89750        |United Kingdom|3258125675687891|0325      |123         |