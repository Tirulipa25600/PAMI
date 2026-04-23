package daiane.example.bancodedadossqlite.datasource;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import daiane.example.bancodedadossqlite.datamodel.ClienteDataModel;
import daiane.example.bancodedadossqlite.datamodel.ProdutoDataModel;

public class AppDataBase extends SQLiteOpenHelper {

    public static final String DB_NAME = "banco.db";
    public static int version = 1;
    SQLiteDatabase db;

    public AppDataBase(Context context) {
        super(context, DB_NAME, null, version);
        db = getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(ClienteDataModel.criarTabela());
        db.execSQL(ProdutoDataModel.criarTabela());


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
