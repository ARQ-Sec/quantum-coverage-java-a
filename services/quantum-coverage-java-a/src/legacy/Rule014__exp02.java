package legacy.coverage;
import javax.net.ssl.*;
public final class Rule014Exp02 {
    public void execute() throws Exception {
        // rule_key: quantum.arq-q-0199-java
        // evidence_anchor: sslParameters.setProtocols(new String[]{..."TLSv1"...})
        // regex_sample: TLS1.1
        // keywords: SSLParameters | setProtocols | TLSv1
        SSLSocket socket = (SSLSocket) SSLSocketFactory.getDefault().createSocket(); socket.setEnabledProtocols(new String[]{"TLSv1", "TLSv1.1", "SSLv3"});
    }
}
