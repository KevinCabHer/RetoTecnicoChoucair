#Autor: Kevin Adrian Caballero
  @Stories
  Feature: Kevin registration on the automation page

    @Scenario1
    Scenario: Kevin registration on the automation page
      Given Kevin wants to register on the automation page
      When Enter all the required information
        | strNombre | strApellido | strDireccion | strCorreo       | strTelefono | strIdioma | strHabilidades | strPais | strAno | strMes  | strDia | strClave1 | strClave2 |
        | Kevin     | Caballero   | AV. 0 #4-24  | kevin@gmail.com | 3203700456  | Arabic    | C              | Japan   | 1995   | October | 24     | Kc12345   | Kc12345   |
      Then registration is completed successfully