import java.util.Date;
import java.util.Collection;

public class MovimentacaoFinanceira {
 
	private int idMovmFinanceira;
	 
	private Date dtMovmFinanceira;
	 
	private double vlMovmFinanceira;
	 
	private String dscrMovmFinanceira;
	 
	private Collection<MovimentacaoEstoque> movimentacaoEstoque;
	 
	private TipoMovimentacaoFinanceira tipoMovimentacaoFinanceira;
	 
	private Funcionario funcionario;
	 
}
 
