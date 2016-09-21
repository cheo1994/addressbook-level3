package seedu.addressbook.storage;

import seedu.addressbook.data.AddressBook;
import seedu.addressbook.storage.StorageFile.InvalidStorageFilePathException;

public class StorageStub extends Storage {

    public StorageStub() throws InvalidStorageFilePathException {
        super();
    }
    
    public StorageStub(String filePath) throws InvalidStorageFilePathException {
        super(filePath);
    }
    
    public void save(AddressBook addressBook) {
        //Do nothing
    }
}
