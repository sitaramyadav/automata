import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TransitionTest {
    @Test
    public void getStateDestination_should_return_destination_state() throws Exception {
        State sourceState = new State("q1");
        State destinationState = new State("q2");
        String character ="hello ";
        Transition transition = new Transition(sourceState, character, destinationState);
        assertEquals(transition.getStateDestination(),destinationState);
    }

    @Test
    public void getStateSourceShould_return_source_state() throws Exception {
        State sourceState = new State("q1");
        State destinationState = new State("q2");
        String character = "hello ";
        Transition transition = new Transition(sourceState, character, destinationState);
        assertEquals(transition.getStateSource(),sourceState);
    }

    @Test
    public void getCharacter_should_return_char() throws Exception {
        State sourceState = new State("q1");
        State destinationState = new State("q2");
        String character = "hello ";
        Transition transition = new Transition(sourceState, character, destinationState);
        assertEquals(transition.getCharacter(),character);
    }
}