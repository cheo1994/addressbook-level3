package seedu.addressbook.storage;

import seedu.addressbook.data.AddressBook;
import seedu.addressbook.data.exception.IllegalValueException;
import seedu.addressbook.storage.jaxb.AdaptedAddressBook;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Represents the file used to store address book data.
 */
public class StorageFile extends Storage {


    /* Note: Note the use of nested classes below.
     * More info https://docs.oracle.com/javase/tutorial/java/javaOO/nested.html
     */

    /**
     * Signals that the given file path does not fulfill the storage filepath constraints.
     */
    public static class InvalidStorageFilePathException extends IllegalValueException {
        public InvalidStorageFilePathException(String message) {
            super(message);
        }
    }

    /**
     * Signals that some error has occured while trying to convert and read/write data between the application
     * and the storage file.
     */
    public static class StorageOperationException extends Exception {
        public StorageOperationException(String message) {
            super(message);
        }
    }

    /**
     * @throws InvalidStorageFilePathException if the default path is invalid
     */
    public StorageFile() throws InvalidStorageFilePathException {
        super();
    }

    /**
     * @throws InvalidStorageFilePathException if the given file path is invalid
     */
    public StorageFile(String filePath) throws InvalidStorageFilePathException {
        super();
    }

    protected boolean isValidPath(Path filePath) {
        return super.isValidPath(filePath);
    }

    public void save(AddressBook addressBook) throws StorageOperationException {
        super.save(addressBook);
    }

    public AddressBook load() throws StorageOperationException {
        return super.load();
    }

    public String getPath() {
        return super.getPath();
    }

}
