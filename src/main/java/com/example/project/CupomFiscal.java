package com.example.project;

public class CupomFiscal {

	public static String NOME_LOJA = "Arcos Dourados Com. de Alimentos LTDA";
	public static String LOGRADOURO = "Av. Projetada Leste";
	public static int NUMERO = 500;
	public static String COMPLEMENTO = "EUC F32/33/34";
	public static String BAIRRO = "Br. Sta Genebra";
	public static String MUNICIPIO = "Campinas";
	public static String ESTADO = "SP";
	public static String CEP = "13080-395";
	public static String TELEFONE = "(19) 3756-7408";
	public static String OBSERVACAO = "Loja 1317 (PDP)";
	public static String CNPJ = "42.591.651/0797-34";
	public static String INSCRICAO_ESTADUAL = "244.898.500.113";


	private static String QUEBRA_LINHA = System.lineSeparator();

	public static void main(final String[] args) {
		//Implemente aqui
		String cupom_fiscal = NOME_LOJA + QUEBRA_LINHA;
		cupom_fiscal += LOGRADOURO + ", " + NUMERO + " " + COMPLEMENTO + QUEBRA_LINHA;
		cupom_fiscal += BAIRRO + " - " + MUNICIPIO + " - " + ESTADO + QUEBRA_LINHA;
		cupom_fiscal += "CEP:" + CEP + " " + "Tel " + TELEFONE + QUEBRA_LINHA;
		cupom_fiscal += OBSERVACAO + QUEBRA_LINHA;
		cupom_fiscal += "CNPJ: " + CNPJ + QUEBRA_LINHA;
		cupom_fiscal += "IE: " + INSCRICAO_ESTADUAL;

		System.out.println(cupom_fiscal);
		
	}

}
