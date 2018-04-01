package com.example.athaya.athaya_1202150252_modul6;

import com.google.firebase.database.IgnoreExtraProperties;

/**
 * Created by telkom on 31/03/2018.
 */

@IgnoreExtraProperties
public class databaseKomen {
    //mendeklarasikan objek dalam bentuk string
    String sikomen, komen, fotokomen;

    public databaseKomen(){

    }
    public databaseKomen(String sikomen, String komen, String fotokomen){
        this.sikomen = sikomen;
        this.komen = komen;
        this.fotokomen = fotokomen;
    }
    //untuk meggambil data
    public String getSikomen() {
        return sikomen;
    }

    public String getKomen() {
        return komen;
    }

    public String getFotokomen() {
        return fotokomen;
    }
}
