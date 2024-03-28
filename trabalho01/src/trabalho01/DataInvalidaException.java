package trabalho01;

public class DataInvalidaException extends Exception {

    private static final long serialVersionUID = 1L;

	public DataInvalidaException() {
        super("Data inválida!");
    }

    public DataInvalidaException(String message) {
        super(message);
    }

}
