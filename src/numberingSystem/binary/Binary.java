package numberingSystem.binary;

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
public class Binary extends NumberingSystem implements ConvertibleToDecimal, ConvertibleToHexaDecimal, ConvertibleToOctal {

    char[] digits;

    public Binary(Object value) throws IllegalNumberException {
        setValue(value);
    }

    @Override
    public Object getValue() {
        return this.value;
    }

//    public void temp() /*throws IllegalNumberException*/ {
//        try {
//            setValue(value);
//        } catch (IllegalNumberException ex) {
//            Logger.getLogger(Binary.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
    
    @Override
    public void setValue(Object value) throws IllegalNumberException {
        digits = ((String) value).toCharArray();
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] != '0' && digits[i] != '1') {
                throw new IllegalNumberException("can not be converted to binary");
            }
        }
        this.value = (String) value;
    }

    @Override
    public Integer convertToDecimal() {
        Double number = Double.valueOf((String) this.getValue());
        int sum = 0, n = digits.length;
        double temp;
        temp = number;

        for (int i = n - 1; i >= 0; i--) {
            if ((int) (number / Math.pow(10, i)) == 1) {
                sum += (Math.pow(2, i));
                number -= (Math.pow(10, i));
                temp = number;
            } else {
                if ((temp -= (Math.pow(10, i))) > 0) {
                    number -= (Math.pow(10, i));
                } else {
                    temp = number;
                }
            }
        }
        return sum;
    }

    @Override
    public String convertToHexaDecimal() {
        String binary = (String) getValue();
        return (Long.toHexString(Long.parseLong(binary, ConvertibleToBinary.BASE)));
    }

    @Override
    public String convertToOctal() {
        String binary = (String) getValue();
        return (Integer.toOctalString(Integer.parseInt(binary, ConvertibleToBinary.BASE)));
    }

    @Override
    public String toString() {
        return "The Binary Number is : " + (String) this.getValue();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Binary) {
            if (this.getValue().equals(((Binary) obj).getValue())) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

}
