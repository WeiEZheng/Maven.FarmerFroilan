package com.zipcodewilmington.froilansfarm.ShelterAndStorage;

import java.util.ArrayList;

public class Field {
    // stores CropRows
    // CropRow cropRow = new CropRow(); is instantiating an object. Create a list.
    ArrayList<CropRow> cropRows;

    public Field () {
        cropRows = new ArrayList<>();
        cropRows.add(new CropRow());
        cropRows.add(new CropRow());
        cropRows.add(new CropRow());

    }

    public void setField(){
        this.cropRows = cropRows;
    }

    public int getCropRows(){
        //return cropRows;
    }

}
