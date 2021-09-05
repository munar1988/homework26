package com.sadykov;

public class Action implements Connectable {

    private int key;
    private int value;
    private boolean isConnection;

    public Action(int key, int meaning) {
        this.key = key;
        this.value = meaning;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public int getMeaning() {
        return value;
    }

    public void setMeaning(int meaning) {
        this.value = meaning;
    }

    @Override
    public void openConnection() {
        isConnection = true;
    }

    @Override
    public void closeConnection() {
isConnection = true;
    }

    @Override
    public void read(int index) throws Exception {
        if (isConnection == false) {
            throw  new Exception();
        }
        else{
            System.out.println();
        }
    }

    @Override
    public void checkConnection() {

    }

    @Override
    public void readOneIndex() {

    }

    @Override
    public void checkEntryKey() {

    }

    @Override
    public void readOneKey() {

    }

    @Override
    public void readCertainDatabase() {

    }

    @Override
    public void findNumberDatabase() {

    }

    @Override
    public void addEntryDatabase() {

    }

    @Override
    public void updateValueIndex() {

    }

    @Override
    public void updateContentKey() {

    }
}



