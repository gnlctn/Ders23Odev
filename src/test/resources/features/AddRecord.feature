Feature: Add Record, Update Record and Control
  Scenario Outline:Add,Update and Control Record
    Given Open Webtables Field
    When Click Add Button
    When Fill in the fields with info '<Name>' and '<lName>' and '<Mail>' and '<Age>' and '<salaryy>' and '<departmentName>'
    When Click Submit Button
    Then Click Edit Record
    When Update Record Field
    Then Control Record Field After Update
    Examples:
      | Name  | lName | Mail          | Age | salaryy | departmentName |
      | Gönül | Çetin | gnl@gmail.com | 29  | 60000   | IT             |