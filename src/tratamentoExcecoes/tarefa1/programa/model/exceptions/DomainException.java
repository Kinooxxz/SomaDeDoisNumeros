package tratamentoExcecoes.tarefa1.programa.model.exceptions;

public class DomainException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public DomainException(String msg){
        super(msg);
    }

}
