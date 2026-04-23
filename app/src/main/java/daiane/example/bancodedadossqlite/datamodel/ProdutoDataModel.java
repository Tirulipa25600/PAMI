package daiane.example.bancodedadossqlite.datamodel;

import java.util.regex.PatternSyntaxException;

public class ProdutoDataModel {
    public static final String TABELA = "produto";
    public static final String ID = "id";
    public static final String NOME = "nome";
    public static final String FORNECEDOR = "fornecedor";

    public static String queryCriarTabela = "";
    public static String criarTabela(){
        queryCriarTabela += "CREATE TABLE IF NOT EXISTS " + TABELA + "(";
        queryCriarTabela += ID + " INTEGER PRIMARY KEY AUTOINCREMENT, ";
        queryCriarTabela += NOME + " TEXT, ";
        queryCriarTabela += FORNECEDOR + " TEXT";
        queryCriarTabela += ")";
        return queryCriarTabela;
    }

}
