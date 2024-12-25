package com.example.database1.data

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import com.example.database1.model.Contact
import com.example.database1.utils.Constants

class DatabaseHandler(val context: Context) : SQLiteOpenHelper(
    context,
    Constants.DATABASE_NAME,
    null,
    Constants.DATABASE_VERSION
) {
    override fun onCreate(db: SQLiteDatabase?) {
        val createTable = "CREATE TABLE ${Constants.TABLE_NAME} (" +
            "${Constants.KEY_ID} INTEGER PRIMARY KEY AUTOINCREMENT, " +
            " ${Constants.KEY_NAME} TEXT," +
            "${Constants.KEY_PHONE_NUMBER} TEXT )"

        db?.execSQL(createTable)

    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        db?.execSQL("DROP TABLE IF EXISTS ${Constants.TABLE_NAME}")
        onCreate(db)
    }

    fun addContact(contact: Contact) {
        val db = this.writableDatabase
        val values = ContentValues()
        values.put(Constants.KEY_NAME, contact.name)
        values.put(Constants.KEY_PHONE_NUMBER, contact.phoneNumber)
        db.insert(Constants.TABLE_NAME, null, values)
        db.close()
    }

    fun getContact(id: Int): Contact? {
        val db = this.readableDatabase
        val cursor = db.query(
            Constants.TABLE_NAME,
            arrayOf(Constants.KEY_ID, Constants.KEY_NAME, Constants.KEY_PHONE_NUMBER),
            Constants.KEY_ID  + "= ?",
            arrayOf(id.toString()),
            null, null, null
        )
            cursor?.let{
                it.moveToFirst()
            }

        return Contact(cursor.getString(0).toInt(),cursor.getString(1), cursor.getString(2))
        }

    fun getAllContacts(): MutableList<Contact> {
        val db = this.readableDatabase
        val contactList = mutableListOf<Contact>()
        val selectAll = "SELECT * FROM ${Constants.TABLE_NAME}"
        val cursor = db.rawQuery(selectAll, null)

        if (cursor.moveToFirst()) {
            do {
                val contact = Contact(
                    id = cursor.getInt(0),
                    name = cursor.getString(1),
                    phoneNumber = cursor.getString(2)
                )
                contactList.add(contact)
            } while (cursor.moveToNext())
        }
        cursor.close()
        db.close()
        return contactList
    }
    fun updateContact(contact: Contact): Int {
        val db = this.writableDatabase
        val values = ContentValues()
        values.put(Constants.KEY_NAME, contact.name)
        values.put(Constants.KEY_PHONE_NUMBER, contact.phoneNumber)

        return db.update(
            Constants.TABLE_NAME,
            values,
            "${Constants.KEY_ID} = ?",
            arrayOf(contact.id.toString())
        ).also {
            db.close()
        }
    }

    fun deleteContact(contact: Contact) {
        val db = this.writableDatabase
        db.delete(
            Constants.TABLE_NAME,
            Constants.KEY_ID + "= ?",
            arrayOf(contact.id.toString())
        )
        db.close()
    }

    fun getContactsCount(): Int {
        val db = this.readableDatabase
        val query = "SELECT * FROM ${Constants.TABLE_NAME}"
        val cursor = db.rawQuery(query, null)
        val count = cursor.count
        cursor.close()
        db.close()
        return count
    }


}


