package numberingSystem;

import exception.IllegalNumberException;

/**
 *
 * @author Ahmed El-Torky
 */
public abstract class NumberingSystem {

    protected Object value;

    public abstract Object getValue();

    public abstract void setValue(Object value) throws IllegalNumberException;

}
