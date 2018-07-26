package numberingSystem.octal;

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
public class Octal extends NumberingSystem implements ConvertibleToDecimal, ConvertibleToHexaDecimal, ConvertibleToBinary {

    @Override
    public Object getValue() {
        return this.value;
    }

    @Override
    public void setValue(Object value) throws IllegalNumberException {
        char[] digits = ((String) value).toCharArray();
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] != '1' && digits[i] != '2' && digits[i] != '3' && digits[i] != '4' && digits[i] != '5'
                    && digits[i] != '6' && digits[i] != '7' && digits[i] != '0') {
                throw new IllegalNumberException("can not convert to octal");
            }
        }
        this.value = value;
    }

    @Override
    public Integer convertToDecimal() {
        return Integer.parseInt((String) this.getValue(), ConvertibleToOctal.BASE);
    }

    @Override
    public String convertToHexaDecimal() {
        return (Long.toHexString(Long.parseLong((String) this.getValue(), ConvertibleToOctal.BASE)));
    }

    @Override
    public String convertToBinary() {
        return (Integer.toBinaryString(Integer.parseInt((String) this.getValue(), ConvertibleToOctal.BASE)));
    }

    @Override
    public String toString() {
        return "The Octal value = " + this.value;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Octal) {
            if (this.getValue().equals(((Octal) obj).getValue())) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

}
