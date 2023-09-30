package alfonslagibelajar.i8n;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import lombok.Builder;
import lombok.NonNull;
import lombok.Value;

@Builder
@Value
public class ApplicationMetadata {
    private final String version;
    private final String commitId;
    private final String commitIdShort;
    private final String branch;
    private final String commitTimestamp;
    private final String buildTimestamp;

    public static ApplicationMetadata fromProperties(Properties props) {
        return ApplicationMetadata.builder()
                .version(props.getProperty("git.build.version"))
                .commitId(props.getProperty("git.commit.id.full"))
                .commitIdShort(props.getProperty("git.commit.id.brief"))
                .branch(props.getProperty("git.branch"))
                .commitTimestamp(props.getProperty("git.commit.time"))
                .buildTimestamp(props.getProperty("git.build.time"))
                .build();
    }

    public static ApplicationMetadata fromInputStream(final @NonNull InputStream is) throws IOException {
        final Properties props = new Properties();
        props.load(is);
        return fromProperties(props);
    }

    public static ApplicationMetadata fromResource(final @NonNull String resourceName) throws IOException {
        try(InputStream is = ApplicationMetadata.class.getResourceAsStream(resourceName)) {
            return fromInputStream(is);
        }
    }
}
