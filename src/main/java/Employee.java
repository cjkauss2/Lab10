/**
 * Class implementing an employee.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/10/">Lab 10 Description</a>
 */
public class Employee {

    /** Name of employee. */
    private String name;

    /** Name of employee's manager. */
    private String manager;

    /**
     * Constructor for initialization.
     * @param newName name of new employee
     * @param newManager name of new employee's manager
     */
    public Employee(final String newName, final String newManager) {
        this.name = newName;
        this.manager = newManager;
    }

    /**
     * Getter for name.
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter for name.
     * @param newName new employee name
     */
    public void setName(final String newName) {
        this.name = newName;
    }

    /**
     * Getter for manager.
     * @return manager
     */
    public String getManager() {
        return manager;
    }

    /**
     * Setter for manager.
     * @param newManager new manager name
     */
    public void setManager(final String newManager) {
        this.manager = newManager;
    }
}
