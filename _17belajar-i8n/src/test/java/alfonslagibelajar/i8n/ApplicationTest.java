package alfonslagibelajar.i8n;

import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

/**
 * Unit test for the Application class.
 */
public class ApplicationTest {
    @Mock
    private Calculator calculator;

    @InjectMocks
    private Application application;

    @BeforeEach
    public void init() {
        MockitoAnnotations.openMocks(this);
    }


    /**
     * Testing add
     */
    @Test
    public void calculatorAddShouldReturnSum() {
        final CommandLineArguments args = CommandLineArguments.builder()
                .x(1)
                .y(2)
                .operation("add")
                .build();

        when(calculator.add(anyInt(), anyInt())).thenAnswer(invocation -> {
            int x = invocation.getArgument(0);
            int y = invocation.getArgument(1);
            return x + y;
        });

        application.run(args);

        verify(calculator).add(1, 2);
        verify(calculator, never()).multiply(anyInt(), anyInt());
        verify(calculator, times(1)).save(3);
    }

    /**
     * Rigorous Test :-)
     */
    @Test
    public void calculatorShouldReturnTheAnswerToTheUltimateQuestionOfLife() {
        // The Ultimate Question "What do you get when you multiply six by nine"?
        final CommandLineArguments args = CommandLineArguments.builder()
                .x(6)
                .y(9)
                .operation("multiply")
                .build();

        when(calculator.multiply(eq(6), eq(9))).thenReturn(42);

        application.run(args);

        verify(calculator, times(1)).multiply(6, 9);
        verify(calculator, never()).add(anyInt(), anyInt());
        verify(calculator, times(1)).save(42);
    }

    /**
     * Application main should method should invoke the calculator.
     */
    @Test
    public void mainShouldInvokeCalculator() {
        when(calculator.multiply(eq(2), eq(3))).thenReturn(6);

        Application.assignInstance(application);
        Application.main(new String[]{ "-x", "2", "-y", "3", "--operation", "multiply"});

        verify(calculator, times(1)).multiply(2, 3);
        verify(calculator, never()).add(anyInt(), anyInt());
        verify(calculator, times(1)).save(6);
    }
}
