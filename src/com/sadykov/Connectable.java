package com.sadykov;

public interface Connectable {
    void openConnection();

    void closeConnection();

    void checkConnection();

    void readOneIndex();

    void checkEntryKey();

    void readOneKey();

    void readCertainDatabase();

    void findNumberDatabase();

    void addEntryDatabase();

    void updateValueIndex();

    void updateContentKey();

}
