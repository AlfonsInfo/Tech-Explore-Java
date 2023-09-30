package alfonslagibelajar.i8n;

import java.io.IOException;
import java.util.Properties;

import com.beust.jcommander.JCommander;
import com.beust.jcommander.ParameterException;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;

/**
 * Application main class.
 */
@Slf4j
public class Application {

    private Calculator calculator;

    private final ApplicationMetadata applicationMetadata;

    public static Application INSTANCE;

    public static void main(final String[] args) {
        log.info("Starting application...");
        final CommandLineArguments arguments = CommandLineArguments.builder().build();
        final JCommander commander = JCommander.newBuilder()
                .addObject(arguments)
                .programName("myapp")
                .build();

        try {
            commander.parse(args);
            assignInstance(new Application()).run(arguments);
        } catch (final ParameterException ex) {
            log.error("Error parsing arguments: {}", args, ex);
            System.err.println(ex.getMessage());
            commander.usage();
        }
        log.info("Exited application");
    }

    public Application() {
        ApplicationMetadata m = null;
        try {
            m = ApplicationMetadata.fromResource("/git.properties");
            log.info("Version: {}, CommitId {}, Branch: {}, Commit timestamp: {}, Build timestamp: {}",
                    m.getVersion(), m.getCommitId(), m.getBranch(),
                    m.getCommitTimestamp(), m.getBuildTimestamp());
        } catch (final IOException ex) {
            log.error("Cannot read application metadata", ex);
        }
        this.applicationMetadata = m;
    }

    protected static Application assignInstance(final Application instance) {
        if (INSTANCE == null) {
            INSTANCE = instance;
        }
        return INSTANCE;
    }

    public void run(final CommandLineArguments arguments) {
        log.info("Started application");

        if (calculator == null) {
            calculator = createCalculator();
        }

        if (StringUtils.equalsIgnoreCase("add", arguments.getOperation())) {
            final int result = calculator.add(arguments.getX(), arguments.getY());
            calculator.save(result);
        } else if (StringUtils.equalsIgnoreCase("multiply", arguments.getOperation())) {
            final int result = calculator.multiply(arguments.getX(), arguments.getY());
            calculator.save(result);
        }

        log.info("Exiting application...");
    }

    protected Calculator createCalculator() {
        return new Calculator() {
            @Override
            public int add(int x, int y) {
                return x + y;
            }

            @Override
            public int multiply(int x, int y) {
                throw new UnsupportedOperationException();
            }

            @Override
            public void save(int x) {
                System.out.println("Saving result " + x);
            }
        };
    }
}
