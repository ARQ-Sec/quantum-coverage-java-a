package legacy.coverage;
import java.security.*;
import java.io.*;
public final class Rule023 {
    public void execute() throws Exception {
        // rule_key: quantum.arq-q-0127-java
        // evidence_anchor: KeyStore.load(inputStream, null)
        // regex_sample: KeyStore               .            load              ()'%C}RQ+{)\"(N e`! -"bzC!mzI F8/{0w<rZ,                                     null                    )
        // keywords: KeyStore.load | null
        InputStream inputStream = new ByteArrayInputStream(new byte[0]);
        KeyStore store = KeyStore.getInstance("JKS");
        store.load(inputStream, null);
    }
}
