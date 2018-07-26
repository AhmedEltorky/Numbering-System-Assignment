package numberingsystemassignment;

import exception.IllegalNumberException;
import java.util.Scanner;
import numberingSystem.binary.Binary;
import numberingSystem.decimal.Decimal;
import numberingSystem.hexaDecimal.HexaDecimal;
import numberingSystem.octal.Octal;

/**
 *
 * @author Ahmed El-Torky
 */
public class NumberingSystemAssignment {

    public static void main(String[] args) throws IllegalNumberException {
        Binary bin = new Binary("11111");
        Binary bin2 = new Binary("11111");
//        bin2.setValue("11111");
//        System.out.println("Pleasr Enter The Binary Number :");
//        bin.setValue(new Scanner(System.in).next());
        System.out.println(bin.getValue());
        System.out.println(bin.toString());
        System.out.println(bin.equals(bin2));
        System.out.println(bin.convertToDecimal());
        System.out.println(bin.convertToHexaDecimal());
        System.out.println(bin.convertToOctal());

//        Decimal de = new Decimal();
//        Decimal de2 = new Decimal();
//        de.setValue("12345");
//        de2.setValue("12345");
//        System.out.println(de.getValue());
//        System.out.println(de.toString());
//        System.out.println(de.equals(de2));
//        System.out.println(de.convertToBinary());
//        System.out.println(de.convertToHexaDecimal());
//        System.out.println(de.convertToOctal());
//        HexaDecimal hex = new HexaDecimal();
//        HexaDecimal hex2 = new HexaDecimal();
//        hex.setValue("EF");
//        hex2.setValue("EF");
//        System.out.println(hex.toString());
//        System.out.println(hex.getValue());
//        System.out.println(hex.equals(hex2));
//        System.out.println(hex.convertToBinary());
//        System.out.println(hex.convertToDecimal());
//        System.out.println(hex.convertToOctal());
//        Octal oct = new Octal();
//        Octal oct2 = new Octal();
//        oct.setValue("17");
//        oct2.setValue("1");
//        System.out.println(oct.getValue());
//        System.out.println(oct.toString());
//        System.out.println(oct.equals(oct2));
//        System.out.println(oct.convertToBinary());
//        System.out.println(oct.convertToDecimal());
//        System.out.println(oct.convertToHexaDecimal());
    }

}
