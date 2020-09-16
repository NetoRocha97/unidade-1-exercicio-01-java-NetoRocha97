package com.example.project;

public class CupomFiscal {

	static String nome_loja = "Arcos Dourados Com. de Alimentos LTDA";
	static String logradouro = "Av. Projetada Leste";
	static int numero = 500;
	static String complemento = "EUC F32/33/34";
	static String bairro = "Br. Sta Genebra";
	static String municipio = "Campinas";
	static String estado = "SP";
	static String cep = "13080-395";
	static String telefone = "(19) 3756-7408";
	static String observacao = "Loja 1317 (PDP)";
  static String cnpj = "42.591.651/0797-34";
	static String inscricao_estadual = "244.898.500.113";

  private static void imprime_dados_loja() {
    System.out.printf("%s\n", nome_loja);
    System.out.printf("%s, %d %s\n", logradouro, numero, complemento);
    System.out.printf("%s - %s - %s\n ", bairro, municipio, estado);
    System.out.printf("CEP:%s Tel %s\n", cep, telefone);
    System.out.printf(observacao);
    System.out.printf("CNPJ: %s\n", cnpj);
    System.out.printf("IE: %s\n", inscricao_estadual);

  }

	public static void main(String[] args) {
		imprime_dados_loja();
	}

}
