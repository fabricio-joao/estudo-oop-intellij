package excecao;

public class ExcecaoDominio extends Exception{
    private static final long serialVersion = 1L;

    public ExcecaoDominio(String msg) {
        super(msg);
    }
}