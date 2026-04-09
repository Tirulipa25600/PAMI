package daiane.example.bancodedadossqlite.datamodel;

import android.util.Log;

import daiane.example.bancodedadossqlite.api.AppUtil;

public class ClienteDataModel {
    // Toda classe DataModel tem essa estrutura:
    //4 - Queries de consulta (não faremos);

    //1 - Atributo nome da tabela;
    public static final String TABELA = "cliente";

    //2 - Atributos um para um com os nomes dos campos;
    public static final String ID = "id";
    public static final String NOME = "nome";
    public static final String EMAIL = "email";

    //3 - Query para criar a tabela no banco de dados;
    public static String queryCriarTabela = "";

    //5 - Metodo para gerar o script da tabela.
    public static String  criarTabela(){
        queryCriarTabela += "CREATE TABLE " + TABELA + "(";
        queryCriarTabela += ID + " INTEGER PRIMARY KEY AUTOINCREMENT, ";
        queryCriarTabela += NOME + " TEXT, ";
        queryCriarTabela += EMAIL + " TEXT";
        queryCriarTabela += ")";

        Log.i(AppUtil.TAG, "criarTabela: " + queryCriarTabela);

        return queryCriarTabela;
    }
}
