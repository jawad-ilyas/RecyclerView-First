package com.example.recyclerviewpractice;

public class ContactModel {

    // define the primitive data types according to design
    // into my design i have one image , and two textView
    // why we use int for image because i load the image from the my resoucrs

    int iwImgContect;
    String tvContactName , tvContactDescription;

    // we can used the constructor and over loaded Constructor
    public ContactModel(){

    }

    //  i also used the overloaded constructor because i also want to set data
    public ContactModel(int iwImgContect , String tvContactName  , String tvContactDescription)
    {
        this.tvContactName = tvContactName;
        this.iwImgContect = iwImgContect;
        this.tvContactDescription = tvContactDescription;
    }



}
