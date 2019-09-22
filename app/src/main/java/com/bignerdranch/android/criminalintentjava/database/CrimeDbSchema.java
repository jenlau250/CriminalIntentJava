package com.bignerdranch.android.criminalintentjava.database;

public class CrimeDbSchema {

    //CrimeTable is to define String constants needed for table definition
    public static final class CrimeTable {
        public static final String NAME ="crimes";

        //can refer to CrimeTable.Cols.TITLE now to update data
        public static final class Cols {
            public static final String UUID = "uuid";
            public static final String TITLE = "title";
            public static final String DATE = "date";
            public static final String SOLVED = "solved";
        }

    }
}
