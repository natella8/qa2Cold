Feature: We are testing weather API
  Scenario: Weather check
    Given city is: London
    When we are requesting weather
    Then lon is -0.13
    And lat is 51.51

#    /daljshe prodolzhaju sama !!!!!!!!!!!!!

    And id is: 300
    And main is: Drizzle
    And description is: light intensity drizzle
    And icon is: 09d
#
##    provereno. daljse:
    And base is: stations
#    provereno. dalse:

    And temp is: 280.32
    And pressure is: 1012
    And humidity is: 81
    And temp_min is: 279.15
    And temp_max is: 281.15

#  Provereno,daljse:

    And visibility is: 10000
#provereno!!!
    And speed is: 4.1
    And deg is: 80

    And all is: 90
# provereno

    And dt is: 1485789600
#  provereno

    And type is: 1
    And sys_id is: 5091
    And message is: 0.0103
    And country is: GB
    And sunrise is: 1485762037
    And sunset is: 1485794875
# provereno!

    And city_id is: 2643743
    And name is: London
    And cod is: 200





