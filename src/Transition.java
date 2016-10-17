public class Transition {
    private State stateSource;
    private char alphabet;
    private State stateDestination;

    public Transition(State sourceState, char alphabet, State destinationState) {
        this.stateSource = sourceState;
        this.alphabet = alphabet;
        this.stateDestination = destinationState;
    }

    public State getStateDestination() {
        return stateDestination;
    }

    public State getStateSource() {
        return stateSource;
    }

    public char getAlphabet() {
        return alphabet;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Transition that = (Transition) o;

        if (alphabet != that.alphabet) return false;
        if (stateSource != null ? !stateSource.equals(that.stateSource) : that.stateSource != null) return false;
        return stateDestination != null ? stateDestination.equals(that.stateDestination) : that.stateDestination == null;

    }

    @Override
    public int hashCode() {
        int result = stateSource != null ? stateSource.hashCode() : 0;
        result = 31 * result + (int) alphabet;
        result = 31 * result + (stateDestination != null ? stateDestination.hashCode() : 0);
        return result;
    }

    public State nextState(char alphabet) {
        return this.alphabet == alphabet ? this.getStateDestination():null;
    }
}

