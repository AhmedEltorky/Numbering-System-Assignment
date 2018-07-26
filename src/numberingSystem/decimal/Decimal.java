package numberingSystem.decimal;

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
public class Decimal extends NumberingSystem implements ConvertibleToHexaDecimal, ConvertibleToOctal, ConvertibleToBinary {

    @Override
    public Object getValue() {
        return this.value;
    }

    @Override
    public void setValue(Object value) throws IllegalNumberException {
        char[] digits = ((String) value).toCharArray();
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] != '1' && digits[i] != '2' && digits[i] != '3' && digits[i] != '4' && digits[i] != '5'
                    && digits[i] != '6' && digits[i] != '7' && digits[i] != '8' && digits[i] != '9' && digits[i] != '0') {
                throw new IllegalNumberException("can not convert to decimal");
            }
        }
        this.value = value;
    }

    @Override
    public String convertToHexaDecimal() {
        return (Long.toHexString(Long.parseLong((String) this.getValue(), ConvertibleToDecimal.BASE)));
    }

    @Override
    public String convertToOctal() {
        return (Integer.toOctalString(Integer.parseInt((String) this.getValue(), ConvertibleToDecimal.BASE)));
    }

    @Override
    public String convertToBinary() {
        return (Integer.toBinaryString(Integer.parseInt((String) this.getValue(), ConvertibleToDecimal.BASE)));
    }

    @Override
    public String toString() {
        return "The Decimal Value = " + this.getValue();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Decimal) {
            if (this.getValue().equals(((Decimal) obj).getValue())) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
}
