Feature: Secuencia fibonacci
  yo como desarrollador de scrum
  deseo conocer el valor de fibonacci
  dada la posición indicada


  Scenario: Valor fibonacci en posicion 1
    Given que deseo conocer los valores fibonacci
    When ingreso la posicion 1
    Then retorna el valor 1

  Scenario: Valor fibonacci en posicion 2
    Given que deseo conocer los valores fibonacci
    When ingreso la posicion 1
    Then retorna el valor 1

  Scenario: Valor fibonacci en posicion 3
    Given que deseo conocer los valores fibonacci
    When ingreso la posicion 3
    Then retorna el valor 2

  Scenario: Valor fibonacci en posicion 9
    Given que deseo conocer los valores fibonacci
    When ingreso la posicion 9
    Then retorna el valor 34

  Scenario: Valor fibonacci en posicion 10
    Given que deseo conocer los valores fibonacci
    When ingreso la posicion 10
    Then devuelve el valor es superior a 50