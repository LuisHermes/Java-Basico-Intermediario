package Javaintermediario.Aula56;

public class TesteDocumento {

	public static void main(String[] args) {
		
		
		/*for (TipoDocumento doc: TipoDocumento.values()) {
			System.out.println(doc + " - " + doc.geraNumeroTeste1());
			
		}*/
		Pessoa pf = new Pessoa();
		pf.setTipodocumento(Enum.valueOf(TipoDocumento.class, "CPF"));
		pf.setNumeroDocumento(pf.getTipodocumento().geraNumeroTeste());
		System.out.println(pf);
		
		Pessoa pj = new Pessoa();
		pj.setTipodocumento(Enum.valueOf(TipoDocumento.class, "CNPJ"));
		pj.setNumeroDocumento(pj.getTipodocumento().geraNumeroTeste());
		System.out.println(pj);
		
	}

}
