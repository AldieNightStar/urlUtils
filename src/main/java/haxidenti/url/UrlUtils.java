package haxidenti.url;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

public class UrlUtils {

    public static String withParams(String url, Map<String, String> params) {
        StringBuffer resultedParamString = new StringBuffer();
        AtomicBoolean isFirst = new AtomicBoolean(true);

        resultedParamString.append("?");
        params.forEach((k, v) -> {
            if (!isFirst.getAndSet(false)) resultedParamString.append("&"); // First time not called
            resultedParamString.append(k);
            resultedParamString.append("=");
            resultedParamString.append(v);
        });
        return url + resultedParamString;
    }
}
