# Numbering-System-Assignment

create a custom exception called IllegalNumberException in package exception

and create an abstact class called NumberingSystem inside a package called numberingSystem,
The class should contains the following properties and methods
private Object value;
public abstract Object getValue();
public abstract void setValue(Object value) throws IllegalNumberException;

and create package conversion which contains 4 interfaces 
ConvertibleToDecimal, ConvertibleToHexaDecimal, ConvertibleToOctal, ConvertibleToBinary 

Interface like ConvertibleToDecimal should have the following property and method
int BASE = 10;
public abstract Integer convertToDecimal();

under package numberingSystem create 4 packages binary, decimal, hexaDecimal, octal
binary package should have a class called Binary
decimal package should have a class called Decimal
hexaDecimal package should have a class called HexaDecimal
octal package should have a class called Octal

Class like Binary should extend NumberingSystem and implement the proper set of interfaces in package conversion
and you have to make sure that the value being passed to setValue method is appropriate for that numbering system
otherwise throw IllegalNumberException
