Feature: Realizar un pedido
  Como usuario
  Quiero realizar un pedido
  Para recibir los productos que deseo

  Scenario: Realizar un pedido con éxito
    Given que el usuario está en la página de inicio
    When el usuario agrega un producto al carrito
    And el usuario completa el formulario de envío y pago
    And el usuario confirma el pedido
    Then el usuario ve un mensaje de confirmación del pedido
    And el estado del pedido cambia a "En proceso"

  Scenario: Verificar el estado de un pedido
    Given que el usuario ha realizado un pedido
    When el usuario accede a la página de "Mis pedidos"
    Then el usuario ve una lista de todos sus pedidos
    And el usuario puede ver el estado actual de cada pedido