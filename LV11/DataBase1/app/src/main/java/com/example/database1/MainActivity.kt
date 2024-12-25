package com.example.database1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.database1.data.DatabaseHandler
import com.example.database1.model.Contact

class MainActivity : AppCompatActivity() {
    private lateinit var textViewData: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textViewData=findViewById(R.id.textViewData)

        val db = DatabaseHandler(this)


// Add sample contacts
        db.addContact(Contact(name = "Alex", phoneNumber = "123456"))
        db.addContact(Contact(name = "John", phoneNumber = "234567"))
        db.addContact(Contact(name = "Maria", phoneNumber = "345678"))
        db.addContact(Contact(name = "Anna", phoneNumber = "456789"))

        //DOhvati sve kontakti iz baze

// Retrieve and display contacts
//        val contactList = db.getAllContacts()
//        var data = ""
//        for (contact in contactList) {
//            data += "Name: ${contact.name}\nPhone: ${contact.phoneNumber}\n\n"
//        }
//        textViewData.text = data

        // Dohvati kontakt specificiran id-om


        val contact = db.getContact(3)
        if (contact != null) {
            textViewData.text = "Name: ${contact.name}\nPhone Number: ${contact.phoneNumber}"
        } else {
            textViewData.text = "Contact not found."
        }

        // Update contact
        val newContact = Contact(3, "Alina", "987654321")
        val rowsAffected = db.updateContact(newContact)

        // Fetch updated contact
        val updatedContact = db.getContact(3)
        if (updatedContact != null) {
            textViewData.text = "Updated Name: ${updatedContact.name}\nUpdated Phone Number: ${updatedContact.phoneNumber}"
        } else {
            textViewData.text = "Contact update failed."
        }

//        val contact1 = db.getContact(1)
//        val contact2 = db.getContact(2)
//        if (contact1 != null) db.deleteContact(contact1)
//        if (contact2 != null) db.deleteContact(contact2)
//
//        val contactList = db.getAllContacts()
//        textViewData.text = ""
//        for (contact in contactList) {
//            textViewData.append("Name: ${contact.name}\nPhone: ${contact.phoneNumber}\n\n")
//        }
        val contactCount = db.getContactsCount()
        textViewData.append("\nNumber of Contacts: $contactCount")





    }




}