package seedu.address.model.group.exceptions;

/**
 * Signals that the operation is unable to find the specified person.
 */
public class GroupNotFoundException extends IllegalArgumentException {
    public GroupNotFoundException(String message) {
        super(message);
    }
}
