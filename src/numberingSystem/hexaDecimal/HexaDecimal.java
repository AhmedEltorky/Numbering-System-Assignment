package numberingSystem.hexaDecimal;

import conversion.ConvertibleToBinary;
import conversion.ConvertibleToDecimal;
import conversion.ConvertibleToHexaDecimal;
import conversion.ConvertibleToOctal;
import exception.IllegalNumberException;
import numberingSystem.NumberingSystem;

/**
 *
 * @author Ahmed El-Torky
 */
public class HexaDecimal extends NumberingSystem implements ConvertibleToDecimal, ConvertibleToOctal, ConvertibleToBinary {

    @Override
    public Object getValue() {
        return this.value;
    }

    @Override
    public void setValue(Object value) throws IllegalNumberException {
        char[] digits = ((String) value).toCharArray();
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] != '1' && digits[i] != '2' && digits[i] != '3' && digits[i] != '4' && digits[i] != '5'
                    && digits[i] != '6' && digits[i] != '7' && digits[i] != '8' && digits[i] != '9' && digits[i] != 'A'
                    && digits[i] != 'B' && digits[i] != 'C' && digits[i] != 'D' && digits[i] != 'E' && digits[i] != 'F') {
                throw new IllegalNumberException("can not be converted to hexadecimal");
            }
        }
        this.value = value;
    }

    @Override
    public Integer convertToDecimal() {
        int decimal = Integer.parseInt((String) this.getValue(), ConvertibleToHexaDecimal.BASE);
        return decimal;
    }

    @Override
    public String convertToOctal() {
        return (Integer.toOctalString(Integer.parseInt((String) this.getValue(), ConvertibleToHexaDecimal.BASE)));
    }

    @Override
    public String convertToBinary() {
        return (Integer.toBinaryString(Integer.parseInt((String) this.getValue(), ConvertibleToHexaDecimal.BASE)));
    }

    @Override
    public String toString() {
        return "The Hexadecimal value = " + this.value;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof HexaDecimal) {
            if (this.getValue().equals(((HexaDecimal) obj).getValue())) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

}
