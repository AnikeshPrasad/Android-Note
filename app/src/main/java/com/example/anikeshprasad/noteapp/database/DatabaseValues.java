package com.example.anikeshprasad.noteapp.database;

/**
 * Created by Anikesh Prasad on 05-04-2017.
 */

public class DatabaseValues {

    // Database Version
    public static final int DATABASE_VERSION = 1;

    // Database Name
    public static final String DATABASE_NAME = "internshala";

    // Notes table name
    public static final String TABLE_NOTES = "notes";

    // Notes Table Columns names
    public static final String NOTES_ID = "id";
    public static final String NOTES_TITLE = "title";
    public static final String NOTES_DESCRIPTION = "description";


    //Create table queries
    public static final String TABLE_NOTES_CREATE = "CREATE TABLE IF NOT EXISTS " + TABLE_NOTES + "( " + NOTES_ID + " INTEGER PRIMARY KEY, " + NOTES_TITLE + " TEXT, " + NOTES_DESCRIPTION + " TEXT)";

    //Drop table queries
    public static final String TABLE_NOTES_DROP = "DROP TABLE IF EXISTS " + TABLE_NOTES;
}
