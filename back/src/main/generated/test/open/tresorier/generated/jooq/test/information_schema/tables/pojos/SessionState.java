/*
 * This file is generated by jOOQ.
 */
package open.tresorier.generated.jooq.test.information_schema.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SessionState implements Serializable {

    private static final long serialVersionUID = 1L;

    private final String stateKey;
    private final String stateCommand;

    public SessionState(SessionState value) {
        this.stateKey = value.stateKey;
        this.stateCommand = value.stateCommand;
    }

    public SessionState(
        String stateKey,
        String stateCommand
    ) {
        this.stateKey = stateKey;
        this.stateCommand = stateCommand;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.SESSION_STATE.STATE_KEY</code>.
     */
    public String getStateKey() {
        return this.stateKey;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.SESSION_STATE.STATE_COMMAND</code>.
     */
    public String getStateCommand() {
        return this.stateCommand;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final SessionState other = (SessionState) obj;
        if (this.stateKey == null) {
            if (other.stateKey != null)
                return false;
        }
        else if (!this.stateKey.equals(other.stateKey))
            return false;
        if (this.stateCommand == null) {
            if (other.stateCommand != null)
                return false;
        }
        else if (!this.stateCommand.equals(other.stateCommand))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.stateKey == null) ? 0 : this.stateKey.hashCode());
        result = prime * result + ((this.stateCommand == null) ? 0 : this.stateCommand.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("SessionState (");

        sb.append(stateKey);
        sb.append(", ").append(stateCommand);

        sb.append(")");
        return sb.toString();
    }
}