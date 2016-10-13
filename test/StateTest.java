import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class StateTest {
    @Test
    public void getName_should_return_state_name() throws Exception {
        State state = new State("q1");
        assertEquals(state.getName(),"q1");
    }

    @Test
    public void isInitialState_should_return_false_if_state_is_not_initial(){
        State state = new State("q1");
        assertFalse(state.isInitialState());
    }

    @Test
    public void setInitialState_should_set_initial_state(){
        State state = new State("q1");
        assertFalse(state.isInitialState());
        state.setInitialState(true);
        assertTrue(state.isInitialState());
    }

    @Test
    public void isFinalState_should_return_false_if_state_is_not_final(){
        State state = new State("q1");
        assertFalse(state.isFinalState());
    }

    @Test
    public void setFinalState_should_set_final_state(){
        State state = new State("q1");
        assertFalse(state.isFinalState());
        state.setFinalState(true);
        assertTrue(state.isFinalState());
    }
}
